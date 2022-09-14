package condicionais;

import javax.swing.JOptionPane;

public class OpMod {
	public static void main(String[] args) {
		/* # RESTO DA DIVIÃO MOD */
		final int CENTAVOS_REAL = 100;

		int valor = Integer.parseInt(JOptionPane.showInputDialog("DIGITE O VALO EM CENTAVOS")); // Entrada de dados
		int reais = valor / CENTAVOS_REAL;
		int centavos = valor % CENTAVOS_REAL;
		
		int resp = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da conta?"); // Criando uma opção de confirmação
		
		if (resp == 0) {
			JOptionPane.showMessageDialog(null, valor+" centavos correspondem a " + reais + " Reais e " + centavos + " centavos.");			
		}

	}
}
