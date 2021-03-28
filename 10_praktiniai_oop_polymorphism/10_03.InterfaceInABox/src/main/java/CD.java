
public class CD implements Packable {

	private final String artist;
	private final String name;
	private final int year;

	public CD(String artist, String name, int year) {
		this.artist = artist;
		this.name = name;
		this.year = year;
	}

	@Override
	public String toString() {
		return artist + ": " + name + " (" + year + ")";
	}

	@Override
	public double weight() {
		return 0.1;
	}

}
