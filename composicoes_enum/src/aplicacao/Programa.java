package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Departamento;
import entidades.HoraContrato;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalho;

public class Programa {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	
		System.out.print("Entre com os nomes dos departamentos.: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String trabalhadorNome = sc.nextLine();
		System.out.print("Nivel: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Base salárial: ");
		double baseSalarial = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(trabalhadorNome, 
				NivelTrabalho.valueOf(nivelTrabalhador), baseSalarial, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos esse trabalhador tem? ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {			
			System.out.println("Entre com o contrato #"+ i +" data: ");
			sc.nextLine();
			System.out.print("Data (DD/MM/YYYY): ");
			LocalDate dataContrato = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("Duração por (hora): ");
			int hora = sc.nextInt();
			
			HoraContrato contrato = new HoraContrato(dataContrato, valorPorHora, hora);
			trabalhador.adicionaContrato(contrato);
		}
		
		System.out.println("------------------------------##-----------------------------");
		System.out.print("Entre com o mês e ano para calcular a renda (MM/YYYY): ");
		String mesAno = sc.next();
		
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));
		System.out.println("Nome: "+ trabalhador.getName());
		System.out.println("Departamento: "+ trabalhador.getDepartamento().getNome());
		System.out.println("Renda de: "+ mesAno + ": "+ String.format("R$%.2f", trabalhador.renda(mes, ano)));
		
		
		sc.close();
	}
}
