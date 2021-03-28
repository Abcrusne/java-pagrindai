package kdRusne;

import lt.vtmc.municipality.AbstractMunicipalityTest;
import lt.vtmc.municipality.Municipality;
import lt.vtmc.municipality.TaxCalculator;
import lt.vtmc.municipality.TaxRateProvider;

public class AbstractMunicipality extends AbstractMunicipalityTest {

	@Override
	public Municipality getMunicipality(TaxCalculator taxCalculator) {

		return new MunicipalityImpl(taxCalculator);
	}

	@Override
	public TaxCalculator getTaxCalculator(TaxRateProvider taxRateProvider) {

		return new TaxCalculatorImpl(taxRateProvider);
	}

}
