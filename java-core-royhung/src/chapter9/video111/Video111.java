package chapter9.video111;

import java.util.ArrayList;
//import java.util.List;

public class Video111 {
	public static void main(String[] args) {
		System.out.println("------------------");
		// List, ArrayList, LinkedList

		// List<String> royhung = new ArrayList<>(); upcasting

		// ArrayList<String> royhung = new ArrayList<>();

		ArrayList<Student> students = new ArrayList<>();

		Student st1 = new Student("roy", 25);
		Student st2 = new Student("mhung", 15);
		Student st3 = new Student("herry", 35);

		students.add(st1);
		students.add(st2);
		students.add(st3);
		// [st1, st2, st3]

		for (Student student : students) {
			System.out.println("Name = " + student.getName() + ", age = " + student.getAge());
		}

		// them vao index = 1
		// [st1, st4, st2, st3]
		System.out.println("------------------------");
		Student st4 = new Student("insert index = 1", 45);
		students.add(1, st4);
		for (Student student : students) {
			System.out.println("Name = " + student.getName() + ", age = " + student.getAge());
		}
		// System.out.println("Check st = " + st);
		// chapter9.video111.Student@4617c264

		// Xoa index = 0
		System.out.println("---------------------------------");
		students.remove(0);
		for (Student student : students) {
			System.out.println("Name = " + student.getName() + ", age = " + student.getAge());
		}
	}
}
