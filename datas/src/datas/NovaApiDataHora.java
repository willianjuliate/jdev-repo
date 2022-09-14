package datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author willian
 */
public class NovaApiDataHora {
    public static void main(String[] args) {
        LocalDate dateTime = LocalDate.now();
        System.out.println("Dada atual: "+ dateTime);
        
        LocalTime localTime = LocalTime.now();
        System.out.println("Hora atual: "+ localTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
        
        LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
        System.out.println("Data e hora atual: "+ dataAtualHoraAtual.
                format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        
        
    }
}
