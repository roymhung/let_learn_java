package chapter2;

public class Lab_04 {
	static int i = 1;

	public static void main(String[] args) {
		for (i = 1; i <= 10; i++) {
			if (i == 5)
				break;
			System.out.println(i);
		}
		System.out.println("--------------------------");

		System.out.println(i);

		System.out.println("--------------------------");

		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				continue;
			System.out.println(i);
		}

	}

}
