package kdRusne;

import lt.vtmc.municipality.Person;
import lt.vtmc.municipality.TaxCalculator;
import lt.vtmc.municipality.TaxRateProvider;

public class TaxCalculatorImpl implements TaxCalculator {

	private TaxRateProvider taxRateProvider;

	public TaxCalculatorImpl(TaxRateProvider taxRateProvider) {
		super();
		this.taxRateProvider = taxRateProvider;
	}

	@Override
	public double calculateTax(Person person) {

		return (((taxRateProvider.getTaxRate(person.getYearlyIncome())) * person.getYearlyIncome()) / 100);
	}

}
