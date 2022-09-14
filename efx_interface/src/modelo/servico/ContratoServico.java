package modelo.servico;

import java.time.LocalDate;
import modelo.entidades.Contrato;
import modelo.entidades.Parcela;

/**
 *
 * @author willian
 */
public class ContratoServico {
    private final PagamentoOnlineServico pagamentoOnlineServico;

    public ContratoServico(PagamentoOnlineServico pagamentoOnlineServico) {
        this.pagamentoOnlineServico = pagamentoOnlineServico;
    }
    
    public void processamentoContrato(Contrato contrato, int meses) {      
        double cotaBasica = contrato.getTotalValue() / meses;
        for (int i = 1; i <= meses; i++) {
            LocalDate date = contrato.getData().plusMonths(i);
            double updateCota = cotaBasica + pagamentoOnlineServico.juros(cotaBasica, i);
            double fullCota = updateCota + pagamentoOnlineServico.taxaPagamento(cotaBasica);
            contrato.adicionaParcela(new Parcela(date, fullCota));
        }
    } 
}
