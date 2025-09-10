package chapter6.video78;

public class Vehicle {

	private String brand;

	public Vehicle(String brand) {
		this.setBrand(brand);
	}

	public void start() {
		System.out.println("Vehicle is starting....");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
