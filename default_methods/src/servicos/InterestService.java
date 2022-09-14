package servicos;

import java.security.InvalidParameterException;

/**
 *
 * @author willian
 */
public interface InterestService {

    double getInterestRate();

    default double payment(double amout, int months) {
        if (months < 1) {
            throw new InvalidParameterException("Months must be greter than zero");
        }
        return amout * Math.pow(1.0 + getInterestRate() / 100.0, months);
    }
}
