package chapter8.video100;

import java.util.Scanner;

public class Video100 {

	public static void checkScore(int score) {
		if (score < 0 || score > 10) {
			throw new IllegalArgumentException("Diem khong hop le: phai tu 0 den 10");
		}
		System.out.println("Diem cua ban la: " + score);
	}

	public static void main(String[] args) {
		System.out.println("-----------------");

		// //cach 1
		// Scanner sc = new Scanner(System.in);
		// System.out.print("Nhap vao diem so: ");
		// int input = sc.nextInt();
		//
		// try {
		// checkScore(input);
		// } catch (IllegalArgumentException e) {
		// System.out.println("Error = " + e.getMessage());
		// } finally {
		// System.out.println("Ket thuc chuong trinh");
		// }
		//
		// sc.close();

		// cach 2: try with resources

		System.out.print("Nhap vao diem so: ");

		try (Scanner sc = new Scanner(System.in)) {
			int input = sc.nextInt();
			checkScore(input);
		} catch (IllegalArgumentException e) {
			System.out.println("Error = " + e.getMessage());
		} finally {
			System.out.println("Ket thuc chuong trinh");
		}

	}
}
