package mybank;

public class Account {
	// 계좌번호, 계좌주, 잔액
	private String accountNo;
	private String name;
	private int balance;
	
	// 각 필드의 값을 조회하고 설정할 수 있도록 getter/setter 메서드를 정의

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
