package datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author willian
 */
public class DiaMesAnoLocalDate {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.now();
        System.out.println("Data Atual: "+ localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("Dia da Semana: "+localDate.getDayOfWeek().name());
        System.out.println("Dia do Mês: "+localDate.getDayOfMonth());
        System.out.println("Dia do Ano: "+localDate.getDayOfYear());
        
        System.out.println("Nome do Mes: "+localDate.getMonth());
        
    }
    
}
