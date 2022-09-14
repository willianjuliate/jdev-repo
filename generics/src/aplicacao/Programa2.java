package aplicacao;

import entities.Product;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author willian
 */
public class Programa2 {

    public static void main(String[] args) {
        Product p = new Product("PC", 1500.00);
        
        
        List<?> list = Arrays.asList(p, p, p);
        printList(list);

    }

    private static void printList(List<?> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
