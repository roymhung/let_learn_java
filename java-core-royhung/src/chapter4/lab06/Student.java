package chapter4.lab06;

public class Student {
	private String name;// name: bien thuoc tinh
	private String grade;

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;

	}
	// setter vs getter

	// setter: thay doi gia tri dua vao tham so truyen vao
	public void setName(String name) {// name: bien tham sao dau vao
		this.name = name;
	}

	// getter dung cac fun de lay ra giai tri cua doi tuong chung ta
	// viec lay ra nhu nay thi chung ta se khong co Access Modifier => default
	public String getName() {
		return this.name;
	}
}
