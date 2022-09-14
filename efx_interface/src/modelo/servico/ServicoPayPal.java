package modelo.servico;

/**
 *
 * @author willian
 */
public class ServicoPayPal implements PagamentoOnlineServico {    
    
    private static final double PORCENTAGEM_TAXA = 0.01;
    private static final double JUROS_MENSAIS = 0.02;
    
    @Override
    public double juros(double quantia, int meses) {       
        return quantia * PORCENTAGEM_TAXA * meses; 
    }
    @Override
    public double taxaPagamento(double quantia) {
        return  quantia * JUROS_MENSAIS;
    }
}
