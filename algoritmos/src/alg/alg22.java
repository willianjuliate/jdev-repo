package alg;

import java.util.Scanner;

public class alg22 {
	public static void main(String[] args) {
		/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:volume = 3.14159 * R2 * altura.*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("digite a altura da lata: ");
		double altura = sc.nextDouble();
		
		System.out.print("digite o raio da lata: ");
		double raio = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		System.out.printf("volume da lata e = %.2f", volume);
		sc.close();
	}

}
