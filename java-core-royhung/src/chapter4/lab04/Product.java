package chapter4.lab04;

public class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void display() {
		System.out.println(this.name + ": " + this.price);
	}
}
