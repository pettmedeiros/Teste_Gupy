package entities;

public class Account {
	private Integer numer;
	private String holder;
	protected double balance; 
	
	public Account() {
	}

	public Account(Integer numer, String holder, double balance) {
		super();
		this.numer = numer;
		this.holder = holder;
		this.balance = balance;
	}

	public Integer getNumer() {
		return numer;
	}

	public void setNumer(Integer numer) {
		this.numer = numer;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw (double amount) {
		balance -= amount;
	}
	
	public void deposit (double amount) {
		balance += amount; 
	}
	
	
}
