
public class AccountDetails {

	private int customerId;
	private double currentBal;
	private double withdrawBal;
	
	public int getCustomerId()
	{
		return customerId;
	}
	
	public void setCustomerId(int id)
	{
		this.customerId = id;
	}
	
	public double getCurrentBal()
	{
		return currentBal;
	}
	
	public void setCurrentBal(double bal)
	{
		currentBal = bal;
	}
	
	public double getWithdrawBal()
	{
		return withdrawBal;
	}
	
	public void setWithdrawBal(double bal)
	{
		withdrawBal = bal;
	}
	
	public double getBalanceInAccount()
	{
		return currentBal - withdrawBal;
	}
	
	public void displayAccountDetails()
	{
		System.out.println("Current Balance: " + getCurrentBal());
		System.out.println("Withdraw Amount: " + getWithdrawBal());
		System.out.println("Balance after withdraw: " + getBalanceInAccount());
	}
	
}

