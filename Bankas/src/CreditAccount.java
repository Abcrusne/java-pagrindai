import java.math.BigDecimal;
import java.util.UUID;

public class CreditAccount extends BalanceSheet {
	private String accountNumber = UUID.randomUUID().toString();
	private String accountHolderName;
	private BigDecimal balance = BigDecimal.ZERO;
	private BigDecimal creditLimit;

	public CreditAccount(String accountHolderName, BigDecimal creditLimit) {
		super(accountHolderName);
		this.accountHolderName = accountHolderName;
		this.creditLimit = creditLimit;
	}

	@Override
	public BigDecimal getBalance() {
		return this.balance;
	}

	@Override
	public String getHolderName() {
		return this.accountHolderName;
	}

	@Override
	public String getNumber() {
		return this.accountNumber;
	}

	@Override
	public boolean withdraw(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) > 0
				&& balance.add(creditLimit).subtract(amount).compareTo(BigDecimal.ZERO) >= 0) {
			balance = balance.subtract(amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) > 0) {
			balance = balance.add(amount);
			return true;
		}
		return false;
	}
}