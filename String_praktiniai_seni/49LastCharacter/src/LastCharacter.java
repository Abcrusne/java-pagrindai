import java.util.Scanner;

public class LastCharacter {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Type your name: ");
		String name = reader.nextLine();
		System.out.println("Last character: " + lastCharacter(name));
	}

	public static char lastCharacter(String text) {
		int size = text.length();
		int size1 = size - 1;
		char letter = text.charAt(size1);
		return letter;
	}
}
