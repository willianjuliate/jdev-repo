package estrutura_dados;

public class PesquisaBin {

    public static void main(String[] args) {
        int[] lista = new int[]{1, 3, 5, 7, 9};
        
        System.out.println(buscaBinaria(lista, 10));

    }

    public static Integer buscaBinaria(int[] lista, int item) {
        int baixo = 0, alto = lista.length - 1;
        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int chute = lista[meio];
            if (chute == item) {
                return meio;
            }
            if (chute > item) {
                alto = meio - 1;
            } else {
                baixo = meio + 1;
            }
        }
        return null;
    }

}
