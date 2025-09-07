package chapter4.lab01;

public class LabMainfun1 {
	public static void main(String[] args) {
		System.out.println("-------------");

		Student1 sv1 = new Student1();
		sv1.onThi();
		int testSum = sv1.sum(6, 9);
		System.out.println("test sum = " + testSum);

	}
}
