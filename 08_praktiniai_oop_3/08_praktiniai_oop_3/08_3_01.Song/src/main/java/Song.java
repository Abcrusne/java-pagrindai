
public class Song {

	private String artist;
	private String name;
	private int durationInSeconds;

	public Song(String artist, String name, int durationInSeconds) {
		this.artist = artist;
		this.name = name;
		this.durationInSeconds = durationInSeconds;
	}

	@Override
	public String toString() {
		return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
	}

	public boolean equals(Object other) {

		Song song = (Song) other;
		return this.artist.equals(song.artist) && this.name.equals(song.name)
				&& this.durationInSeconds == song.durationInSeconds;
	}

}
