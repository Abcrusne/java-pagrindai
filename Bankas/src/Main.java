import java.math.BigDecimal;

import ibank.Account;

public class Main {

	public static void main(String[] args) {
		Lender lender = new Lender();

		Account account = lender.openCreditAccount("Jonas", new BigDecimal(200));
		System.out.println(lender.getNumberOfAccounts());
		lender.closeAccount(account);
		Account depositAccount = lender.openDebitAccount("Jonas");
		System.out.println(lender.getNumberOfAccounts());
		depositAccount.deposit(new BigDecimal(200));
		System.out.println(depositAccount.getBalance());
		depositAccount.withdraw(new BigDecimal(200));
		System.out.println(depositAccount.getBalance());
		Account withdrawAccount = lender.openCreditAccount("Skolaitis", new BigDecimal(200));
		withdrawAccount.withdraw(new BigDecimal(210));
		System.out.println(withdrawAccount.getBalance());
		System.out.println(withdrawAccount.getHolderName());
		System.out.println(withdrawAccount.getNumber());
		System.out.println(account.getHolderName());
		System.out.println(account.getBalance());
		Account second = lender.openDebitAccount("Petras");
		System.out.println(lender.getNumberOfAccounts());
		lender.closeAccount(second);
		System.out.println(lender.getNumberOfAccounts());
		System.out.println(withdrawAccount.getHolderName());
		System.out.println(depositAccount.getHolderName());

	}

}
