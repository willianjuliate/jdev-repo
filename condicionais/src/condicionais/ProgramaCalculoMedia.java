package condicionais;

import javax.swing.JOptionPane;

public class ProgramaCalculoMedia {
	public static void main(String[] args) {
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("# INFORME A NOTA 1 #"));
		double nota2 = Double.parseDouble(JOptionPane.showInputDialog("# INFORME A NOTA 2 #"));
		double nota3 = Double.parseDouble(JOptionPane.showInputDialog("# INFORME A NOTA 3 #"));
		double nota4 = Double.parseDouble(JOptionPane.showInputDialog("# INFORME A NOTA 4 #"));

		double media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media >= 50) {
			if(media >= 70) {
				JOptionPane.showMessageDialog(null, "ALUNO ESTA APROVADO COM MÉDIA DE: "+ media);
			} else {
				JOptionPane.showMessageDialog(null, "ALUNO EM RECUPERAÇÃO COM MÉDIA DE: "+ media);				
			}
		}else {
			JOptionPane.showMessageDialog(null, "ALUNO ESTÁ PREPROVADO COM A MÉDIA DE: "+ media);			
		}		
	}
}
