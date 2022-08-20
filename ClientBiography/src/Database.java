import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {

	final static String CLIENT_DB = "ClientDetails.txt";
	final static String ACCOUNT_DB = "AccountDetails.txt";
	
	private FileWriter fwc;
	private FileWriter fwa;
	private PrintWriter pwc;
	private PrintWriter pwa;
	
	public void storeData(ClientDetails cd, AccountDetails ad) throws IOException
	{
		fwc = new FileWriter(CLIENT_DB, true);
		fwa = new FileWriter(ACCOUNT_DB, true);
		
		pwc = new PrintWriter(fwc, true);
		pwa = new PrintWriter(fwa, true);
		
		if(pwc != null && pwa != null)
		{
			pwc.println(cd.getCustomerId() + " " + cd.getName() + " " + cd.getAddress());
			pwa.println(cd.getCustomerId() + " " + ad.getCurrentBal() + " " + ad.getWithdrawBal());
		}
	}
	
	public ArrayList<String> getAllClientData() throws IOException
	{
		ArrayList<String> al = new ArrayList<String>();
		File file = new File(CLIENT_DB);
		if(!file.exists())
		{
			System.err.println("File not found !!!");
			return al;
		}
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			al.add(sc.nextLine());
		}
		
		return al;
	}
	
	public ArrayList<String> getAllAccountData() throws IOException
	{
		ArrayList<String> al = new ArrayList<String>();
		File file = new File(ACCOUNT_DB);
		if(!file.exists())
		{
			System.err.println("File not found !!!");
			return al;
		}
		
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine())
		{
			al.add(sc.nextLine());
		}
		
		return al;
	}
}
