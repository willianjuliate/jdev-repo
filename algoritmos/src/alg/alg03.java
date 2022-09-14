/* ALGORITMO 37 */
package alg;

import java.util.Scanner;

public class alg03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, soma;

        System.out.print("\nentre com um numero: ");
        num1 = scanner.nextInt();
        
        System.out.print("\nentre com outro numero: ");
        num2 = scanner.nextInt();

        soma = num1 + num2;

        System.out.print("\nSoma: "+soma);

        scanner.close();
    }
}
