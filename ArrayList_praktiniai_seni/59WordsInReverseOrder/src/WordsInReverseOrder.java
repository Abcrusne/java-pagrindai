import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import java.util.Collections.reverse();

public class WordsInReverseOrder {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// create here an ArrayList
		ArrayList<String> words = new ArrayList<String>();
		String input = reader.nextLine();
		while (!input.isEmpty()) {
			words.add(input);
			input = reader.nextLine();
		}
		Collections.reverse(words);
		System.out.println(" " + words);
	}
}
