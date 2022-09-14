package exercicios.employess;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author willian
 */
public class Program {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            List<Employees> list = new ArrayList<>();

            System.out.print("How many employees will be registered? ");
            int register = scanner.nextInt();

            for (int i = 0; i < register; i++) {
                System.out.println("Emplyee #" + (i + 1) + ": ");

                System.out.print("Id: ");
                int id = scanner.nextInt();

                /*if (validaID(list, id)) {
                System.err.println("Esse ID já existe!");
                continue;
                }*/
                while (validaID(list, id)) {
                    System.err.print("Id already taken. Try again: ");
                    id = scanner.nextInt();
                }

                System.out.print("Name: ");
                scanner.nextLine();
                String nome = scanner.nextLine();

                System.out.print("Salary: ");
                double salario = scanner.nextDouble();

                list.add(new Employees(id, nome, salario));

            }
            System.out.print("\nEnter the employee id that will have salary increase: ");
            int id = scanner.nextInt();

            Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

            if (emp == null) {
                System.out.println("This id does not exist!\n");

            } else {
                System.out.print("Enter the percentage: ");
                double percentage = scanner.nextDouble();
                emp.setAumentoSalario(percentage);
            }

            System.out.println("\nList of employees:");
            apresentacao(list);
        }

    }

    public static boolean validaID(List<Employees> list, int id) {
        /*for (Employees searchId : listObj) {
            if(id == searchId.getId()) {
                return true;
            }
        }*/
        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null;
    }

    public static void apresentacao(List<Employees> listObj) {
        for (Employees objs : listObj) {
            System.out.println(objs);
        }

    }

}
