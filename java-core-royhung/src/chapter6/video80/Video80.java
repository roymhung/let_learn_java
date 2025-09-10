package chapter6.video80;

public class Video80 {
	public static void main(String[] args) {
		System.out.println("-----------------");
		FullTimeEmployee fulltime = new FullTimeEmployee(3000, "roy", "IT");

		PartTimeEmployee parttime = new PartTimeEmployee(15, 12000, "hung", "IT");

		Employee[] listEmployee = { fulltime, parttime };

		for (Employee employee : listEmployee) {
			employee.printInfo();
			System.out.println("Salary: " + employee.calculateSalary());
			System.out.println();
		}
	}

}
