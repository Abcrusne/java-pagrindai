import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

	private ArrayList<Person> employees = new ArrayList<Person>();

	public Employees() {

	}

	public void add(Person personToAdd) {
		employees.add(personToAdd);
	}

	public void add(List<Person> peopleToAdd) {
		for (Person person : peopleToAdd) {
			employees.add(person);
		}
	}

	public void print() {
//		for (Person employee : employees) {
//			System.out.println(employee);
//		} irgi veikia bet iterator naudoti, kad failures nebutu
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void print(Education education) {
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				System.out.println(person);
			}
		}
	}

	public void fire(Education education) {
		Iterator<Person> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Person person = iterator.next();
			if (person.getEducation() == education) {
				iterator.remove();
			}
		}
	}

}
