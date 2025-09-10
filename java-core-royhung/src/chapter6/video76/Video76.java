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

	// Java gọi phương thức dựa trên object thực tế, không dựa vào kiểu khai báo của
	// biến.
	//
	// Animal a1 = new Animal( );
	// Animal a2 = new Dog( );
	//
	// a1.makeSound(); // Animal makes a sound
	// a2.makeSound(); // Dog barks
	// Biến a2 là kiểu Animal, nhưng object thực tế là Dog, nên gọi Dog.makeSound().

}
