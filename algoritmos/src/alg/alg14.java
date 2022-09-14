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
public class alg14 {

    public static void main(String[] args) {
        /*
        Entrar com um número no formato CDU e imprimir invertido: UDC. (Exemplo:
        123, sairá 321.) O número deverá ser armazenado em outra variável antes de ser
        impresso
        ------------------------------------
        num -> 123
        c -> (123 / 100) 1,23  # "OBS: int vai truncar os valores após a vírgula";
        d -> (123 % 100 -> '23' / 10) 2,3 # "OBS: int vai truncar os valores após a vírgula";
        u -> (123 % 10) 3
        u * 100 + d * 10 + c -> 321
        -----------------------------------*/
        int num, c, d, u, num1;

        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.println("entre com um numero de 3 dígitos: ");

            num = scanner.nextInt();

            c = num / 100;
            d = num % 100 / 10;
            u = num % 10;

            num1 = u * 100 + d * 10 + c;

            System.out.println("número: " + num);
            System.out.println("invertido: " + num1);

            scanner.close();
        } catch (Exception err) {
            System.out.println("Numero incompátivel! Por favor nçao use caracteres!");
        }

    }
}
