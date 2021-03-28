
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

	public static void main(String[] args) {
		// implement here your program that uses the PersonalInformation class

		ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("First name: ");
			String firstName = scanner.nextLine();
			if (firstName.isEmpty()) {
				break;
			} else {
				System.out.println("Last name: ");
				String lastName = scanner.nextLine();
				System.out.println("Identification number: ");
				String number = scanner.nextLine();
//				print collected info
				PersonalInformation item = new PersonalInformation(firstName, lastName, number);
				infoCollection.add(item);
			}
			for (PersonalInformation item : infoCollection) {
//				System.out.println(item.toString());
				System.out.println(item.getFirstName() + " " + item.getLastName());
			}
		}
		scanner.close();
	}
}
