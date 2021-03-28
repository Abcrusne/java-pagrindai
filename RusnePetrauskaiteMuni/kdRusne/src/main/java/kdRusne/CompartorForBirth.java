package kdRusne;

import java.util.Comparator;

import lt.vtmc.municipality.Person;

public class CompartorForBirth implements Comparator<Person> {

	@Override
	public int compare(Person p1, Person p2) {

		return p1.getDateOfBirth().compareTo(p2.getDateOfBirth());
	}

}
