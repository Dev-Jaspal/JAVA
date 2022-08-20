import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCustomerList {

	private int customerId;
	private String firstName;
	private String lastName;
	private double balanceOwed;
	
	/*
	 * public WriteCustomerList(int customerId, String firstName, String lastName,
	 * double balanceOwed) { this.customerId = customerId; this.firstName =
	 * firstName; this.lastName = lastName; this.balanceOwed = balanceOwed; }
	 */
	
	public static void main(String[] s) throws IOException
	{
		
		WriteCustomerList wc = new WriteCustomerList();
		wc.getRecords();
		wc.saveData();
		
	}
	
	public void getRecords()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter customer Id: ");
		customerId = sc.nextInt();
		sc.nextLine();
		System.out.print("Please enter first name: ");
		firstName = sc.nextLine();
		System.out.print("Please enter last name: ");
		lastName = sc.nextLine();
		System.out.print("Please enter balance owed.");
		balanceOwed = sc.nextDouble();
		
	}
	
	public void saveData() throws IOException
	{
		FileWriter fw = new FileWriter("CustomerList.txt",true);
		PrintWriter pw = new PrintWriter(fw, true);
		pw.println(customerId + " " + firstName + " " + lastName + " " + balanceOwed);
		
	}
	
}
