//package leitura_escrita_arquivos;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.Iterator;
//
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.ss.usermodel.Row;
//
//public class EditandoArquivo2XLS {
//	public static void main(String[] args) throws IOException {
//		File file = new File("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\arquivo.xls");
//		FileInputStream entrada = new FileInputStream(file);
//		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
//		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
//		
//		Iterator<Row> linhaIterator = planilha.iterator();
//		while(linhaIterator.hasNext()) {
//			Row linha = linhaIterator.next();			
//			String valorCelula = linha.getCell(0).getStringCellValue();			
//			linha.getCell(0).setCellValue(valorCelula +" * Valor Gravado na aula ");
//		}
//		
//		entrada.close();
//		FileOutputStream saida = new FileOutputStream(file);
//		hssfWorkbook.write(saida);
//		saida.flush();
//		saida.close();
//		hssfWorkbook.close();
//		
//		System.out.println("Planilha alterada com sucesso!");
//	}
//
//}
