import javax.swing.JOptionPane;

public class RetirementGoal2 {

	final static float INTEREST_RATE = 0.04f;
	public static void main(String[] args) {
		var numOfYears = JOptionPane.showInputDialog("Please enter number of year you have befor retirement.");
		var money = JOptionPane.showInputDialog("Please enter amount of money you save annually.");

		while (Integer.parseInt(numOfYears) <= 0 || Integer.parseInt(money) <= 0) {

			if (Integer.parseInt(numOfYears) <= 0) {
				numOfYears = JOptionPane.showInputDialog("Please enter number year of you have befor retirement.");
			}
			if (Integer.parseInt(money) <= 0) {
				money = JOptionPane.showInputDialog("Please enter amount of money you save annually.");
			}

		}
		
		var interestEarn = Integer.parseInt(money) * INTEREST_RATE;
		JOptionPane.showMessageDialog(null, "Total money user have at retirement is $" + Integer.parseInt(numOfYears)* ( Integer.parseInt(money) + interestEarn));

	}

}
