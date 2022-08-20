import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplaySelectedCustomerByBalance {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter balance: ");
		new DisplaySelectedCustomerByBalance().displaySelectedRecord(searchRecordByBalance(sc.nextLine()));
	}

	private static ArrayList<String[]> searchRecordByBalance(String balance) throws IOException {
		ArrayList<String[]> al = new ArrayList<String[]>();

		File fs = new File("CustomerList.txt");
		if (!fs.exists()) {
			System.err.println("Data not found!!");
		}
		Scanner sc = new Scanner(fs);
		while (sc.hasNextLine()) {
			var records = sc.nextLine().split(" ");
			if (records[3].equals(balance)) {
				al.add(records);
			}
		}
		sc.close();

		return al;
	}

	public void displaySelectedRecord(ArrayList<String[]> record) {
		if (record.size() <= 0) {
			System.err.println("No record found.");
		} else {

			for (var item : record) {
				System.out.println("\nId: " + item[0]);
				System.out.println("Name: " + item[1] + " " + item[2]);
				System.out.println("Balance owed: " + item[3] + "\n");
			}

		}

	}
}
