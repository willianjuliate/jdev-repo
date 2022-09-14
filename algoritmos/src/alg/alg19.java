package alg;

import java.util.Scanner;

public class alg19 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double raio, perimetro, area;
		
		System.out.print("digite o numero do raio: ");
		raio = sc.nextDouble();		
		perimetro = 2 * Math.PI * raio;
		area = Math.PI  * (raio*raio);
		System.out.println("Perimetro: "+ perimetro);
		System.out.println("Area: "+ area);
		
		sc.close();

	}

}
