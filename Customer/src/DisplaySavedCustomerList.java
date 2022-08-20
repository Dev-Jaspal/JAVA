import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class DisplaySavedCustomerList {

	public static void main(String[] s) throws IOException {

		DisplaySavedCustomerList wc = new DisplaySavedCustomerList();
		wc.displayCustomerList();
	}

	public void displayCustomerList() throws FileNotFoundException {

		File fs = new File("CustomerList.txt");
		if (!fs.exists()) {
			System.err.println("Data not found!!");
		}
		Scanner sc = new Scanner(fs);
		while (sc.hasNextLine()) {
			var record = sc.nextLine().split(" ");
			System.out.println("Id: " + record[0]);
			System.out.println("Name: " + record[1] + " "+record[2]);
			System.out.println("Balance owed: " + record[3] + "\n");
		}
	}
}
