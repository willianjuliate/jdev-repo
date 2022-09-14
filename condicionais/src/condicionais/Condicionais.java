package condicionais;

public class Condicionais {
	public static void main(String[] args) {
		double nota1 = 8, nota2 = 5.9, nota3 = 4.8;
		double media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7.0) {
			System.out.printf("# APROVADO # -> NOTA: %.2f \n", media);
		} else if (media >= 4.5 && media <= 6.5) {
			System.out.printf("# RECUPERAÇÃO # -> NOTA: %.2f \n", media);
		} else {
			System.out.printf("# REPROVADO # -> NOTA: %.2f \n", media);
		}
	}
}
