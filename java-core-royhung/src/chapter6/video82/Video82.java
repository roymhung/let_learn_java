package chapter6.video82;

public class Video82 {
	public static void main(String[] args) {
		System.out.println("-------------");

		Song mySong = new Song("Hom nay em toi truong", "roy");
		Video javaCore = new Video("Interface", 1200);

		Playable[] myList = { mySong, javaCore };

		for (Playable playable : myList) {
			playable.play();
			playable.pause();
		}
	}
}
