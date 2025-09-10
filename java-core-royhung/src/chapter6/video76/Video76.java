package chapter6.video76;

public class Video76 {
	public static void main(String[] args) {
		System.out.println("--------------");
		Animal a = new Animal();
		Dog myDog = new Dog();

		Animal test = new Dog();// upcasting
		Dog test2 = (Dog) test;// downcasting

		// System.out.println(test.getClass());// runtime

		test.makeSound();
		test2.wagTail();
	}

}
