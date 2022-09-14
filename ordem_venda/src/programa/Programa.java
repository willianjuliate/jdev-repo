package programa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Ordem;
import entidades.OrdemItem;
import entidades.Produto;
import entidades.enums.OrdemStatus;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com dados do cliente: ");

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("E-mail: ");
		String email = sc.nextLine();

		System.out.print("Data de aniversário (DD/MM/YYYY): ");
		String dataAniversario = sc.nextLine();

		System.out.println("Entre com os dados do pedido: ");
		System.out.print("Status: ");
		String status = sc.nextLine();

		Ordem ordem = new Ordem(LocalDateTime.now(), OrdemStatus.valueOf(status),
				new Cliente(nome, email, LocalDate.parse(dataAniversario, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));

		System.out.print("Quantos itens para este pedido? ");
		int quantidade = sc.nextInt();

		for (int i = 1; i <= quantidade; i++) {			
			System.out.printf("Entre coms os dados do #%da item\n", i);
			sc.nextLine();
			System.out.print("Nome do produto: ");
			String nomeProd = sc.nextLine();
			
			System.out.print("Preço do produto: ");
			double precoProd = sc.nextDouble();
			
			System.out.print("Quantidade: ");
			int qtd = sc.nextInt();			
			OrdemItem ordemItem = new OrdemItem(qtd, precoProd, new Produto(nomeProd, precoProd));
			ordem.adicionaItem(ordemItem);	
		}
		
		System.out.println(ordem);

		sc.close();
	}
}
