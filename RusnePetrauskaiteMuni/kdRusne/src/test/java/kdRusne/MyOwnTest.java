package kdRusne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyOwnTest {

	@Test
	void getCitizenCount() {

		MunicipalityImpl i = new MunicipalityImpl(null);
		assertEquals((0), i.getCitizenCount());
	}

}
