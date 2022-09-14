package modelo.services;

/**
 *
 * @author willian
 */
public class BrasilTaxServico implements TaxServico {

    @Override
    public double tax(double quantia) {
        return quantia < 100.0 ? quantia * 0.20 : quantia * 0.15;
    }
}
