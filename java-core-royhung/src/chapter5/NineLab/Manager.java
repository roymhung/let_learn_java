package chapter5.NineLab;

public class Manager extends Employee {
	private String department;

	public Manager(String department, int employeeId, double salary, String name, int age) {
		super(employeeId, salary, name, age);
		this.department = department;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println("Department: " + this.department);

	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
