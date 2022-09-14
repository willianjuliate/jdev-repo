//package leitura_escrita_arquivos;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.google.gson.Gson;
//import com.google.gson.JsonArray;
//import com.google.gson.JsonElement;
//import com.google.gson.JsonParser;
//
//public class LendoJSON {
//	public static void main(String[] args) throws IOException {
//		FileReader fileReader = new FileReader("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\file.json");
//		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
//		
//		List<Usuario> usrs = new ArrayList<>();
//		
//		for (JsonElement elementos : jsonArray) {
//			Usuario usr = new Gson().fromJson(elementos, Usuario.class);
//			usrs.add(usr);
//		}
//		
//		System.out.println("Leitura do arquivo Json: "+usrs);
//	}
//
//}
