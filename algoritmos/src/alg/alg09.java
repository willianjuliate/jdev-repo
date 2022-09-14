package alg;

import java.util.Scanner;

public class alg09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double angulo, rang;
        
        System.out.println("digite um angulo em graus");
        angulo = scanner.nextDouble();

        rang = angulo * Math.PI / 180;
        System.out.println("seno: "+ Math.sin(rang));
        System.out.println("co-seno: "+ Math.cos(rang));
        System.out.println("tangente: "+ Math.tan(rang));
        System.out.println("co-secante: "+ (1 / Math.sin(rang)));
        System.out.println("secante: "+ (1 / Math.cos(rang)));
        System.out.println("cotangente: "+ (1 / Math.tan(rang)));
        scanner.close();
    }
}
