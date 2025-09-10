package chapter7.video90;

import java.util.Scanner;

public class Video90 {
	public static void main(String[] args) {
		System.out.println("--------------------");

		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap trang thai don hang: ");
		String status = sc.nextLine().toUpperCase();

		System.out.println("Status = " + status);
		try {
			OrderStatus input = OrderStatus.valueOf(status);
			System.out.println("Trang thai: " + input.getDescription());
			System.out.println("Trang thai cuoi cung: " + input.hasFinal());
		} catch (Exception e) {
			System.out.println("Trang thai khong hop le");
		}
		sc.close();
	}
}
