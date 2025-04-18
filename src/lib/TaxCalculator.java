package lib;

import java.time.LocalDate;

public class TaxCalculator {
    public int getAnnualIncomeTax(Employee employee) {

        // Menghitung berapa lama pegawai bekerja dalam setahun ini, jika pegawai sudah
        // bekerja dari tahun sebelumnya maka otomatis dianggap 12 bulan.
        LocalDate date = LocalDate.now();

        if (date.getYear() == employee.getEmployment().getYearJoined()) {
            employee.getEmployment()
                    .setMonthWorkingInYear(date.getMonthValue() - employee.getEmployment().getMonthJoined());
        } else {
            employee.getEmployment().setMonthWorkingInYear(12);
        }

        return TaxFunction.calculateTax(employee.getSalary().getMonthlySalary(),
                employee.getSalary().getOtherMonthlyIncome(),
                employee.getEmployment().getMonthWorkingInYear(),
                employee.getSalary().getAnnualDeductible(), employee.getFamily().getSpouceID().equals(""),
                employee.getFamily().getChildID().size());
    }
}
