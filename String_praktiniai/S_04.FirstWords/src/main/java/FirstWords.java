
import java.util.Scanner;

public class FirstWords {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
//		String[] pieces = text.split(" ");
//   while non empty line program splits string by spaces and prints 
//        the first part of string    
		while (!text.isEmpty()) {
			String[] pieces = text.split(" ");
			System.out.println(pieces[0]);
			text = scanner.nextLine();
		}

	}
}
