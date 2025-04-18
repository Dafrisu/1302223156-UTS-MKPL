package lib;

public class TaxInfo {
    private Employment employment;
    private Family family;
    private Salary salary;

    public TaxInfo(Employment employment, Family family, Salary salary, EmployeeInformation employeeInformation) {
        this.employment = employment;
        this.family = family;
        this.salary = salary;
    }

    public int getMonthlySalary() {
        return salary.getMonthlySalary();
    }

    public int getOtherMonthlyIncome() {
        return salary.getOtherMonthlyIncome();
    }

    public int getNumberOfMonthWorking() {
        return employment.getMonthWorkingInYear();
    }

    public int getAnnualDeductible() {
        return salary.getAnnualDeductible();
    }

    public boolean getIsMarried() {
        return !family.getSpouceID().equals("");
    }

    public int getNumberOfChildren() {
        return family.getChildID().size();
    }
}
