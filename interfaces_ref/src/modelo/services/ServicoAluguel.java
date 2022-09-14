package modelo.services;

import modelo.entities.AluguelCarro;
import modelo.entities.Fatura;

/**
 *
 * @author Willian Juliate
 *
 */
public class ServicoAluguel {

    private Double precoPorHora;
    private Double precoPorDia;

    private TaxServico taxaServico;

    public ServicoAluguel() {
    }

    public ServicoAluguel(Double precoPorDia, Double precoPorHora, TaxServico taxaServico) {
        this.precoPorDia = precoPorDia;
        this.precoPorHora = precoPorHora;
        this.taxaServico = taxaServico;
    }

    public void processarFatura(AluguelCarro aluguelCarro) {
        long t1 = aluguelCarro.getInicio().getTime();
        long t2 = aluguelCarro.getFim().getTime();
        double hours = (double)(t2 - t1) / 1000 / 60 / 60;
        double pagamentoBasico;

        if (hours <= 12.0) {
            pagamentoBasico = precoPorHora * Math.ceil(hours);
        } else {
            pagamentoBasico = precoPorDia * Math.ceil(hours / 24);
        }

        double tax = taxaServico.tax(pagamentoBasico);
        aluguelCarro.setFatura(new Fatura(pagamentoBasico, tax));

    }

}
