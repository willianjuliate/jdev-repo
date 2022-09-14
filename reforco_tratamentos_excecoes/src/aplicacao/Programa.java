package aplicacao;

import java.util.Scanner;

import modelo.entidades.Account;
import modelo.excecao.DomainException;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Entre com os dados da conta");
			System.out.print("Numero: ");
			int numero = sc.nextInt();			
			System.out.print("Titular: ");
			sc.nextLine(); // Resto dos caracteres!
			String titular = sc.nextLine();
			System.out.print("Saldo inicial: ");			
			double saldo = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limite = sc.nextDouble();

			Account conta = new Account(numero, titular, limite);
			conta.depositar(saldo);

			System.out.print("Insira o valor para saque: R$");
			conta.sacar(sc.nextDouble());
			
			System.out.println("Novo saldo: "+conta.getSaldo());

			sc.close();
		} 
		catch (DomainException err) {
			System.out.println("Erro de saque: " + err.getMessage());
		}
		catch (RuntimeException err) {
			System.out.println("Erro inesperado!");
		}
	}
}
