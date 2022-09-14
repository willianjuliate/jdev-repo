/* ALGORITMO 35 */

package alg;
import javax.swing.JOptionPane;

public class alg01 {
    public static void main(String[] args) {
        int dia, mes, ano;
        int data = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite data no formato ddmmaa: "));

        dia = data / 10000;
        mes = data % 10000 / 100;
        ano = data % 100;

        System.out.println(dia + "/" + mes + "/" + ano);

    }
}