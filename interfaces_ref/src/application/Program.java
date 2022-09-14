package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import modelo.entities.AluguelCarro;
import modelo.entities.Veiculo;
import modelo.services.BrasilTaxServico;
import modelo.services.ServicoAluguel;

/**
 *
 * @author willian
 */
public class Program {
    
    
    public static void main(String[] args) throws ParseException {        
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Entre com os dados do aluguel");
            System.out.print("Modelo do Carro: ");
            String carModel = sc.nextLine();
            
            System.out.print("Pickup (dd/mm/yyyy hh:ss): ");
            Date start = sdf.parse(sc.nextLine());
            
            System.out.print("Return (dd/mm/yyyy hh:ss): ");
            Date finish = sdf.parse(sc.nextLine());
            AluguelCarro cr = new AluguelCarro(start, finish, new Veiculo(carModel));
            
            System.out.print("Entre com preço por hora: ");
            double pricePerHour = sc.nextDouble();
            
            System.out.print("Entre com preço por dia: ");
            double pricePerDay = sc.nextDouble();
            
            ServicoAluguel rs = new ServicoAluguel(pricePerDay, pricePerHour, new BrasilTaxServico()); // Injeção de dependência
            rs.processarFatura(cr);
            
            System.out.println("FATURA:");
            System.out.println("Pagamento Basico: "+ String.format("%.2f", cr.getFatura().getPagamentoBasico()));
            System.out.println("Taxa: "+ String.format("%.2f", cr.getFatura().getTax()));
            System.out.println("Total pagamento: "+ String.format("%.2f", cr.getFatura().getTotalPagamento()));
            
        }
        
    }
    
}
