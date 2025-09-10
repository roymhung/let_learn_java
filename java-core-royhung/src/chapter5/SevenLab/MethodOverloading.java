package chapter5.SevenLab;

public class MethodOverloading {

	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println("-------------------");
		System.out.println("Sum = " + sum(6, 9));
		System.out.println("Sum = " + sum(6.1, 9.2));

	}
}
