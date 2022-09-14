package leitura_escrita_arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivoTxt {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream(
				new File("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\arquivo.csv"));

		Scanner ler = new Scanner(entradaArquivo, "UTF-8");
		List<Pessoa> pessoas = new ArrayList<>();

		while (ler.hasNext()) {
			String linha = ler.nextLine();
			if (linha != null && !linha.isEmpty()) {
				String[] dados = linha.split("\\;");
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				pessoas.add(pessoa);
			}		
		}
		
		for(Pessoa pessoa: pessoas) {
			System.out.println(pessoa);
		}
		
		ler.close();
	}

}
