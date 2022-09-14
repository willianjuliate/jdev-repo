package process;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author willian
 */
public class TelaConcurrenceLinkedQueueProcess extends JDialog {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private final JPanel jpanel = new JPanel(new GridBagLayout());
    /*Painel de componentes*/

    private final JLabel descricaoHora = new JLabel("NOME");
    private final JTextField mostraTempo = new JTextField();

    private final JLabel descricaoHora2 = new JLabel("EMAIL");
    private final JTextField mostraTempo2 = new JTextField();

    private final JButton jbuttonStart = new JButton("Add Lista");
    private final JButton jbuttonStop = new JButton("STOP");

    private ImplementacaoFilaThread fila = new ImplementacaoFilaThread();

    @SuppressWarnings({ "deprecation" })
    public TelaConcurrenceLinkedQueueProcess() {
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
        gridBag.gridy++;
        jpanel.add(mostraTempo, gridBag);

        //----------------Label e TextFild----------------------
        descricaoHora2.setPreferredSize(new Dimension(200, 25));
        gridBag.gridy++;
        jpanel.add(descricaoHora2, gridBag);

        mostraTempo2.setPreferredSize(new Dimension(200, 25));
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

        jbuttonStart.addActionListener((ActionEvent e) -> {
            if(fila == null) {
                fila = new ImplementacaoFilaThread();
                fila.start();
            }
            for (int i = 0; i < 10000; i++) {
                ObjetoFilaThread filaThread = new ObjetoFilaThread();
                filaThread.setNome(mostraTempo.getText());
                filaThread.setEmail(mostraTempo2.getText() +" - "+ i);
                fila.add(filaThread);
            }

        });

        jbuttonStop.addActionListener((ActionEvent e) -> {
            fila.stop();
            fila = null;
        });

        fila.start();

        add(jpanel, BorderLayout.WEST);
        /*Sempre será por ultimo comando*/
        setVisible(true);
    }

}
