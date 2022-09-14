package modelo.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author willian
 */
public class Contrato {

    private Integer numero;
    private LocalDate data;
    private Double totalValue;
    private final List<Parcela> parcelas = new ArrayList<>();

    public Contrato() {
    }

    public Contrato(Integer numero, LocalDate data, Double totalValue) {
        this.numero = numero;
        this.data = data;
        this.totalValue = totalValue;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Parcela> getParcela() {
        return parcelas;
    }

    public void adicionaParcela(Parcela parcela) {
        parcelas.add(parcela);
    }

    public void removeParcela(Parcela parcela) {
        parcelas.remove(parcela);
    }

}
