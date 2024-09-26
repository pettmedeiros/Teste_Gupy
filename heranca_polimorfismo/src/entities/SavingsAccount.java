package entities;

public class SavingsAccount extends Account { //extends para herdar a classe Account
	private double interestRate;
	
	public SavingsAccount () {
		super ();
	}

	public SavingsAccount(Integer numer, String holder, double balance, double interestRate) {
		super(numer, holder, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void uptadeBalance() {
		balance += balance * interestRate;
	}
}
