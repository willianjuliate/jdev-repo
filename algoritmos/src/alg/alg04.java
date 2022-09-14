/* ALGORITMO 38 */
package alg;

import java.util.Scanner;

public class alg04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, prod;

        System.out.print("\nentre com um numero: ");
        num1 = scanner.nextInt();
        
        System.out.print("\nentre com outro numero: ");
        num2 = scanner.nextInt();

        prod = num1 * num2;

        System.out.print("\nproduto: "+prod);

        scanner.close();
    }
}
