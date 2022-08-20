import java.util.Iterator;

import javax.swing.JOptionPane;

public class CreatePurchase {

	public static void main(String[] args) {

		Purchase[] purchase = new Purchase[5];

		for (int i = 0; i < purchase.length; i++) {
			var invoiceNumber = Integer.parseInt(JOptionPane.showInputDialog("Please enter invoice number."));
			while (invoiceNumber > 8000 || invoiceNumber < 1000) {
				invoiceNumber = Integer
						.parseInt(JOptionPane.showInputDialog("Please enter valid salary between 50000-99000."));
			}

			var amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter sale amount."));
			while (amount < 0) {
				amount = Integer.parseInt(JOptionPane.showInputDialog("Please enter valid positive sale amount."));
			}
			Purchase obj = new Purchase();
			obj.setInvoiceNumber(invoiceNumber);
			obj.setSaleAmount(amount);
			purchase[i] = obj;
		}
	
		for (Purchase purchase2 : purchase) {
			purchase2.display();
		}
	}

}
