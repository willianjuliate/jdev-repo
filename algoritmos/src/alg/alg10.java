package alg;

import java.util.Scanner;

public class alg10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num, logaritmo;
        System.out.println("entre com o logaritmando: ");
        num = scanner.nextDouble();

        logaritmo = Math.log(num) / Math.log(10);

        System.out.println("logaritmo: "+logaritmo);

        scanner.close();
    }
}
