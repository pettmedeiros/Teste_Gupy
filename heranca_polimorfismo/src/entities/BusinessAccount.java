package entities;

public class BusinessAccount extends Account { //extends é para herdar a classe Account 
	private double loanLimit;
	
	public BusinessAccount() {
		super (); // agora usa o super () para poder fazer todas as operações da superclasse Account
	}

	public BusinessAccount(Integer numer, String holder, double balance, double loanLimit) {
		super(numer, holder, balance);
		this.loanLimit = loanLimit;
	}

	public double getLoanLimite() {
		return loanLimit;
	}

	public void setLoanLimite(double loanLimite) {
		this.loanLimit = loanLimite;
	}
	
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		 }
	}
}

