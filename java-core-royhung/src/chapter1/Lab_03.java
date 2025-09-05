package chapter1;

import java.util.Locale;
import java.util.Scanner;

public class Lab_03 {
//	Tính và xuất ra thể tích của hình lập phương.
//	Gợi ý:
//	thể tích = cạnh x cạnh x cạnh = cạnh^3 = Math.pow(canh, 3)

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhap vao canh cua hinh lap phuong: ");
		float canhLp = scanner.nextFloat();
		float theTich = (float) Math.pow(canhLp, 3);

		System.out.printf("thể tích của hình lập phương: %.3f", theTich);

	}

}
