
import java.util.Scanner;

public class LineByLine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
//		while non empty input arba !text.equals(" ")
		while (!text.isEmpty()) {
			String[] pieces = text.split(" ");
//			for (int i = 0; i < pieces.length; i++)
			for (String element : pieces) {
				System.out.println(element);
			}
			text = scanner.nextLine();
//			break;
//			System.out.println();
//			break;
		}

	}
}
