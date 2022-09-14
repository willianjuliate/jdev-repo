package alg;

import java.util.Scanner;

public class alg17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome;
		int n;
		
		System.out.print("entre com o nome:: ");
		nome = sc.nextLine();
		System.out.printf("todo nome:: %s\n", nome);
		System.out.printf("primeiro caractere:: %s\n", nome.charAt(0));
		System.out.printf("ultimo caractere:: %s\n", nome.charAt(nome.length()-1));
		System.out.printf("primeiro ao terceiro caractere:: %s\n", nome.substring(0, 3));
		System.out.printf("quarto caractere:: %s\n", nome.charAt(3));
		System.out.printf("todos menos o primeiro:: %s\n", nome.substring(1, nome.length()));
		n = nome.length() - 2;
		System.out.printf("os dois ultimos:: %s\n", nome.substring(n, nome.length()));
		
		sc.close();
	}

}
