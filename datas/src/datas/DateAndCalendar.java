package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author willian
 */
public class DateAndCalendar {

    /**
     * @param args the command line arguments     * 
     * @throws java.text.ParseException 
     */
    @SuppressWarnings("deprecation")
	public static void main(String[] args) throws ParseException {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        
        
        System.out.println("Data em milisegundos: "+date.getTime());        
        System.out.println("Calendar data em milisegundos: "+ calendar.getTimeInMillis());
        
        
        System.out.println("Dia do mês: "+date.getDate());
        System.out.println("Calendar dia do mês: "+ calendar.get(Calendar.DAY_OF_MONTH));        
        
        System.out.println("Dia da semana: "+date.getDay());
        System.out.println("Calendar da semana: "+ calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("Hora do dia: "+date.getHours());
        System.out.println("Calendar hora do dia: "+ calendar.get(Calendar.HOUR_OF_DAY));
         
        System.out.println("Minuto da hora: "+date.getMinutes());
        System.out.println("Calendar minuto do dia: "+ calendar.get(Calendar.MINUTE));
        
        System.out.println("Segundo do minuto: "+date.getSeconds());
        System.out.println("Calendar segundos do minuto: "+ calendar.get(Calendar.SECOND));
        
        System.out.println("Ano: "+(date.getYear() + 1900));
        System.out.println("Calendar Ano: "+ calendar.get(Calendar.YEAR));

        
        //--------------Simple date Format-----------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
        System.out.println("Data atual em formato padrão e String: "+simpleDateFormat.format(date));        
        System.out.println("Calendar Data atual em formato padrão e String: "+simpleDateFormat.format(calendar.getTime()));
        
        
        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
        System.out.println("Data em formato para banco de dados: "+simpleDateFormat.format(date));   
        System.out.println("Calendar Data em formato para banco de dados: "+simpleDateFormat.format(calendar.getTime()));
        
        System.out.println("Obejto Date: "+simpleDateFormat.parse("1993-05-10 20:45.1"));
        
    }
    
}