package chapter6.lab06;

public class Lab06 {
	public static void main(String[] args) {
		System.out.println("-------------------");

		Engineer kySu = new Engineer("Progammer", "roy", 25);
		Manager boss = new Manager(10, "hung", 30);

		Person[] listMember = { kySu, boss };// upcasting
		for (Person person : listMember) {// run time
			person.introduce();
			person.work();

			if (person instanceof Trainable) {
				Trainable test = (Trainable) person;// downcasting
				test.attendTraining("learn Java");
				test.feedback();
			}

			System.out.println();
		}

	}
}
