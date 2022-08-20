
public class PersonalLoan extends Loan {

	private double primeLoanInterestRate;

	public double getPrimeLoanInterestRate() {
		return primeLoanInterestRate;
	}
	public PersonalLoan(int loanNumber, String custLastName, double loanAmount, String term) {
		super(loanNumber, custLastName, loanAmount, term);
		var interestRate = primeLoanInterestRate * 1.02;
		setInterestRate(interestRate);
	}

}
