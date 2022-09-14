package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Circulo;
import entidades.Forma;
import entidades.Retangulo;
import entidades.enums.Cor;

public class Programa {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entre com o numero de formas: ");
		int n = sc.nextInt();
		
		List<Forma> formas = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #"+ i +" data:");
			System.out.print("Retangulo ou circulo (r/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("COR (BLACK/BLUE/RED): ");
			Cor cor = Cor.valueOf(sc.next());
			
			if(ch == 'r') {
				System.out.print("Largura: ");
				double largura = sc.nextDouble();				
				System.out.print("Altura: ");
				double altura = sc.nextDouble();				
				formas.add(new Retangulo(cor, altura, largura));
				
			}
			else {
				System.out.print("Raio: ");
				double raio = sc.nextDouble();
				formas.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println("------------------------------");
		System.out.println("FORMAS AREAS:");
		for(Forma forma: formas) {
			System.out.println(String.format("%.2f", forma.area()));
		}
		sc.close();
		
	}
}
