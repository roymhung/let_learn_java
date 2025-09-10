package chapter6.video80;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;

	public PartTimeEmployee(int hoursWorked, double hourlyRate, String name, String department) {
		super(name, department);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	@Override
	double calculateSalary() {
		return (double) this.hourlyRate * this.hoursWorked;
	}

	@Override
	public void printInfo() {
		System.out.println("Name: " + super.getName() + " / Department " + super.getDepartment() + " / Type: Part-time");
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
}
