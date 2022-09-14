//package leitura_escrita_arquivos;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//
//public class ApachePoiLeitura {
//	public static void main(String[] args) throws IOException {
//		FileInputStream entrada = new FileInputStream(
//				new File("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\arquivo.xls"));
//		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada); /*Prepara a entrada do arquivo execel*/
//		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
//		
//		Iterator<Row> linhaIterator = planilha.iterator();
//		List<Pessoa> pessoas = new ArrayList<>();
//		
//		while(linhaIterator.hasNext()) { /*Enquanto tiver linha no arquivo do execel*/
//			Row linha = linhaIterator.next();
//			Iterator<Cell> celulas = linha.iterator(); 
//			Pessoa pessoa = new Pessoa();
//			
//			while(celulas.hasNext()) { /*Enquanto tiver celulas na linha do execel*/
//				Cell celula = celulas.next();				
//				switch (celula.getColumnIndex()) {
//				case 0 -> pessoa.setNome(celula.getStringCellValue());
//				case 1 -> pessoa.setEmail(celula.getStringCellValue());
//				case 2 -> pessoa.setIdade(Double.valueOf(celula.getNumericCellValue()).intValue());
//				}
//			}
//			
//			pessoas.add(pessoa);
//			
//		}
//		entrada.close();
//		hssfWorkbook.close();
//		
//		for(Pessoa pessoa: pessoas) {
//			System.out.println(pessoa);
//		}
//		
//	}
//}
