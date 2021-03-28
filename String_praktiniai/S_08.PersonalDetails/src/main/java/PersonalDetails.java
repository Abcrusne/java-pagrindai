
// name of the oldest, input : vardas,amzius iki kol empty
// atspausdinti turi varda kuris ilgiausias ir vidurki metu
// pieces[0] yra vardas, pasiversti i char ir jei ju ilgis ilgesnis 
// susikurta variable longest name, jis tampa longest name
// ilgi turim, tai reikia String name kuris talpintu ta longest name
// skaiciuojam kieki loopo
// ir suma amziu, amzius pieces[1]
import java.util.Scanner;

public class PersonalDetails {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		double average = 0;
		int longestName = 0;
		int count = 0;
		int sum = 0;
		String name = null;
		String[] pieces = new String[0];
		while (!text.isEmpty()) {
			pieces = text.split(",");
			for (int i = 1; i < pieces.length; i = i + 2) {
				int age = Integer.parseInt(pieces[1]);
				if (pieces[0].toCharArray().length > longestName) {
					longestName = pieces[0].toCharArray().length;
					name = pieces[0];
				}
				count++;
				sum += age;

			}
			text = scanner.nextLine();
		}
		average = sum / (double) count;
		System.out.println(name);
		System.out.println("Average: " + average);
	}

}
