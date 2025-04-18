package lib;

import java.time.LocalDate;

public class TaxCalculator {
    public int getAnnualIncomeTax(Employment employment, TaxInfo taxInfo) {

        employment.calculateMonthWorkingInYear();
        return TaxFunction.calculateTax(taxInfo);
    }
}
