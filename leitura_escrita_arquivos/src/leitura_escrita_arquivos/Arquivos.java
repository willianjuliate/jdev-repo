package leitura_escrita_arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivos {
	public static void main(String[] args) throws IOException {
		
		Pessoa p1 = new Pessoa(), p2 = new Pessoa(), p3 = new Pessoa();		
		
		p1.setNome("Marscu Souza");
		p1.setIdade(25);
		p1.setEmail("aluno@email.com");
		
		p2.setNome("Francissco Romano");
		p2.setIdade(28);
		p2.setEmail("aluno@email.com");
		
		p3.setNome("Pedro Julios");
		p3.setIdade(31);
		p3.setEmail("aluno@email.com");
		
		/*Pode vir do banco de dados ou qualquer fonte de dados*/
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		/*-----------------------------------------------------*/
		
		File arquivo = new File("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\arquivo.csv");
		
		if(!arquivo.exists()) {
			arquivo.createNewFile();
		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		
		for(Pessoa pessoa: pessoas) {
			escrever_no_arquivo.write(String.format("%s;%s;%d\n",
					pessoa.getNome(), pessoa.getEmail(), pessoa.getIdade()));
		}
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}
}
