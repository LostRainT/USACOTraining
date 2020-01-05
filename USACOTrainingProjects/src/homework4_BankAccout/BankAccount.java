package homework4_BankAccout;

public class BankAccount {
	private int bound;
	private String accountName;
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	BankAccount() {

	}

	BankAccount(String name, int a) {
		setAccountName(name);
		setBound(a);
	}

	public int getBound() {
		return bound;
	}

	public void setBound(int bound) {
		this.bound = bound;
	}

	public BankAccount compareBound(BankAccount a, BankAccount b) {
		int betterBound = 0;
		String userHaveBetterBound = null;
		BankAccount betterAccount = new BankAccount(userHaveBetterBound, betterBound);

		if (a.getBound() > b.getBound()) {
			betterBound = a.getBound();
			userHaveBetterBound = a.getAccountName();
		} else if (a.getBound() < b.getBound()) {
			betterBound = b.getBound();
			userHaveBetterBound = b.getAccountName();
		} else if (a.getBound() == b.getBound()) {
			betterBound = a.getBound();
			userHaveBetterBound = a.getAccountName() + "," + a.getAccountName();
		}

		betterAccount.setAccountName(userHaveBetterBound);
		betterAccount.setBound(betterBound);

		return betterAccount;

	}
}
