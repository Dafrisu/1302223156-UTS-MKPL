package lib;

import java.time.LocalDate;

public class TaxCalculator {
    public int getAnnualIncomeTax(Employee employee, TaxInfo taxInfo) {

        // Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah
        // bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == employee.getEmployment().getYearJoined()) {
            employee.getEmployment()
                    .setMonthWorkingInYear(date.getMonthValue() - employee.getEmployment().getMonthJoined());
        } else {
            employee.getEmployment().setMonthWorkingInYear(12);
        }

        return TaxFunction.calculateTax(taxInfo);
    }
}
