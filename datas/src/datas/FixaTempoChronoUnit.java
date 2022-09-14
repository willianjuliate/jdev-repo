package datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author willian
 */
public class FixaTempoChronoUnit {
    public static void main(String[] args) throws ParseException {
        long dias = ChronoUnit.MONTHS.between(LocalDate.parse("1993-05-10"), LocalDate.now()); 
        // -> Total de dias de uma data ate o dia presente
        
        System.out.println("Possuí "+ dias + " meses entre a feixa de data!");
    }
    
}
