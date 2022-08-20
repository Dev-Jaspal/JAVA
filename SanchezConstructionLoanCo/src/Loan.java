
public abstract class Loan implements LoanConstants  {
	public int loanNumber;
	public String custLastName;
	public double loanAmount;
	private double interestRate;
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	private String term;

	public Loan(int loanNumber, String custLastName, double loanAmount, String term) {
		this.loanNumber = loanNumber;
		this.custLastName = custLastName;
		this.loanAmount = loanAmount;
		this.term = term;
	}

	@Override
	public String toString() {
		return "Loan [loanNumber=" + loanNumber + ", custLastName=" + custLastName + ", loanAmount=" + loanAmount
				+ ", interestRate=" + interestRate + ", term=" + term + "]";
	}

	
}
