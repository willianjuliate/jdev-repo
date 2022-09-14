package alg;

import java.util.Scanner;

public class alg08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, d, mp;

        System.out.print("entre com 1 numero: ");
        a = scanner.nextInt();
        System.out.print("entre com 2 numero: ");
        b = scanner.nextInt();
        System.out.print("entre com 3 numero: ");
        c = scanner.nextInt();
        System.out.print("entre com 4 numero: ");
        d = scanner.nextInt();

        mp = (a*1 + b*2 + c*3 + d*4)/10;

        System.out.printf("\nmedia ponderada: %.2f", mp);

        scanner.close();
    }
}