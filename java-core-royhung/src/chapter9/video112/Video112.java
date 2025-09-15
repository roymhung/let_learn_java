package chapter9.video112;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Video112 {
	public static void hashSetExample() {
		System.out.println("Run hashSet");
		HashSet<String> royhung = new HashSet<>();
		HashSet<Integer> numberHashSet = new HashSet<>();

		numberHashSet.add(10);
		numberHashSet.add(4);
		numberHashSet.add(20);
		numberHashSet.add(3);
		numberHashSet.add(3);
		numberHashSet.add(3);

		ArrayList<String> royhungArr = new ArrayList<>();

		royhung.add("javascript");
		royhung.add("java");
		royhung.add("backend");
		royhung.add("javascript");

		royhungArr.add("javascript");
		royhungArr.add("java");
		royhungArr.add("backend");
		royhungArr.add("javascript");

		System.out.println(royhung);
		System.out.println("arraylist: " + royhungArr);
		System.out.println(numberHashSet);
	}

	public static void treeSetExample() {
		System.out.println("Run treeSet");
		TreeSet<String> royhung = new TreeSet<>();
		TreeSet<Integer> numberTreeSet = new TreeSet<>();

		numberTreeSet.add(10);
		numberTreeSet.add(4);
		numberTreeSet.add(20);
		numberTreeSet.add(3);
		numberTreeSet.add(10);
		numberTreeSet.add(10);

		ArrayList<String> royhungArr = new ArrayList<>();

		royhung.add("javascript");
		royhung.add("java");
		royhung.add("backend");
		royhung.add("javascript");

		royhungArr.add("javascript");
		royhungArr.add("java");
		royhungArr.add("backend");
		royhungArr.add("javascript");

		System.out.println(royhung);
		System.out.println("arraylist: " + royhungArr);
		System.out.println(numberTreeSet);
	}

	public static void main(String[] args) {
		System.out.println("-----------------------");
		hashSetExample();

		System.out.println("-----------------------");
		treeSetExample();
	}
}
