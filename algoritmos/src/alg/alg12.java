/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alg;

import java.util.Scanner;

/**
 *
 * @author willian
 */
public class alg12 {
    public static double numero, quad, raizquad;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("digite numero: ");
        numero = scanner.nextDouble();
        
        quad = Math.pow(numero, 2);
        raizquad = Math.sqrt(numero);
        
        System.out.println("numero: " + numero);
        System.out.println("quadrado: "+ quad);
        System.out.println("raiz quadrada: "+raizquad);
        scanner.close();
    }
    
}
