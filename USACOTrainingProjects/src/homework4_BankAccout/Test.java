package homework4_BankAccout;

public class Test {
	public static void main(String[] args) {
		BankAccount account1 = new BankAccount("user1",10000);
		BankAccount account2 = new BankAccount("user2",90000);
		BankAccount betterAccount = new BankAccount();
		
		betterAccount = betterAccount.compareBound(account1, account2);
		
		System.out.println("用户名：" + betterAccount.getAccountName());
		System.out.println("账户金额：" + betterAccount.getBound());
	}
}
