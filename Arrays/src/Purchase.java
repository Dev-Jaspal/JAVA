import javax.swing.JOptionPane;

public class Purchase {
	private int invoiceNumber;
	private double saleAmount;
	private double taxSaleAmount;

	public void setInvoiceNumber(int number) {
		this.invoiceNumber = number;
	}

	public void setSaleAmount(double amount) {
		this.taxSaleAmount = amount * 0.05;
		this.saleAmount = amount;
	}

	public void display() {
		JOptionPane.showMessageDialog(null,
				"Invoice number: " + invoiceNumber + "\nSale amount: " + saleAmount + "\nSale tax: " + taxSaleAmount, "Invoice", JOptionPane.WARNING_MESSAGE);
	}
}
