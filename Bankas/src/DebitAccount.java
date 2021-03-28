import java.math.BigDecimal;
import java.util.UUID;

public class DebitAccount extends BalanceSheet {
	private String accountNumber = UUID.randomUUID().toString();
	private String accountHolderName;
	private BigDecimal balance = BigDecimal.ZERO;

	public DebitAccount(String accountHolderName) {
		super(accountHolderName);
		this.accountHolderName = accountHolderName;
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
		if (amount.compareTo(BigDecimal.ZERO) > 0) {
			balance = balance.subtract(amount);
			return true;
		}
		return false;
	}

	@Override
	public boolean deposit(BigDecimal amount) {
		if (amount.compareTo(BigDecimal.ZERO) == 1) {
			balance = balance.add(amount);
			return true;
		}
		return false;
	}
}