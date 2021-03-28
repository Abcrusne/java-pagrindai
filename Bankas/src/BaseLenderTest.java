import ibank.Bank;
import ibank.BaseBankTest;

public class BaseLenderTest extends BaseBankTest {

	public BaseLenderTest() {

	}

	@Override
	protected Bank createBank() {
		Lender lender = new Lender();
		return lender;
	}

}
