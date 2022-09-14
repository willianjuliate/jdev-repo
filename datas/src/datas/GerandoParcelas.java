package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author willian
 */
public class GerandoParcelas {

    public static void main(String[] args) throws ParseException {
        Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("24/08/2022");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dataInicial);
        
        for (int i = 1; i <= 10; i++) {
            calendar.add(Calendar.MONTH, 1);            
            System.out.println("Parcelas número: " + i + " vencimento é em: " + 
                    new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
        
    }
    
}
