package lib;

import java.time.LocalDate;
import java.time.Month;
import java.util.LinkedList;
import java.util.List;

public class Employee {
	private EmployeeInformation employeeInformation;
	private Employment employment;
	private Family family;
	private Salary salary;

	public Employee(EmployeeInformation employeeInformation, Employment employment, Family family, Salary salary) {
		this.employeeInformation = employeeInformation;
		this.employment = employment;
		this.family = family;
		this.salary = salary;
	}

	public EmployeeInformation getEmployeeInformation() {
		return employeeInformation;
	}

	public Employment getEmployment() {
		return employment;
	}

	public Family getFamily() {
		return family;
	}

	public Salary getSalary() {
		return salary;
	}
}
