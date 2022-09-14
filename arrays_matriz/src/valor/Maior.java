package valor;

/**
 *
 * @author willian
 */
public class Maior {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numero = {10, 50, 20, 6, 8, 9, 7, 1};
        
        int valorMax = numero[0];
        int valorMin = numero[0];

        for (int i = 0; i < numero.length; i++) {
            if(numero[i] > valorMax) {
                valorMax = numero[i];
            }
            if(numero[i] < valorMin) {
                valorMin = numero[i];
            }
        }
        
        for(int n: numero) {
            System.out.print(n + " ");
        }
        
        System.out.println("O maior valor é: "+ valorMax);
        System.out.println("O menor valor é: "+ valorMin);

    }

}
