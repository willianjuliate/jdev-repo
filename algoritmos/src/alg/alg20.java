package alg;

import java.util.Scanner;

public class alg20 {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrar com o lado de um quadrado!");
		
		System.out.print("digite o lado do quadrado: ");
		double lado = sc.nextDouble();
		double perimetro = 4 * lado;
		double area = lado * lado;
		double diagonal = lado * Math.sqrt(2);
		
		System.out.println("perimetro: "+ perimetro);
		System.out.println("area: "+ area);
		System.out.println("diagonal: "+ diagonal);		
		sc.close();
	}

}
