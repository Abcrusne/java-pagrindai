import java.util.ArrayList;

public class Room {

	ArrayList<Person> persons = new ArrayList();

//	public Room(ArrayList<Person> persons) {
//		this.persons = persons;
//	}

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public void add(Person person) {
		persons.add(person);
	}

	public boolean isEmpty() {
		return persons.isEmpty();

	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public Person shortest() {
		if (this.persons.isEmpty()) {
			return null;
		}
		Person newPerson = this.persons.get(0);

		for (Person elements : persons) {

			if (newPerson.getHeight() > elements.getHeight()) {
				newPerson = elements;
			}
		}
		return newPerson;
	}

	public Person take() {
//		remove from array list shortest person
		Person shortPerson = shortest();
		if (this.persons.isEmpty()) {
			return null;
		} else {
			this.persons.remove(shortPerson);
		}

		return shortPerson;

	}
}
