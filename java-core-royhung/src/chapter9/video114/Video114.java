package chapter9.video114;

import java.util.HashSet;

public class Video114 {
	public static void main(String[] args) {
		System.out.println("-------------------");

		// Thêm các sản phẩm:
		// (1, "Laptop", 1500.0)
		// (2, "Mouse", 20.0)
		// (3, "Keyboard", 45.0)
		//
		// (1, "Laptop Pro", 2000.0) // Trùng id với Laptop
		// (1, "Laptop", 1500.0) // Trùng id tất cả thuộc tính

		Product pr1 = new Product(1, "Laptop", 1500);
		Product pr2 = new Product(2, "Mouse", 20);
		Product pr3 = new Product(3, "Keyboard", 45);
		Product pr4 = new Product(1, "Laptop Pro", 2000);
		Product pr5 = new Product(1, "Laptop", 1500);

		HashSet<Product> products = new HashSet<>();
		products.add(pr1);
		products.add(pr2);
		products.add(pr3);
		products.add(pr4);
		products.add(pr5);

		for (Product product : products) {
			System.out.println(product);
		}
	}
}
