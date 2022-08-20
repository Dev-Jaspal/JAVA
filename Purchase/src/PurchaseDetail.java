import java.text.DecimalFormat;

public class PurchaseDetail {

	final float TAX = 0.05F;
	private int invoiceNum;
	private double amt;
	private double tax;
	
	DecimalFormat f = new DecimalFormat("##.00");
	public int getInvoiceNum() {
		return invoiceNum;
	}
	public void setInvoiceNum(int invoiceNum) {
		this.invoiceNum = invoiceNum;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = Double.parseDouble(f.format(amt));
		this.tax =  Double.parseDouble(f.format(amt * TAX));
	}
	
	public void display()
	{
		System.out.println("Invoice number: " + invoiceNum + " Amount: "  + amt + " Tax: " + tax);
	}
}
