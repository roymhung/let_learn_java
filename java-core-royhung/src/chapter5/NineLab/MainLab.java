package chapter5.NineLab;

public class MainLab {
	public static void main(String[] args) {
		System.out.println("----------------------");
		Manager boss = new Manager("Sales", 34, 2000, "royhung", 24);
		boss.introduce();
		System.out.println("Luong co ban: " + boss.calculateSalary());
		System.out.println("Luong sau thuong: " + boss.calculateSalary(500));

	}
}
