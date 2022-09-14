package aplicacao;

import java.util.Scanner;
import servicos.BrazilInterestService;
import servicos.InterestService;

/**
 *
 * @author willian
 */
public class Programa {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Amount: ");
            double amount = sc.nextDouble();
            System.out.print("Months: ");
            int months = sc.nextInt();
            
            InterestService is = new BrazilInterestService(2.0);
            double payment = is.payment(amount, months);
            
            System.out.println("Payment after " + months + " months:");
            System.out.println(String.format("%.2f", payment));
        }
    }
}
