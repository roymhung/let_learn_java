package chapter8.video97;

public class Video97 {
	public static void main(String[] args) {
		System.out.println("-------------------");

		int a = 10;
		int b = 0;

		try {
			System.out.println("a/b = " + a / b);
		} catch (Exception e) {
			System.out.println("run catch: " + e.getMessage());
		}

		try {

		} catch (Exception e) {
			System.out.println("run catch: " + e.getMessage());
		} finally {
			System.out.println("run finally");
		}
		System.out.println("End game");
	}
}
