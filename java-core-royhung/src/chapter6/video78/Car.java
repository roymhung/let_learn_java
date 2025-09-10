package chapter6.video78;

public class Car extends Vehicle {

	public Car(String brand) {
		super(brand);
	}

	@Override
	public void start() {
		System.out.println("Car " + super.getBrand() + " is starting with key...");
	}
}
