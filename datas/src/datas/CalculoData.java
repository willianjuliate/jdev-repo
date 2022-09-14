package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author willian
 */
public class CalculoData {
    public static void main(String[] args) throws ParseException {
        Calendar calendar = Calendar.getInstance();        
        //calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-05-1993")); 
        
        calendar.add(Calendar.DAY_OF_MONTH, 1);        
        System.out.println("Somando o dia do mes: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        
        calendar.add(Calendar.MONTH, 3);        
        System.out.println("Somando o mes: "+new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        
        
    }
    
}
