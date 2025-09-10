package chapter6.video80;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;

	public FullTimeEmployee(double monthlySalary, String name, String department) {
		super(name, department);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return this.monthlySalary;
	}

	@Override
	public void printInfo() {
		System.out
				.println("Name: " + super.getName() + " / Department " + super.getDepartment() + " / Type: Full-time");
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}
}
