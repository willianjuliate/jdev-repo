package aplicacao;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import services.CalculationService;

/**
 *
 * @author willian
 */
public class Programa {

    public static void main(String[] args) {
        /*try ( Scanner sc = new Scanner(System.in)) {
            PrintServer<Integer> ps = new PrintServer<>();
            System.out.print("How many values? ");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                Integer value = sc.nextInt();
                ps.addValue(value);
            }
            ps.print();
            Integer x = ps.first();
            System.out.println("First: " + x);
        }*/
        List<Product> list = new ArrayList<>();

		String path = "C:\\temp\\in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.valueOf(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.println("Most expensive:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 

    }
}
