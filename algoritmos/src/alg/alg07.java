package alg;

import java.util.Scanner;

/*  algoritmo 40 */
public class alg07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quoc, rest, val1, val2;

        System.out.print("entre com dividendo: ");
        val1 = sc.nextInt();

        System.out.print("entre com divisor: ");
        val2 = sc.nextInt();

        quoc = val1 / val2;
        rest = val1 % val2;
        
        System.out.println("dividendo : "+val1);
        System.out.println("divisor   : "+val2);
        System.out.println("quociente : "+quoc);
        System.out.println("resto     : "+rest);

        sc.close();

    }
}
