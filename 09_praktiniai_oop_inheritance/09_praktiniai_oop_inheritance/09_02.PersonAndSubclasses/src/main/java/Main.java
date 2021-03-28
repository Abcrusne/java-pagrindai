import java.util.ArrayList;

public class Main {

	public static void printPersons(ArrayList<Person> persons) {

		for (Person person : persons) {
			System.out.println(person);
		}
	}

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Teacher("ada", "123 adresas", 1200));
		persons.add(new Student("Ollie", "0987 adresas"));

		printPersons(persons);

		// write your test code here
//		Student ada = new Student("Ada Lovelace", "24 Maddox St. London W1S 2QN");
//		System.out.println(ada);
//		ada.study();
//		System.out.println(ada);
//		Teacher esko = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200);
//		System.out.println(esko);
//
//		Student ollie = new Student("Ollie", "6381 Hollywood, Los Angeles");
//
//		int i = 0;
//		while (i < 25) {
//			ollie.study();
//			i = i + 1;
//		}
//		System.out.println(ollie);

	}

}
