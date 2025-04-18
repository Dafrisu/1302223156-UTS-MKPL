package lib;

import java.time.LocalDate;

public class TaxCalculator {
    public int getAnnualIncomeTax(Employment employment, TaxInfo taxInfo) {

        employment.calculateMontohWorkingInYear();
        return TaxFunction.calculateTax(taxInfo);
    }
}
