import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

import ibank.Account;
import ibank.Bank;

public class Lender implements Bank {
	private Collection<Account> accounts;
	private Collection<String> holders;

	public Lender() {
		accounts = new ArrayList<Account>();
		holders = new ArrayList<String>();
	}

	@Override
	public void closeAccount(Account account) {
		accounts.remove(account);
	}

	@Override
	public Account getAccountByHolderName(String accountHolderName) {
		for (Account account : accounts) {
			if (account.getHolderName().equals(accountHolderName)) {
				return account;
			}
		}
		return null;
	}

	@Override
	public Account getAccountByNumber(String accountNumber) {
		for (Account account : accounts) {
			if (account.getNumber() == accountNumber) {
				return account;
			}
		}
		return null;
	}

	@Override
	public Collection<Account> getAllAccounts() {
		return accounts;
	}

	@Override
	public int getNumberOfAccounts() {
		return accounts.size();
	}

	@Override
	public BigDecimal getTotalReserves() {
		BigDecimal total = BigDecimal.ZERO;
		for (Account account : accounts) {
			total = total.add(account.getBalance());
		}
		return total;
	}

	@Override
	public Account openCreditAccount(String accountHolderName, BigDecimal creditLimit) {
		if (!(accountHolderName.isEmpty()) && accountHolderName != null && creditLimit != null
				&& (!(holders.contains(accountHolderName)))) {
			Account account = new CreditAccount(accountHolderName, creditLimit);
			accounts.add(account);
			holders.add(accountHolderName);
			return account;
		} else {
			return null;
		}
	}

	@Override
	public Account openDebitAccount(String accountHolderName) {
		if (!(accountHolderName.isEmpty()) && accountHolderName != null && (!(holders.contains(accountHolderName)))) {
			Account account = new DebitAccount(accountHolderName);
			accounts.add(account);
			holders.add(accountHolderName);
			return account;
		} else {
			return null;
		}
	}
}