package alg;

import java.util.Scanner;

public class alg11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num, base, logaritmo;
        
        System.out.println("entre com o logaritmando: ");
        num = sc.nextDouble();
        
        System.out.println("entre com a base: ");
        base = sc.nextDouble();
        
        logaritmo = Math.log(num) / Math.log(base);
        System.out.println("o logaritmo de "+ num+" na base "+base+" e: "+ logaritmo);
        
        sc.close();
        
    }
}