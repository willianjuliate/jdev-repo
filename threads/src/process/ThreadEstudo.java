package process;

import javax.swing.JOptionPane;

/**
 *
 * @author willianjuliate
 * @email willianjuliate@gmail.com
 */
public class ThreadEstudo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Codigo da Rotina que eu quero executar em paralelo*/
        Thread thread_email = new Thread(threadEmail), thread_pdf = new Thread(threadPDF);
        // Start lisga a thread que fica processando paralelamente por trás
        thread_email.start();
        thread_pdf.start();
        

        /*Codigo do sistema do usuário continua o fluxo de trabalho*/
        System.out.println("CHEGOU AO FIM DO CÓDIGO DE TESTE DE THREAD!");
        /*Fluxo do sistema, cadastro de vendas, um emissão de nota fiscal, algo do tipo*/
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário!");

    }

    private static final Runnable threadEmail = () -> {
        for (int pos = 0; pos < 10; pos++) {
            /*Quero executar esse envio com um tempo de parada, ou com um tempo determinado!*/
            System.out.println("Executando alguma rotina, por exemplo envio de e-mail!");
            try {
                Thread.sleep(2000); // Dá um tempo em millis
            } catch (InterruptedException err) {
                System.out.println("Erro ao processar a Thread E-mail {" + err + "}");
            }
        }
    };

    private static final Runnable threadPDF = () -> {
        for (int pos = 0; pos < 10; pos++) {
            System.out.println("Executando alguma rotina, por exemplo Gerando PDF");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException err) {
                System.out.println("Erro ao processar a Thread PDF {" + err + "}");
            }
        }
    };

}
