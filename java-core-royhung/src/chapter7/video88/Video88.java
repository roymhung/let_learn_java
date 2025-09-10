package chapter7.video88;

public class Video88 {
	public static void main(String[] args) {
		System.out.println("-----------------");
		System.out.println("My role = " + Role.ADMIN);
		System.out.println("My role WITH enum = " + MyRole.ADMIN);

		MyRole test = MyRole.ADMIN; // ENUM
		// MyRole test = "SUPERADMIN"; //String
	}
}
