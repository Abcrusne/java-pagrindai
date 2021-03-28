
////program asks user input words until user empty line
import java.util.ArrayList;
import java.util.Scanner;

public class Words {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ArrayList<String> words = new ArrayList<String>();
		String input = reader.nextLine();
		while (!input.isEmpty()) {
			words.add(input);
			input = reader.nextLine();
		}
		System.out.println(" " + words);
	}
}
