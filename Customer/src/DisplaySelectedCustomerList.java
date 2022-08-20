import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySelectedCustomerList {

	public static void main(String... s) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the id: ");
		new DisplaySelectedCustomerList().displaySelectedRecord(searchData(sc.nextInt()));
	}

	private static String[] searchData(int id) throws IOException {
		String[] record = null;
		File fs = new File("CustomerList.txt");
		if (!fs.exists()) {
			System.err.println("Data not found!!");
		}
		Scanner sc = new Scanner(fs);

		while (sc.hasNextLine()) {
			var records = sc.nextLine().split(" ");
			if (Integer.parseInt(records[0]) == id) {
				sc.close();
				return record = records;
			}
		}
		sc.close();
		return record;
	}

	public void displaySelectedRecord(String[] record) {
		if (record == null) {
			System.err.println("Id not found");
		} else {
			System.out.println("\nId: " + record[0]);
			System.out.println("Name: " + record[1] + " " + record[2]);
			System.out.println("Balance owed: " + record[3] + "\n");
		}

	}
}
