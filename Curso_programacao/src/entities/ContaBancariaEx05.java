package entities;

public class ContaBancariaEx05 {
	private int accuntNumber;
	private String holder;
	private double balance = 0;
	
	public ContaBancariaEx05 (int accuntNumber, String holder) {
		this.accuntNumber = accuntNumber;
		this.holder = holder;
	}
	
	
	public ContaBancariaEx05(int accuntNumber, String holder, double initialDeposit) {

		this.accuntNumber = accuntNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}


	public int getAccuntNumber() {
		return accuntNumber;
	}
	
	public String getHolder() {
	return holder;
	}
	
	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void deposit(double balance) {
		this.balance += balance;
	}
	
	public void withdraw(double balance) {
		this.balance -= balance + 5.0;
	}
	
	public String toString() {
		return "Account " + accuntNumber 
				+ ", Holder: " + holder 
				+ ", Balance: $ " + String.format("%.2f", balance);
	}
	
		
}
