package ch08;

public class SalaryMan extends Employee{
	private int annualSalary;
	SalaryMan(String name, int annualSalary) {
		super(name); this.annualSalary = annualSalary;
	}
	int computePay() {
		return annualSalary / 12;
	}
	
}
