package chapter4.lab02;

public class LabMainfun2 {
	public static void main(String[] args) {
		Employee nv1 = new Employee();
		nv1.name = "royhung";
		nv1.salary = 15000000;

		Employee nv2 = new Employee();
		nv2.name = "royhung";
		nv2.salary = 10000000;

		nv1.showInfo();
		System.out.println("------------------");
		nv2.showInfo();
	}
}
