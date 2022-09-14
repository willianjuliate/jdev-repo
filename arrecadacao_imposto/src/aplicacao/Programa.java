package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Pessoa> pessoas = new ArrayList<>();
		
		System.out.print("Insira o número de contribuintes ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Dados do contribuinte nº "+i);			
			System.out.print("Indivíduo ou empresa (i/c)? ");
			char ch = sc.next().charAt(0);			
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();			
			System.out.print("Rendimento anual:");
			double rendimento = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Despesas de saúde: ");
				double despesas = sc.nextDouble();
				pessoas.add(new PessoaFisica(nome, rendimento, despesas));
			}
			else if(ch == 'c') {
				System.out.print("Número de empregados: ");
				int nFuncionario = sc.nextInt();
				pessoas.add(new PessoaJuridica(nome, rendimento, nFuncionario));
			}
		}
		double impostos = 0;
		System.out.println("-------------------------------------------------");
		System.out.println("IMPOSTOS PAGOS:");
		for (Pessoa pessoa: pessoas) {
			System.out.printf("%s: $ %.2f \n", pessoa.getNome(), pessoa.imposto());			
			impostos += pessoa.imposto();
		}
		
		System.out.printf("IMPOSTOS TOTAIS: %.2f\n", impostos);
		
		sc.close();

	}

}
