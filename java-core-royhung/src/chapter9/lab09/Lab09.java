package chapter9.lab09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lab09 {
	public static void yeuCau1() {
		ArrayList<Member> members = new ArrayList<>();
		Member mb1 = new Member(1, "roy1", 22);
		Member mb2 = new Member(2, "roy2", 50);
		Member mb3 = new Member(3, "roy3", 10);
		Member mb4 = new Member(4, "roy4", 5);
		Member mb5 = new Member(5, "roy5", 100);

		members.add(mb1);
		members.add(mb2);
		members.add(mb3);
		members.add(mb4);
		members.add(mb5);

		for (Member member : members) {
			System.out.println(member);
		}
	}

	public static void yeuCau2() {
		HashSet<Integer> members = new HashSet<>();
		Member mb1 = new Member(10, "roy1", 22);
		Member mb2 = new Member(2, "roy2", 50);
		Member mb3 = new Member(33, "roy3", 10);
		Member mb4 = new Member(40, "roy4", 5);
		Member mb5 = new Member(5, "roy5", 100);
		Member mb6 = new Member(10, "roy1", 22);

		members.add(mb1.getId());
		members.add(mb2.getId());
		members.add(mb3.getId());
		members.add(mb4.getId());
		members.add(mb5.getId());
		members.add(mb6.getId());

		System.out.println(members);

	}

	public static void yeuCau3() {
		TreeSet<Member> members = new TreeSet<>();
		Member mb1 = new Member(10, "roy1", 22);
		Member mb2 = new Member(2, "roy2", 50);
		Member mb3 = new Member(33, "roy3", 10);
		Member mb4 = new Member(40, "bla bla", 50);
		Member mb5 = new Member(5, "roy5", 100);
		Member mb6 = new Member(10, "roy1", 22);

		members.add(mb1);
		members.add(mb2);
		members.add(mb3);
		members.add(mb4);
		members.add(mb5);
		members.add(mb6);

		for (Member member : members) {
			System.out.println(member);
		}
	}

	public static void yeuCau4() {
		HashMap<Integer, Integer> pointMap = new HashMap<>();

		pointMap.put(2, 11);
		pointMap.put(3, 50);
		pointMap.put(1, 5);
		pointMap.put(16, 25);

		if (pointMap.containsKey(1)) {
			int currentPoint = pointMap.get(1);
			pointMap.put(1, currentPoint + 10);
		}

		System.out.println("Danh sach diem thuong: ");
		for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Point: " + entry.getValue());
		}

	}

	public static void yeuCau5() {
		ArrayList<Member> members = new ArrayList<>();
		Member mb1 = new Member(1, "roy1", 22);
		Member mb2 = new Member(2, "roy2hung", 50);
		Member mb3 = new Member(3, "roy3", 10);
		Member mb4 = new Member(4, "roy4", 5);
		Member mb5 = new Member(5, "roy5", 100);
		Member mb6 = new Member(3, "roy33333", 10);

		members.add(mb1);
		members.add(mb2);
		members.add(mb3);
		members.add(mb4);
		members.add(mb5);
		members.add(mb6);

		members.add(new Member(1, "roy1", 22));
		members.add(new Member(2, "roy2hung", 50));
		members.add(new Member(3, "roy3", 10));
		members.add(new Member(4, "roy4", 5));
		members.add(new Member(5, "roy5", 100));
		members.add(new Member(3, "roy33333", 10));

		TreeMap<Integer, String> idNameMap = new TreeMap<>();

		// Duyệt qua danh sách members và đưa vào TreeMap
		for (Member m : members) {
			idNameMap.put(m.getId(), m.getName());
		}

		System.out.println("TreeMap ID -> Name:");

		// Duyệt qua TreeMap và in ra ID -> Name
		for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
			System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
		}

	}

	public static void main(String[] args) {
		System.out.println("-----------------");
		// yeuCau1();
		// yeuCau2();
		// yeuCau3();
		// yeuCau4();
		yeuCau5();
	}
}
