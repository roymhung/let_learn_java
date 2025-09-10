package chapter5.EightLab;

public class MainLab {
	public static void main(String[] args) {
		System.out.println("---------------------");
		CustomerPrinter cp = new CustomerPrinter();
		cp.print("royhung");
		cp.print("royhung", 20);
		cp.print("royhung", 20, "Ha Noi");
	}
}
