package chapter5.FourLab;

public class Vehicle {

	private String brand;
	private String year;

	public Vehicle(String brand, String year) {
		this.brand = brand;
		this.year = year;
		System.out.println("Run constructor from Vehicle");
	}

	public void printInfo() {
		System.out.println("Vehicle: " + this.brand + ", " + this.year);
	}

	// getter vs setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
