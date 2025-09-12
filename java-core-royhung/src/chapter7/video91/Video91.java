package chapter7.video91;

public class Video91 {
	public static void main(String[] args) {
		System.out.println("-------------------");

		Person royhung = new Person("Roy", 25);

		// Person.UserID myData = royhung.new UserID("678323123", "Ha Noi");

		Person.UserID myData = new Person.UserID("678323123", "Ha Noi");

		System.out.println(" check person name = " + royhung.getName());
		System.out.println(" check person cccd = " + myData.getCccd());
		// myData.printInfo();
	}
}
