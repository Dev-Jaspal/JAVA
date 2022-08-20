import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SubscriptionApp {

	static String FileName = "Subscribe.txt";
	public static void main(String[] args)
	{
		PhysicalNewspaperSubcription subcription = null;
		Scanner sc  = new Scanner(System.in);
		ArrayList<PhysicalNewspaperSubcription> ar = new ArrayList<PhysicalNewspaperSubcription>();
		System.out.print("Enter Name or Q to quit>> ");
		var name = sc.nextLine();
		while(!name.toUpperCase().equals("Q"))
		{
			
			try {
				subcription = new PhysicalNewspaperSubcription(name);
				ar.add(subcription);
			} catch (InvalidNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print("Enter Name or Q to quit>> ");
			name = sc.nextLine();
		}
		
		try {
			storeData(ar);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	private static void storeData(ArrayList<PhysicalNewspaperSubcription>  obj) throws IOException {
		FileWriter file = new FileWriter(FileName, true);
		PrintWriter printWriter = new PrintWriter(file);
		for(var item : obj)
		{
			printWriter.println(item.subscriptionName + " " + item.rate + " " + item.subsType);
			item.toString();
		}
		
		printWriter.close();
	}

}
