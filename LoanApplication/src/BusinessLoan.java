
public class BusinessLoan extends Loan{

	private double interestRate;

	public BusinessLoan(int loanNum, String lastName, double loanAmt) throws InvalidLoanException {
		super(loanNum, lastName, loanAmt);
		this.interestRate = 0.0299;
	}

	@Override
	public String toString() {
		return " Loan Number: " + loanNum + 
			   " Last Name: " + lastName + 
			   " Loan Amount: " + loanAmt;
	}
	 // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {
 
        // If the object is compared with itself then return true 
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of Complex or not "null instanceof [type]" also returns false */
        if (!(o instanceof BusinessLoan)) {
            return false;
        }
         
        // typecast o to Complex so that we can compare data members
        BusinessLoan c = (BusinessLoan) o;
         
        // Compare the data members and return accordingly
        return Double.compare(loanNum, c.loanNum) == 0;
    }
	
	
}
