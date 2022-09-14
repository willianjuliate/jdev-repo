package condicionais;

public class OpLogicasAninhadas {
	public static void main(String[] args) {
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 95;
		int nota4 = 98;
		double media = 0;

		media = (nota1 + nota2 + nota3 + nota4) / 4;
		/* Operações lógicas aninhadas: São operações dentro de operações */

		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aulno está aprovado direto! - PARABENS " + media);
				} else {
					System.out.println("Aulno está aprovado direto! " + media);
				}
			} else {
				System.out.println("Aluno recuperação! " + media);
			}
		} else {
			System.out.println("Aluno reprovado direto! " + media);
		}
	}
}
