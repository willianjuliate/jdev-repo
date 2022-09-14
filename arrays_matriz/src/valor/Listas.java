/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package valor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author willian
 */
public class Listas {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Willian");
        list.add("Marcos");
        list.add("Marcio");
        list.add("Julia");
        list.add("Juliana");
        list.add("Ana");
        list.add("Amanda");
        list.add("Paula");
        list.add("Pedrita");
        list.add("Willson");

        for (String n : list) {
            System.out.println(n);
        }
        System.out.println("-------------------------------");
        list.add(4, "Pedro");
        list.add(5, "Paulo");

        for (String n : list) {
            System.out.println(n);
        }
        System.out.println("-------------------------------");
        list.remove("Willian");
        for (String n : list) {
            System.out.println(n);
        }
        System.out.println("-------------------------------");
        list.removeIf(x -> x.charAt(0) == 'J'); // Lambda
        for (String n : list) {
            System.out.println(n);
        }

        System.out.println("-------------------------------");
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Index of Paulo: " + list.indexOf("Paulo"));
        // Quando o indexOf não encontra o elemente ele retorna -1

        System.out.println("-------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'P')
                .collect(Collectors.toList());
        // Filtrando a List para ter apenas pessoas com a letra P

        for (String r : result) {
            System.out.println(r);
        }

        System.out.println("-------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'A')
                .findFirst().orElse(null);
        System.out.println(name);
    }

}
