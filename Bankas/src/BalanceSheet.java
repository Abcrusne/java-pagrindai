import java.math.BigDecimal;

import ibank.Account;

public abstract class BalanceSheet implements Account {

	public BalanceSheet(String accountHolderName) {

	}

	@Override
	public boolean deposit(BigDecimal amount) {
		return false;
	}

	@Override
	public BigDecimal getBalance() {
		return null;
	}

	@Override
	public String getHolderName() {
		return null;
	}

	@Override
	public String getNumber() {
		return null;
	}

	@Override
	public boolean withdraw(BigDecimal amount) {
		return false;
	}
}
