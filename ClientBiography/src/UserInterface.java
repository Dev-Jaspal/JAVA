import java.io.IOException;
import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter 1 to Add Details.\nEnter 2 to Search on Balance based.\nEnter 3 to exit.");
		var input = sc.nextInt();
		while (input != 3) {
			if (input == 1) {
				addDetails(sc);
			} else if (input == 2) {
				searchRecords(sc);

			} else {
				System.out.println("Please enter valid input!!!");
			}
			System.out.println("\nEnter 1 to Add Details.\nEnter 2 to Search on Balance based.\nEnter 3 to exit.");
			input = sc.nextInt();
		}

		System.exit(0);

	}

	private static void searchRecords(Scanner sc) throws IOException {
		Database db = new Database();
		var clientData = db.getAllClientData();
		var accountData = db.getAllAccountData();
		sc.nextLine();
		System.out.print("Please enter balance for search: ");
		var bal = sc.nextDouble();

		for (var item : accountData) {
			var values = item.split(" ");
			if (Double.parseDouble(values[1]) > bal ) {
				for (var cl : clientData) {
					if (cl.contains(values[0])) {
						var data = cl.split(" ");
						System.out.println("Customer Id: " + data[0]);
						System.out.println("Customer name: " + data[1] + " " + data[2]);
						System.out.println("Customer address: " + data[3]);
						System.out.println("Customer current balance: " + values[1]);
						System.out.println("Customer last withdrawal: " + values[2]);
						System.out.println();
					}
				}
			}
		}
	}

	private static void addDetails(Scanner sc) throws IOException {
		System.out.print("Please enter customer id.");
		var id = sc.nextInt();
		sc.nextLine();
		System.out.print("First name: ");
		var fname = sc.nextLine();

		System.out.print("Last name: ");
		var lname = sc.nextLine();

		System.out.print("Address: ");
		var address = sc.nextLine();

		System.out.print("Current balance: ");
		var currentBalance = sc.nextDouble();

		System.out.print("Withdraw balance: ");
		var withdraw = sc.nextDouble();

		AccountDetails accDetail = new AccountDetails();
		accDetail.setCurrentBal(currentBalance);
		accDetail.setWithdrawBal(withdraw);

		ClientDetails clientDetails = new ClientDetails(id, fname, lname, address);

		System.out.println("Your details is \n");
		clientDetails.displayClientDetails();
		accDetail.displayAccountDetails();

		Database db = new Database();
		db.storeData(clientDetails, accDetail);
	}

}
