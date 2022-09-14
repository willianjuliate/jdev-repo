package aplicacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import modelo.entidades.Contrato;
import modelo.entidades.Parcela;
import modelo.servico.ContratoServico;
import modelo.servico.ServicoPayPal;

/**
 *
 * @author willian
 */
public class Programa {

    public static void main(String[] args) {     
        
        try (Scanner sc = new Scanner(System.in)) {
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            
            System.out.println("Enter contract data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            
            System.out.print("Date (dd/MM/yyyy): ");
            LocalDate date = LocalDate.parse(sc.next(), dtf);
            
            System.out.print("Contract value: ");
            double totalValue = sc.nextDouble();
            
            Contrato contract = new Contrato(number, date, totalValue);
            
            System.out.print("Enter number of installments: ");
            int n = sc.nextInt();
            
            ContratoServico contractService = new ContratoServico(new ServicoPayPal());
            
            contractService.processamentoContrato(contract, n);
            
            System.out.println("Installments:");
            for (Parcela x : contract.getParcela()) {
                System.out.println(x);
            }
        }
        catch (Exception err) {
            System.out.println("Err: "+err.getMessage());
        }
    }
}
