package alg;

import java.util.Scanner;

public class alg21 {
	/*Entrar com os lados a, b, c de um paralelepípedo. Calcular e imprimir a diagonal*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("entre com a base: ");
		double a = sc.nextDouble();
		
		System.out.print("entre com a altura: ");
		double b = sc.nextDouble();
		
		System.out.print("entre com a profundidade: ");
		double c = sc.nextDouble();
		
		double diagonal = Math.sqrt(a * a + b * b + c * c);
		System.out.printf("diagonal: %.2f\n", diagonal);
		
		sc.close();
	}

}
