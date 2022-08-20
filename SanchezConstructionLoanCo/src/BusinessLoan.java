
public class BusinessLoan extends Loan {

	private double primeLoanInterestRate;

	public double getPrimeLoanInterestRate() {
		return primeLoanInterestRate;
	}

	public BusinessLoan(double primeLoanInterestRate, int loanNumber, String custLastName, double loanAmount, String term) {
		super(loanNumber, custLastName, loanAmount, term);
		var interestRate = primeLoanInterestRate * 1.01;
		setInterestRate(interestRate);
		}

}
