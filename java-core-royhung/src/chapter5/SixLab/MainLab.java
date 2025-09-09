package chapter5.SixLab;

public class MainLab {
	public static void main(String[] args) {
		System.out.println("---------------");
		Manager boss = new Manager("IT", "Roy", 123, 1000);
		Programmer dev = new Programmer("mhung", 456, 1000);

		System.out.println("boss salary: " + boss.calculateSalary());
		System.out.println("dev salary: " + dev.calculateSalary());
	}
}
