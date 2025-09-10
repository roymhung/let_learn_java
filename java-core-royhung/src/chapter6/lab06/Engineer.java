package chapter6.lab06;

public class Engineer extends Person implements Trainable {

	private String specialty;

	public Engineer(String specialty, String name, int age) {
		super(name, age);
		this.specialty = specialty;
	}

	@Override
	public void attendTraining(String topic) {
		System.out.println("Engineer [" + super.getName() + "] is attending training on [" + topic + "].");

	}

	@Override
	void work() {
		System.out.println("Engineer [" + super.getName() + "] is working on [" + this.specialty + "] project.");

	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

}
