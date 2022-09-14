package aplicacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entidades.Produto;

public class Programa {
	public static void main(String[] args) {
		String path = "C:\\tmp";
				
		List<Produto> produtos = new ArrayList<>();
				
		try (BufferedReader buffr = new BufferedReader(new FileReader(path + "\\file.csv"))) {
			String line = buffr.readLine();			
			while(line != null) {		
				Produto produto = new Produto(line.split(",")[0], Double.parseDouble(line.split(",")[1]), Integer.parseInt(line.split(",")[2]));				
				produtos.add(produto);
				line = buffr.readLine();	
			}
			
			boolean dir = new File(path + "\\out").mkdir();
			
			BufferedWriter buffw = new BufferedWriter(new FileWriter(path + "\\out\\summary.csv"));			
			
			for(Produto produto: produtos) {
				if (dir) {
					buffw.write(produto.toString());
					buffw.newLine();
				}
				System.out.println(produto);
			}
			buffw.close();
			
		}
		catch (IOException err) {
			System.out.println("Err: "+ err.getMessage());
		}	
		
	}
}
