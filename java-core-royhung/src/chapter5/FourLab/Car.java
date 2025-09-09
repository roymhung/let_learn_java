package chapter5.FourLab;

public class Car extends Vehicle {

	private String type;

	public Car(String type, String brand, String year) {
		super(brand, year);
		this.type = type;
		System.out.println("Run constructor from Car");
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Car: " + this.type);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
