
// name of the oldest, input : vardas,amzius iki kol empty
// create new variable oldest = 0;
// loop for checking if age > oldest, if yes oldest becomes age
//reikia rasyti pieces[i] ir paskui jis tampa i+2, nes
//age ispradziu 1 indexe, po to 3 ir t.t. o name index'as
// visada pries age index'a.
import java.util.Scanner;

public class NameOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int oldest = 0;
		String name = null;
		String[] pieces = new String[0];
		while (!text.isEmpty()) {
			pieces = text.split(",");

			for (int i = 1; i < pieces.length; i = i + 2) {
				int age = Integer.parseInt(pieces[i]);
				if (age > oldest) {
					oldest = age;
					name = pieces[i - 1];
				}
			}
			text = scanner.nextLine();
		}
		System.out.println("Name of the oldest: " + name);
	}

}
