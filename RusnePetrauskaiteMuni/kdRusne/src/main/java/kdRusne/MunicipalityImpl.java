package kdRusne;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import lt.vtmc.municipality.IllegalCitizenException;
import lt.vtmc.municipality.Municipality;
import lt.vtmc.municipality.Person;
import lt.vtmc.municipality.PersonPredicate;
import lt.vtmc.municipality.TaxCalculator;

/**
 * Class for Municipality implementation
 */

public class MunicipalityImpl implements Municipality {

	private static final Logger LOG = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	private TaxCalculator taxCalculator;
	private List<Person> persons = new ArrayList<>();
	private LocalDate current;

	public MunicipalityImpl(TaxCalculator taxCalculator) {
		super();
		this.taxCalculator = taxCalculator;
	}

	// Returns a collection of citizens in the municipality that matches a given
	// predicate
	@Override
	public Collection<Person> findCitizensBy(PersonPredicate predicate) {
		Collection<Person> predicates = new ArrayList<>();
		for (Person person : persons) {
			if (predicate.test(person)) {
				predicates.add(person);
			}
		}

		return predicates;
	}

	// for finding oldest citizen in list
	// returns oldest Person
	@Override
	public Person findOldestPerson() {

		return Collections.min(persons, Comparator.comparing(s -> s.getDateOfBirth().getYear() + 1900));
	}

	// returns average income of citizens'
	@Override
	public double getAverageCitizenIncome() {

		return persons.stream().mapToDouble(income -> income.getYearlyIncome()).average().getAsDouble();
	}

	@Override
	public int getCitizenCount() {

		return persons.size();
	}

	@Override
	public Collection<Person> getOrderedCitizens() {

		Collections.sort(persons, new ComparatorForPerson());

		return persons;
	}

	@Override
	public Map<Integer, List<Person>> groupByYearOfBirth() {
//		Map<Integer, List<Person>> map= new HashMap<>();
//		LocalDate dateOfBirth;
//		for (Person person : persons) {
//			dateOfBirth = person.getDateOfBirth().;	
//		}

//		Collections.sort(persons, new CompartorForBirth());

		Map<Integer, List<Person>> result = persons.stream()
				.collect(Collectors.groupingBy(p -> p.getDateOfBirth().getYear() + 1900, Collectors.toList()));

		return result;
	}

	// checks if Person is not already existing in a collection
	@Override
	public boolean isRegisteredCitizen(Person person) {

		return persons.contains(person);
	}

	@Override
	public void registerCitizen(Person person) throws IllegalCitizenException {

		if (person.getFirstName() == null || person.getLastName() == null || person.getDateOfBirth() == null
				|| person.getFirstName().isEmpty() || person.getLastName().isEmpty() || person.getYearlyIncome() < 0
				|| (person.getDateOfBirth().isAfter(current.now()))) {
			LOG.info("IllegalCitizenException was trying to add person who is not excisting.");
			throw new IllegalCitizenException(person);
		} else if (!persons.contains(person)) {
			persons.add(person);
		}

	}

	// returns total yearly tax income
	@Override
	public double totalIncomeInTaxes() {

		return persons.stream().mapToDouble(income -> income.getYearlyIncome()).reduce(0,
				(acc, element) -> acc + element);
	}
//My Draft
//	private static void setupLogger() {
//
//		LogManager.getLogManager().reset();
//		LOG.setLevel(Level.ALL);
//
//		ConsoleHandler ch = new ConsoleHandler();
//		ch.setLevel(Level.SEVERE);
//		LOG.addHandler(ch);
//
//		try {
//			FileHandler fh = new FileHandler("myLoggerRusne.log", true);
//			fh.setLevel(Level.FINE);
//			LOG.addHandler(fh);
//		} catch (java.io.IOException e) {
//			LOG.log(Level.SEVERE, "File logger is not working. ", e);
//		}
//	}

}
