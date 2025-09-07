package chapter3;

import java.util.Locale;
import java.util.Scanner;

public class Lab_07 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		// Yêu cầu: Viết chương trình Java thực hiện các bước sau:
		// Nhập vào tên và điểm của 3 học sinh.
		// Lưu tên vào mảng String[ ], điểm vào mảng double[ ].
		// In ra danh sách học sinh và điểm tương ứng.
		// Tính và in ra điểm trung bình của cả lớp.
		// In ra học sinh có điểm từ 8 trở lên.

		String[] names = new String[3];
		double[] scores = new double[3];

		for (int i = 1; i <= 3; i++) {
			System.out.println("Nhap vao ten cua hoc sinh " + i + ":");
			String name = scanner.nextLine();
			names[i - 1] = name;

			System.out.println("Nhap vao diem cua hoc sinh " + i + ":");
			double score = scanner.nextDouble();
			scores[i - 1] = score;

			scanner.nextLine();
		}

		System.out.println("-----------------------");
		System.out.println("Danh sach da nhap: ");
		double sum = 0;
		for (int i = 1; i <= 3; i++) {
			System.out.println("ten = " + names[i - 1] + " va diem = " + scores[i - 1]);

			sum += scores[i - 1];
		}
		System.out.printf("Diem trung binh: %.2f", sum / 3);
		System.out.println();
		System.out.println("-----------------------");

		System.out.println("Diem lon hon 8: ");
		for (int i = 1; i <= 3; i++) {
			if (scores[i - 1] >= 8) {
				System.out.println("ten = " + names[i - 1] + " va diem = " + scores[i - 1]);
			}
		}
		scanner.close();
	}
}
