package chapter7.video89;

public enum Level {
	HARD("Level khó", 3), MEDIUM("Level TB", 2), EASY("Level dễ", 1);

	private final String description;// NO SETTER
	private final int count;

	private Level(String description, int count) {
		this.description = description;
		this.count = count;
	}

	public String getDescription() {
		return description;
	}

	public int getCount() {
		return count;
	}

}
