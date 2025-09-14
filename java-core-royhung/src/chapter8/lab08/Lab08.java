package chapter8.lab08;

import java.util.Scanner;

public class Lab08 {
	public static void main(String[] args) {
		System.out.println("-------------------");

		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Nhap vao username: ");
			String username = sc.nextLine();

			System.out.println("Nhap vao password: ");
			String password = sc.nextLine();

			System.out.println("Nhap vao so du ban dau: ");
			double balance = sc.nextDouble();

			sc.nextLine();

			System.out.println("Nhap vao so tien can rut: ");
			double amount = sc.nextDouble();

			BankAccount acc = new BankAccount(username, password, balance);
			acc.withdraw(amount);

		} catch (Exception e) {

			System.out.println(e.getClass().getSimpleName() + ":" + e.getMessage());

		} finally {

			System.out.println("Giao dich ket thuc.");

		}

	}
}
