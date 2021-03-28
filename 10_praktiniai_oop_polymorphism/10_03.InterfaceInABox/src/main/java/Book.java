
public class Book implements Packable {

	private final String author;
	private final String book;
	private final double weight;

	public Book(String author, String book, double weight) {
		this.author = author;
		this.book = book;
		this.weight = weight;
	}

	public double getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return author + ": " + book;
	}

	@Override
	public double weight() {

		return weight;
	}

}
