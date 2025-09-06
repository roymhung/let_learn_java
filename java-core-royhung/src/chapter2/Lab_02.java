package chapter2;

import java.util.Locale;
import java.util.Scanner;

public class Lab_02 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao so tu 1 den 7: ");
		int day = scanner.nextInt();
		System.out.println("------------------");

		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		default:
			System.out.println("Another day");
			scanner.close();
		}
	}

	// nhỏ hơn 12
	// int day = 3;
	// switch (day) {
	// case 1: System.out.println("Monday"); break;
	// case 2: System.out.println("Tuesday"); break;
	// default: System.out.println("Another day");
	// }

	// từ version 12 trở đi cu phap vay cung nhu nhau
	// Với java 12 trở đi (giới thiệu mở rộng)
	// Từ Java 12: switch expression dùng -> và cho phép gán giá trị trực tiếp.
	// https://blogs.oracle.com/javamagazine/post/new-switch-expressions-in-java-12

	// String result = switch (day) {
	// case 1 -> "Monday";
	// case 2 -> "Tuesday";
	// default -> "Another day";
	// };
	// System.out.println(result);

}
