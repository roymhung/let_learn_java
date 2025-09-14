package chapter8.video99;

public class Video99 {
	public static int chia2SoNguyen(int a, int b) throws Exception {
		if (b == 0) {
			throw new Exception("Loi chia cho 0");
		}
		return a / b;
	}

	public static void main(String[] args) throws Exception {
		System.out.println("-----------------");
		System.out.println("Ket qua chia = " + chia2SoNguyen(10, 0));
	}

}
