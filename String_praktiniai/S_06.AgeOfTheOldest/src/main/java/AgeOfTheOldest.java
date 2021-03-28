
//split'int per kableli
//index 1 vietoje visad bus skaicius. Bet array yra String
// string convert i int
// pasiimti visus suvestus age ir juos palyginti tarpusavy
// susikurti int oldest, kuris 0 ir dabar age lyginti su juo, jei age > oldest
// age tampa oldet ir kartojasi ciklas
import java.util.Scanner;

public class AgeOfTheOldest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		int oldest = 0;

		while (!text.isEmpty()) {
			String[] pieces = text.split(",");
			for (int i = 1; i < pieces.length; i = i + 2) {
				int age = Integer.parseInt(pieces[1]);
				if (age > oldest) {
					oldest = age;
				}
			}
			text = scanner.nextLine();
		}
		System.out.println("Age of the oldest: " + oldest);
	}
}
