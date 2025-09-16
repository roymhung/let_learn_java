package chapter9.lab09;

public class Member implements Comparable<Member> {
	private int id;
	private String name;
	private int age;

	public Member(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Member o) {
		// TODO Auto-generated method stub
		// if (this.age > o.getAge())
		// return 1;
		// return 0;
		if (this.age != o.getAge())
			return this.age - o.getAge();
		else
			return this.name.compareTo(o.getName());
	}

}
