package chapter4.bigLab07.MainFun;

import chapter4.bigLab07.model.Employee;

public class MainFun07 {
	public static void main(String[] args) {
		Employee nv1 = new Employee("royhung", 25, "Sales", 8000);
		nv1.setCompany("fpt");

		Employee nv2 = new Employee("mhung", 30, "IT", 10000);

		System.out.println("==== BEFORE RAISE ====");
		nv1.ShowInfo();
		System.out.println("-----------------------------");
		nv2.ShowInfo();

		System.out.println();

		System.out.println("==== AFTER RAISE ====");
		nv1.raiseSalary(0);
		nv1.ShowInfo();
		System.out.println("-----------------------------");
		nv2.raiseSalary(1);
		nv2.ShowInfo();

	}
}
