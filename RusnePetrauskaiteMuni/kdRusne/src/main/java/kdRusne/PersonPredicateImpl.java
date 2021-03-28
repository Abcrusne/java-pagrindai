package kdRusne;

import java.util.ArrayList;
import java.util.List;

import lt.vtmc.municipality.Person;
import lt.vtmc.municipality.PersonPredicate;

public class PersonPredicateImpl implements PersonPredicate {

	private List<Person> persons = new ArrayList<>();

	@Override
	public boolean test(Person person) {

		return persons.contains(person);
	}

}
