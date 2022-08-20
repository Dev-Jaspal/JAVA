
public class Loan implements LoanConstant {

	protected int loanNum;
	protected String lastName;
	protected double loanAmt;

	public Loan(int loanNum, String lastName, double loanAmt) throws InvalidLoanException {
		this.loanNum = loanNum;
		this.lastName = lastName;
		if (loanAmt > MAX_AMT) {
			throw new InvalidLoanException("Amount is higher then max limit");
		} else {
			this.loanAmt = loanAmt;
		}
	}

}
