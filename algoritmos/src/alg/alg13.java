/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alg;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author willian
 */
public class alg13 {

    public static void main(String[] args) {
        double saldo, nsaldo;
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o saldo: ");
            saldo = scanner.nextDouble();

            nsaldo = reajuste(1.01, saldo);

            System.out.println("novo saldo: " + nsaldo);
        } catch (InputMismatchException err) {
            System.out.println("valor tipo incompátivel, usar apenas tipos númericos.");
        }

    }

    public static double reajuste(double percent, double saldo) throws InputMismatchException {
        return saldo * percent;
    }
}
