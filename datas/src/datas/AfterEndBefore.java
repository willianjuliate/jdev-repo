package datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author willian
 */
public class AfterEndBefore {

    public static void main(String[] args) throws ParseException {
        Date emissao = new SimpleDateFormat("dd/MM/yyyy").parse("23/08/2022");
        Date vencimento = new SimpleDateFormat("dd/MM/yyyy").parse("20/09/2022");

        System.out.println(emissao.after(vencimento) ? "x" : "y"); 
        // verifica se emissao é maior que vencimento
        System.out.println(emissao.before(vencimento) ? "y" : "x"); 
        // verifica se emissao é menor que vencimento  
    }
}
