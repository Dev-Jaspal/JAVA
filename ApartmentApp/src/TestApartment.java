import javax.swing.JOptionPane;

public class TestApartment {

	public static void main(String[] args) {
		prompt();
	}

	public static void prompt() {
		int bedroomNum = Integer
				.parseInt(JOptionPane.showInputDialog("Please enter minimum number of bedroom required."));
		int bathroomNum = Integer
				.parseInt(JOptionPane.showInputDialog("Please enter minimum number of bathroom required."));
		double rent = Double
				.parseDouble(JOptionPane.showInputDialog("Please enter the rent amount you are willing to pay."));

		if (bedroomNum > 0 && bathroomNum > 0 && rent >= 500) {
			if (bedroomNum == 3 && bathroomNum == 2) {
				Apartment obj = new Apartment(1232, bedroomNum, bathroomNum, 600);
				display(obj);
			} else if (bedroomNum == 1 && bathroomNum == 1) {
				Apartment obj = new Apartment(1222, bedroomNum, bathroomNum, 500);
				display(obj);
			} else if (bedroomNum == 4 && bathroomNum == 3) {
				Apartment obj = new Apartment(14152, bedroomNum, bathroomNum, 700);
				display(obj);
			} else if (bedroomNum == 5 && bathroomNum == 5) {
				Apartment obj = new Apartment(6585, bedroomNum, bathroomNum, 800);
				display(obj);
			} else if (bedroomNum == 2 && bathroomNum == 1) {
				Apartment obj = new Apartment(10203, bedroomNum, bathroomNum, 500);
				display(obj);
			} else {
				JOptionPane.showMessageDialog(null, "No aparment is available.");
			}

		} else {
			JOptionPane.showMessageDialog(null, "No aparment is available.");

		}
	}

	public static void display(Apartment apartment) {
		JOptionPane.showMessageDialog(null,
				"Apartment number: " + apartment.getApartNum() + " is available with number of bedroom is "
						+ apartment.getBedRoomNum() + " and number of bathroom is " + apartment.getBathNum()
						+ " with rent amount is $" + apartment.getRentAmt());

	}

}
