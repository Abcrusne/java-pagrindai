package kdRusne;

import java.util.Comparator;

import lt.vtmc.municipality.Person;

public class ComparatorForPerson implements Comparator<Person> {

	public int compare(Person p1, Person p2) {
		int compare;
		compare = p1.getLastName().compareTo(p2.getLastName());

		if (compare == 0) {
			compare = p1.getFirstName().compareTo(p2.getFirstName());
		}
		return compare;

	}
}
