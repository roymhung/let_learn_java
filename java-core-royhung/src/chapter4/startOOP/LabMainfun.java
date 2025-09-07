package chapter4.startOOP;

public class LabMainfun {
	public static void main(String[] args) {

		Student sinhvien1 = new Student();

		sinhvien1.age = 25;
		sinhvien1.name = "royhung";

		System.out.println("Infor sinh vien 1, age = " + sinhvien1.age + " name = " + sinhvien1.name);

		sinhvien1.learnJava();
	}
}
