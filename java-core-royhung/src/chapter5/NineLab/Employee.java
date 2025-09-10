package chapter5.NineLab;

public class Employee extends Person {
	private int employeeId;
	private double salary;

	public Employee(int employeeId, double salary, String name, int age) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("EmployeeId: " + this.employeeId);
		System.out.println("Salary: " + this.salary);
	}

	public double calculateSalary() {
		return this.salary;
	}

	public double calculateSalary(double bonus) {
		return this.salary + bonus;
	}
}
