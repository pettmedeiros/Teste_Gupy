package entities;

public class Individual extends TaxPayer{
	private double healtExpenditures;

	public Individual(String name, double anualIncome, double healtExpenditures) {
		super(name, anualIncome);
		this.healtExpenditures = healtExpenditures;
	}

	public double getHealtExpenditures() {
		return healtExpenditures;
	}

	public void setHealtExpenditures(double healtExpenditures) {
		this.healtExpenditures = healtExpenditures;
	}
	
	@Override
	public double tax() {
		if (getAnualIncome() <20000.0) {
			return (getAnualIncome() * 0.15) - (healtExpenditures * 0.50);
		}
		else {
			return (getAnualIncome() * 0.25) - (healtExpenditures * 0.50);
		}
	}
	
}
