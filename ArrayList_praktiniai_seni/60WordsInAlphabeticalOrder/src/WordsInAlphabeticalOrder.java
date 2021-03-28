
import java.util.ArrayList;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// create here an ArrayList
		ArrayList<String> words = new ArrayList<String>();
		String input = reader.nextLine();
		while (!input.isEmpty()) {
			words.add(input);
			input = reader.nextLine();
		}
		words.sort(String::compareToIgnoreCase);
		System.out.println(" " + words);
	}
}
