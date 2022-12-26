package test;

public class Account {
	
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1000000;
	
	private int balance;

	public void setBalance(int balance) {
		if (balance < 0 || balance >1000000) {
			return;
		}
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public static void main(String[] args) {
		Account account = new Account();
		
		account.setBalance(10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(30000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(100000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(-10000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
		account.setBalance(3000000);
		System.out.println("현재 잔고 : " + account.getBalance());
		
	}

}
