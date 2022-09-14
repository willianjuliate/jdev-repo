/* ALGORITMO 39 */
package alg;

import java.util.Scanner;

public class alg05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1;

        System.out.print("\nentre com um numero com ponto: ");
        num1 = scanner.nextFloat(); // Usar vírgula

        System.out.printf("\na terça parte é: %.2f", (num1 / 3));

        scanner.close();
    }
}
