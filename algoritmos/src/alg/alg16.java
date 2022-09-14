package alg;

import java.util.Scanner;

/**
 *
 * @author willian Antes de o racionamento de energia ser decretado, quase
 * ninguém falava em quilowatts; mas, agora, todos incorporaram essa palavra em
 * seu vocabulário. Sabendo-se que 100 quilowatts de energia custa um sétimo do
 * salário mínimo, fazer um algoritmo que receba o valor do salário mínimo e a
 * quantidade de quilowatts gasta por uma residência e calcule. Imprima: - o
 * valor em reais de cada quilowatt - o valor em reais a ser pago - o novo valor
 * a ser pago por essa residência com um desconto de 10%.
 */
public class alg16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sm, qtdade, preco, vp, vd;

        System.out.print("entre com o sálario minímo: ");
        sm = sc.nextDouble();

        System.out.print("entre com a quantidade de quilowatt: ");
        qtdade = sc.nextDouble();
        // divide por 7 para achar o preço de 100 kw e por de 1 kw
        preco = sm / 700;
        vp = preco * qtdade;
        vd = vp * 0.9;
        System.out.printf("\npreço do quilowatt: %.2f\nvalor a ser pago: %.2f\nvalor com desconto: %.2f\n", preco, vp, vd);
        sc.close();

    }

}
