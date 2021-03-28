
//program asks user input words until user gives same word
// twice, use arraylist.
import java.util.ArrayList;
import java.util.Scanner;

public class RecurringWord {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		// create here the ArrayList
		ArrayList<String> words = new ArrayList<String>();
		String input = reader.nextLine();
		while (true) {
			words.add(input);
			input = reader.nextLine();
			if (words.contains(input)) {
				break;
			}
		}
		System.out.println(" " + words);
	}
}
