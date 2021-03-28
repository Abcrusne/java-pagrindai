
import java.util.Scanner;

public class AVClub {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();

		while (!text.isEmpty()) {
			String[] pieces = text.split(" ");
			for (String s : pieces) {
				if (s.contains("av")) {
					System.out.println(s);
				}
			}
			text = scanner.nextLine();
		}

	}
}
