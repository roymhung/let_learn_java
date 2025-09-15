package chapter9;

import java.util.ArrayList;

public class Video109 {
	public static void main(String[] args) {
		System.out.println("----------------------");

		ArrayList<String> royhung = new ArrayList<>();
		royhung.add("ha noi"); // ["hanoi"]
		royhung.add("hcm"); // ["hanoi", "hcm"]
		royhung.add("da nang"); // ["hanoi","hcm", "da nang"]
		royhung.add("ha noi"); // ["hanoi", "hcm", "da nang", "hanoi"]

		for (String city : royhung) {
			System.out.println(city);
		}
		// ArrayList<int> test = new ArrayList<>(); tại sao cái này sai

		ArrayList<Integer> test = new ArrayList<>(); // còn cái này đúng

		test.add(1);// so 1 da duoc chuyen tu kieu du lieu nguyen thuy sang kieu obj(tham chieu)
		// dac diem khi ta thao tac voi obj thi ta phai viet hoa
		test.add(0);

		for (int number : test) {
			System.out.println(number);
		}
	}
}
