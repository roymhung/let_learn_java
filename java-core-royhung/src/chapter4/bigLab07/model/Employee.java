package chapter4.bigLab07.model;

public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
	private String company = "viettel";

	public Employee(String name, int age, String department, double salary) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void ShowInfo() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
		System.out.println("Department: " + this.department);
		System.out.println("Salary: " + this.salary);
		System.out.println("Company: " + this.company);
	}

	public void raiseSalary(double amount) {
		if (amount > 0) {
			double currentSalary = this.getSalary();
			double futureSalary = currentSalary * 1.15;
			this.setSalary(futureSalary);
		}
	}

}
