package chapter9.video115;

import java.util.HashMap;
import java.util.TreeMap;

public class Video115 {
	public static void hashMapExample() {
		System.out.println("hashMapExample");
		HashMap<Integer, String> students = new HashMap<>();
		students.put(1, "royhung");
		students.put(2, "mhung");
		students.put(3, "roy");
		students.put(1, "royhung bla bla..");

		System.out.println(students);
	}

	public static void treeMapExample() {
		System.out.println("treeMapExample");
		TreeMap<Integer, String> students = new TreeMap<>();
		students.put(1, "royhung");
		students.put(5, "mhung");
		students.put(20, "roy");
		students.put(3, "royhung bla bla..");
		students.put(20, "roy");
		students.put(20, "vietnam");

		System.out.println(students);
	}

	public static void main(String[] args) {
		System.out.println("-------------------");
		hashMapExample();
		System.out.println("----------------------");
		treeMapExample();
	}
}
