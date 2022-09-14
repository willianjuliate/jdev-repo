//package leitura_escrita_arquivos;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//
//public class ApachePoiEscrevendoLendo {
//
//	public static void main(String[] args) throws IOException {
//		File file = new File("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\arquivo.xls");
//
//		if (!file.exists()) {
//			file.createNewFile();
//		}
//
//		Pessoa p1 = new Pessoa(), p2 = new Pessoa(), p3 = new Pessoa();
//
//		p1.setNome("Marscu Souza");
//		p1.setIdade(25);
//		p1.setEmail("aluno@email.com");
//
//		p2.setNome("Francissco Romano");
//		p2.setIdade(28);
//		p2.setEmail("aluno@email.com");
//
//		p3.setNome("Pedro Julios");
//		p3.setIdade(31);
//		p3.setEmail("aluno@email.com");
//
//		/* Pode vir do banco de dados ou qualquer fonte de dados */
//		List<Pessoa> pessoas = new ArrayList<>();
//		pessoas.add(p1);
//		pessoas.add(p2);
//		pessoas.add(p3);
//		
//		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();
//		HSSFSheet linhasPessoas = hssfWorkbook.createSheet("Planilha de pessoas Jdev Treinamentos"); /*Criar planilha*/
//		
//		int numeroLinha= 0;
//		for (Pessoa pessoa: pessoas) {
//			Row linha = linhasPessoas.createRow(numeroLinha++); /*Criando a linha na planilha*/
//			int celula = 0;
//			
//			Cell celNome = linha.createCell(celula++);
//			celNome.setCellValue(pessoa.getNome());
//			
//			Cell celEmail = linha.createCell(celula++);
//			celEmail.setCellValue(pessoa.getEmail());
//			
//			Cell celIdade = linha.createCell(celula++);
//			celIdade.setCellValue(pessoa.getIdade());
//			
//		} /*Termino de montar a planilha*/
//		
//		FileOutputStream saida = new FileOutputStream(file);
//		hssfWorkbook.write(saida);
//		saida.flush();
//		saida.close();
//		hssfWorkbook.close();
//		
//		System.out.println("Planilha criada!");
//		
//	}
//
//}
