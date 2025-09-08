package chapter4.lab06;

public class LabMainfun {
	public static void main(String[] args) {

		Student st = new Student("Royhung", "F");
		st.setName("update name by setter");

		System.out.println("name = " + st.getName());

		// st.getName(); loi vi pham vi cua no la default
	}
}
