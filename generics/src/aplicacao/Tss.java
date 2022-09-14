/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicacao;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author willian
 */
public class Tss {

    public static void main(String[] args) { // Princípio get/put - covariância
        /*List<Integer> intList = new ArrayList<>();
        intList.add(10);
        intList.add(5);
        List<? extends Number> list = intList;
        Number x = list.get(0);
        System.out.println(x);
        //list.add(20); // err

        List<Object> myObjs = new ArrayList<Object>();
        myObjs.add("Maria");
        myObjs.add("Alex");
        List<? super Number> myNums = myObjs;
        myNums.add(10);
        myNums.add(3.14);*/

        // Number x = myNums.get(0); Err
        /*List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<String> myStr = Arrays.asList("Willian", "Juliate");
        
        List<Object> myObjs = new ArrayList<Object>();
        
        copy(myInts, myObjs);        
        printList(myObjs);
        
        copy(myDoubles, myObjs);
        printList(myObjs);       
        
        copy_str(myStr, myObjs);
        printList(myObjs);*/
        
        //Set<String> conjunto = new HashSet<>(); // Não Garante a ordem dos elementos
        //Set<String> conjunto = new LinkedHashSet<>(); // Mantem as ordem dos elementos
        Set<String> conjunto = new TreeSet<>(); // Os elementos são ordenados
        
        conjunto.add("Notebook");
        conjunto.add("Tv");
        conjunto.add("Tablet");
        
        System.out.println(conjunto.contains("Tv"));
        conjunto.removeIf(x -> x.charAt(0) == 'T');
        
        
        
        for (String prod : conjunto) {
            System.out.println(prod);
        }
        
    }
    
    public static void copy(List<? extends Number> sorce, List<? super Number> destiny) {
        for (Number ob : sorce) {
            destiny.add(ob);
        }
    }
    
    public static void copy_str(List<? extends String> sorce, List<? super String> destiny) {
        for (String ob : sorce) {
            destiny.add(ob);
        }
    }
    
    public static void printList(List<?> list) {
        for (Object object : list) {
            System.out.print(object + " ");
        }
        System.out.println();
    } 


}
