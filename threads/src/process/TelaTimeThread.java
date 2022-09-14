package process;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author willian
 */
public class TelaTimeThread extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JPanel jpanel = new JPanel(new GridBagLayout());
    /*Painel de componentes*/

    private final JLabel descricaoHora = new JLabel("Time primeira Thread");
    private final JTextField mostraTempo = new JTextField();

    private final JLabel descricaoHora2 = new JLabel("Time segunda Thread");
    private final JTextField mostraTempo2 = new JTextField();

    private final JButton jbuttonStart = new JButton("START");
    private final JButton jbuttonStop = new JButton("STOP");

    private final Runnable thread = () -> {
        while (true) {
            /*Fica sempre rodando!*/
            mostraTempo.setText(new SimpleDateFormat("dd-MM-yyyy hh:mm.ss").
                    format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException err) {
                System.out.println("Erro ao processar a Thread " + err);
            }
        }
    };

    private final Runnable thread2 = () -> {
        while (true) {
            mostraTempo2.setText(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").
                    format(Calendar.getInstance().getTime()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException err) {
                System.out.println("Erro ao processar a Thrad " + err);
            }
        }

    };

    private Thread threadTime;
    private Thread threadTime2;

    @SuppressWarnings("deprecation")
	public TelaTimeThread() {
        /* Executa o que estiver dentro no 
        momento de abertura ou execução*/
        setTitle("Time Thread");
        setSize(new Dimension(240, 250));
        setLocationRelativeTo(null);
        setResizable(false);
        /*----------- COMPONENTES NA TELA ---------------*/

        GridBagConstraints gridBag = new GridBagConstraints();
        /*  Controlado de posição de componentes
            Objeto de construção
         */
        gridBag.gridx = 0;
        gridBag.gridy = 0;
        gridBag.gridwidth = 2;
        gridBag.insets = new Insets(5, 10, 5, 5);
        gridBag.anchor = GridBagConstraints.WEST;

        //-----------------Label e TextFild-------------------        
        descricaoHora.setPreferredSize(new Dimension(200, 25));
        jpanel.add(descricaoHora, gridBag);

        mostraTempo.setPreferredSize(new Dimension(200, 25));
        mostraTempo.setEditable(false);

        gridBag.gridy++;
        jpanel.add(mostraTempo, gridBag);

        //----------------Label e TextFild----------------------
        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBag.gridy++;
        jpanel.add(descricaoHora2, gridBag);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
        mostraTempo2.setEditable(false);
        gridBag.gridy++;
        jpanel.add(mostraTempo2, gridBag);

        //-------------Button Star e Stop ----------------------
        gridBag.gridwidth = 1;
        jbuttonStart.setPreferredSize(new Dimension(92, 25));
        gridBag.gridy++;
        jpanel.add(jbuttonStart, gridBag);

        jbuttonStop.setPreferredSize(new Dimension(92, 25));
        gridBag.gridx++;
        jpanel.add(jbuttonStop, gridBag);

        jbuttonStop.setEnabled(false);

        jbuttonStart.addActionListener((ActionEvent e) -> {
            threadTime = new Thread(thread);
            threadTime2 = new Thread(thread2);
            threadTime.start();
            threadTime2.start();
            jbuttonStop.setEnabled(true);
            jbuttonStart.setEnabled(false);

        });

        jbuttonStop.addActionListener((ActionEvent e) -> {
            threadTime.stop();
            threadTime2.stop();
            jbuttonStop.setEnabled(false);
            jbuttonStart.setEnabled(true);
        });

        add(jpanel, BorderLayout.WEST);
        /*Sempre será por ultimo comando*/
        setVisible(true);
    }

}
