package condicionais;

import javax.swing.JOptionPane;

public class OPternario {
	public static void main(String[] args) {
		/* Operadores ternarios são para micro validações */
		int numero = Integer.parseInt(JOptionPane.showInputDialog("# INFORME O VALOR #"));
		String parOuImpar = numero % 2 == 0 ? "par" : "impar";
		JOptionPane.showMessageDialog(null, "# O VALOR DIGITADO É .: " + parOuImpar.toUpperCase() + " #");
	}
}
