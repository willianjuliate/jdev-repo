package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionario;
import entidades.FuncionarioTercerizado;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Funcionario> funcionarios = new ArrayList<>();

		System.out.print("Entre com numero de funcionario? ");
		int nFuncionario = sc.nextInt();

		for (int i = 1; i <= nFuncionario; i++) {
			System.out.printf("Dados do #%d funcionario:\n", i);
			System.out.print("Tercerizado (s/n)? ");
			char ops = sc.next().toLowerCase().charAt(0);			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas: ");
			int hora = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorHora = sc.nextDouble();
			
			if(ops == 's') {
				System.out.print("Custos adicionais: ");
				double custosAdcionais = sc.nextDouble();
				funcionarios.add(new FuncionarioTercerizado(nome, hora, valorHora, custosAdcionais));
			}
			else {
				funcionarios.add(new Funcionario(nome, hora, valorHora));
			}
		}
		
		System.out.println("------------------------");
		System.out.println("PAGAMENTOS");
		for (Funcionario func: funcionarios) {
			System.out.println(func.getName() + " - $"+  String.format("%.2f", func.pagamento()));
		}
		
		sc.close();

	}
}
