
public class Book {

	private String name;
	private int publicationYear;

	public Book(String name, int publicationYear) {
		this.name = name;
		this.publicationYear = publicationYear;
	}

	public String getName() {
		return name;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public boolean equals(Object other) {
		Book book = (Book) other;
		return this.name.equals(book.name) && this.publicationYear == book.publicationYear;
	}

}
