package condicionais;

public class ForEstrutura {
	public static void main(String[] args) {
		/*for (int numero = 0; numero <= 10; numero++) {
			System.out.println(numero);
		}
		for (int numero = 10; numero >= 0; numero--) {
			System.out.println(numero);
			if (numero == 3) break; // For com break
		}*/
		for (int numero = 0; numero <= 10; numero++) {
			if(numero == 4 || numero == 6 || numero == 9) {
				System.out.println(numero+ " <-");
				continue; // For com continue
			}
			System.out.println(numero);
		}
	}
}
