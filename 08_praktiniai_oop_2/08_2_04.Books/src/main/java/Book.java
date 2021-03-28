
public class Book {
	private String tittle;
	private int pages;
	private int year;

	public Book(String tittle, int pages, int year) {
		this.tittle = tittle;
		this.pages = pages;
		this.year = year;
	}

	public String getTittle() {
		return tittle;
	}

	public String toString() {
		return this.tittle + ", " + this.pages + " pages, " + this.year;
	}
}
