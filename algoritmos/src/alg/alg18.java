package alg;

import java.util.Scanner;

public class alg18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double perimetro, area, diagonal, base, altura;
		System.out.print("digite a base: ");
		base = sc.nextDouble();

		System.out.print("digite a altura: ");
		altura = sc.nextDouble();

		perimetro = 2 * (base + altura);
		area = base * altura;
		diagonal = Math.sqrt((altura * altura) + (base * base));
		
		System.out.print("\nperimetro = " + perimetro);
		System.out.print("\narea = " + area);
		System.out.printf("\ndiagonal = %.2f", diagonal); 
		
		sc.close();
		
	}
}
