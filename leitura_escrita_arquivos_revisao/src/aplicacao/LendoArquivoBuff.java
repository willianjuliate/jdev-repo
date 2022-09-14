package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LendoArquivoBuff {
	public static void main(String[] args) {
		String path = "C:\\tmp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {			
			
			String line = br.readLine();			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		} catch (IOException err) {
			System.out.println("Err: "+ err.getMessage());
		}		
	}

}
