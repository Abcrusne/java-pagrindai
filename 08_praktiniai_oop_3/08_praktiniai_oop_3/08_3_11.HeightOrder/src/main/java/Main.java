
public class Main {

	public static void main(String[] args) {
		// Test your class here

		Room room = new Room();

		System.out.println("Empty room?" + room.isEmpty());
		room.add(new Person("Lea", 182));
		room.add(new Person("Kenya", 180));
		room.add(new Person("Auli", 142));
		room.add(new Person("Leu", 156));

		while (!room.isEmpty()) {
			System.out.println(room.take());
		}
//		System.out.println("Empty room?" + room.isEmpty());
//
//		System.out.println("");
//
//		for (Person person : room.getPersons()) {
//			System.out.println(person);
//		}
//
//		System.out.println();
//		System.out.println("Shortest: " + room.shortest());
//		System.out.println("");
//		for (Person person : room.getPersons()) {
//			System.out.println(person);
//		}

	}
}
