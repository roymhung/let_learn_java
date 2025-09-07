package chapter3;

public class Lab_04_1 {
	public static void main(String[] args) {

		double[] scores = { 8, 10, 2, 3, 6, 1 };
		double sum = 0, diemTB = 0;
		for (double hoidanit : scores) {
			sum += hoidanit;
		}
		System.out.println("Tong diem = " + sum);
		diemTB = sum / (scores.length);
		System.out.println("Diem trung binh = " + diemTB);
	}
}
