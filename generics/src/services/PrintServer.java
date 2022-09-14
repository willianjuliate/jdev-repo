package services;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willian
 * @param <T>
 */
public class PrintServer<T> {

    private final List<T> list = new ArrayList<>();

    public void addValue(T value) {
        list.add(value);
    }
    
    public T first() {
        if (list.isEmpty()) {
            throw new IllegalStateException("Lista Vazia!");
        }
        return list.get(0);
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {       
            System.out.print(list.get(i));            
            if (i != list.size() - 1) 
                System.out.print(", ");
        }
        System.out.println("]");
    }
}