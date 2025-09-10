package chapter6.video80;

public abstract class Employee {
	private String name;
	private String department;

	public Employee(String name, String department) {
		this.setName(name);
		this.setDepartment(department);
	}

	abstract double calculateSalary();

	public void printInfo() {
		System.out.println("Name: " + this.name + "|" + this.department + ": IT");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
