package process;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 *
 * @author willian
 */
public class ImplementacaoFilaThread extends Thread {

    private static final ConcurrentLinkedQueue<ObjetoFilaThread> fila
            = new ConcurrentLinkedQueue<>();

    public void add(ObjetoFilaThread objetoFilaThread) {
        fila.add(objetoFilaThread);
    }

    public ImplementacaoFilaThread() {
    }

    @Override
    public void run() {
        System.out.println("Fila rodando...");

        while (true) {
            synchronized (this) {
                Iterator<ObjetoFilaThread> iteracao = fila.iterator();
                while (iteracao.hasNext()) {
                    ObjetoFilaThread processar = (ObjetoFilaThread) iteracao.next();
                    /*Processar 10 mil notas fiscal
                    Gerar uma lista enorme em PDF
                    GErar um envio em massa de email*/

                    System.out.println("-----------------------------------");
                    System.out.println("Nome: " + processar.getNome());
                    System.out.println("Email: " + processar.getEmail());

                    iteracao.remove();

                    try {
                        Thread.sleep(100);
                        /*DESCARGA DE MEMÓRIA*/
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }

            }

        }
    }
}
