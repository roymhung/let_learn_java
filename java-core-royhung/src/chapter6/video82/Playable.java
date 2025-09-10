package chapter6.video82;

public interface Playable {
	void play();// public abstract

	void pause();

	default void printInfo() {
		System.out.println("hello");
	}
}
