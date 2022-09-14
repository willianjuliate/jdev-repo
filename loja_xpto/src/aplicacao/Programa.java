package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Produto;
import entidades.ProdutoImportado;
import entidades.ProdutoUsado;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Produto> produtos = new ArrayList<>();

		System.out.print("Entre com o numero de produtos: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Dados do #%d produto\n", i);
			System.out.print("Comum, usado ou importado (c / u / i)? ");
			sc.nextLine();
			char opc = sc.nextLine().toLowerCase().charAt(0);
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			
			System.out.print("Preço: R$");
			double preco = sc.nextDouble();			
			
                    switch (opc) {
                        case 'c' -> produtos.add(new Produto(nome, preco));
                        case 'u' -> {
                            System.out.print("Data de fabricação (DD/MM/YYYY): ");
                            sc.nextLine();
                            String data = sc.nextLine();
                            produtos.add(new ProdutoUsado(nome, preco,
                                    LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"))));
                        }
                        case 'i' -> {
                            System.out.print("Custos de importação: R$");
                            double custos = sc.nextDouble();
                            produtos.add(new ProdutoImportado(nome, preco, custos));
                        }
                        default -> {
                        }
                    }
		}
		
		System.out.println("\nETIQUETAS:");
		for(Produto produto: produtos) {
			System.out.println(produto.precoEtiqueta());
		}
		
		sc.close();
	}
}
