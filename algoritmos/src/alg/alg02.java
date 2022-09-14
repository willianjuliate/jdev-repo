/* ALGORITMO 36 */
package alg;

import java.util.Scanner;

public class alg02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome, endereco, telefone;
        System.out.print("Entre com o Nome: ");
        nome = scanner.nextLine();

        System.out.print("Entre com o Telefone: ");
        endereco = scanner.nextLine();

        System.out.print("Entre com o Endereco: ");
        telefone = scanner.nextLine();

        System.out.println("NOME: "+nome);
        System.out.println("TELEFONE: "+telefone);
        System.out.println("ENDERECO: "+endereco);


        scanner.close();
    }
}
