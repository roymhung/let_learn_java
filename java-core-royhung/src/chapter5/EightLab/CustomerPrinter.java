package chapter5.EightLab;

public class CustomerPrinter {
	public void print(String name) {
		System.out.println("name = " + name);
	}

	public void print(String name, int age) {
		System.out.println("name = " + name + " and age = " + age);
	}

	public void print(String name, int age, String city) {
		System.out.println("name = " + name + " and age = " + age + " and city = " + city);
	}

}
