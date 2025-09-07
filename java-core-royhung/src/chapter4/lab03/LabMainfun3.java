package chapter4.lab03;

public class LabMainfun3 {
	public static void main(String[] args) {
		Student3 st1 = new Student3("roy", 22);
		Student3 st2 = new Student3("mhugn", 30);
		System.out.println("Check student1 name = " + st1.name);
		System.out.println("Check student2 name = " + st2.name);

		Student3 st3 = new Student3();
		st3.name = "test no constructor";
		System.out.println("Check strudent3 name = " + st3.name);
	}

}
