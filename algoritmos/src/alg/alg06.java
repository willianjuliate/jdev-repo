/* ALGORITMO 40 */
package alg;

import java.util.Scanner;

public class alg06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float nota1, nota2, nota3, media;

        System.out.print("digite a 1a nota: ");
        nota1 = scanner.nextFloat();

        System.out.print("digite a 2a nota: ");
        nota2 = scanner.nextFloat();

        System.out.print("digite a 3a nota: ");
        nota3 = scanner.nextFloat();

        media = (nota1 + nota2 + nota3) / 3;

        System.out.printf("media: %.2f", media);


        scanner.close();

    }
}
