import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DisplaySelectedRecordsByName {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter last name: ");
		new DisplaySelectedRecordsByName().displaySelectedRecord(searchRecordByLastName(sc.nextLine()));
	}

	private static ArrayList<String[]> searchRecordByLastName(String lastName) throws IOException {
		ArrayList<String[]> al = new ArrayList<String[]>();

		File fs = new File("CustomerList.txt");
		if (!fs.exists()) {
			System.err.println("Data not found!!");
		}
		Scanner sc = new Scanner(fs);
		while (sc.hasNextLine()) {
			var records = sc.nextLine().split(" ");
			if (records[2].equals(lastName)) {
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
