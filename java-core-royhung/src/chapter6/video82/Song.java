package chapter6.video82;

public class Song implements Playable {

	private String title;
	private String artist;

	public Song(String title, String artist) {
		this.title = title;
		this.artist = artist;
	}

	@Override
	public void play() {
		System.out.println("Playing song: " + this.title + " by: " + this.artist);

	}

	@Override
	public void pause() {
		System.out.println("Pausing song: " + this.title);

	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
