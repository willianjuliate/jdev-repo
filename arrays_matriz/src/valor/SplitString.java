package valor;

import java.util.List;
import java.util.Arrays;

/**
 *
 * @author willian
 */
public class SplitString {

    public static void main(String[] args) {
        String text = "Willian, curso Java, 80, 70, 80, 90, 89";
        String[] split = text.split(",");

        /*for(int i = 0; i < split.length; i++) {
            System.out.println(split[i].trim());
        }*/
 /* Convertendo um Array em List*/
        List<String> list = Arrays.asList(split); // Responsável por converter Array em Lista

        for (String ll : list) {
            System.out.println(ll.trim());
        }
        
        /*Convertendo uma lista para Array*/
        String[] convertArray = list.toArray(new String[7]);// Responsável por converter List em Array
        for (String string : convertArray) {
            System.out.println(string.trim());            
        }
    }
}
