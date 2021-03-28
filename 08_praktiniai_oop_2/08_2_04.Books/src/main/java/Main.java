import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// implement here the program that allows the user to enter
		// book information and to examine them

		ArrayList<Book> books = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.print("Tittle: ");
			String tittle = scanner.nextLine();
			if (tittle.isEmpty()) {
				break;
			}
			System.out.print("Pages: ");
			int pages = Integer.parseInt(scanner.nextLine());
			System.out.print("Publication year: ");
			int year = Integer.parseInt(scanner.nextLine());
			Book book = new Book(tittle, pages, year);
			books.add(book);
		}
		System.out.print("What information will be printed?");
		String input = scanner.nextLine();
		for (Book book : books) {
			if (input.equals("everything")) {
				System.out.println(book.toString());
			} else if (input.equals("name")) {
				System.out.println(book.getTittle());
			}
		}

	}
}
