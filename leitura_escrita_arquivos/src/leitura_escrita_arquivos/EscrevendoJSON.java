//package leitura_escrita_arquivos;
//
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//
//public class EscrevendoJSON {
//	public static void main(String[] args) throws IOException {
//		
//		Usuario usr01 = new Usuario();
//		usr01.setCpf("45659659856");
//		usr01.setLogin("Roosterhk");
//		usr01.setSenha("5665");
//		usr01.setNome("Jhon Rooster");
//		
//		Usuario usr02 = new Usuario();
//		usr02.setCpf("78799856998");
//		usr02.setLogin("Bear");
//		usr02.setSenha("5665");
//		usr02.setNome("Alex Bear");
//		
//		List<Usuario> usrs = new ArrayList<>();
//		usrs.add(usr01);
//		usrs.add(usr02);
//		
//		Gson gson = new GsonBuilder().setPrettyPrinting().create();
//		String jsonUsr = gson.toJson(usrs);
//		
//		System.out.println(jsonUsr);
//		
//		FileWriter fileWriter = new FileWriter("E:\\estudos\\java\\leitura_escrita_arquivos\\src\\leitura_escrita_arquivos\\file.json");
//		fileWriter.write(jsonUsr);
//		fileWriter.flush();
//		fileWriter.close();
//		
//	}
//
//}
