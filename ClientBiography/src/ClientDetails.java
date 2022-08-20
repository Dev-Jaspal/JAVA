
public class ClientDetails {

	private int customerId;
	private String firstName;
	private String lastName;
	private String address;
	
	public int getCustomerId()
	{
		return customerId;
	}
	public String getName()
	{
		return firstName +  " " + lastName;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public ClientDetails(int custId, String fName, String lName, String address)
	{
		customerId = custId;
		firstName = fName;
		lastName = lName;
		this.address = address;
	}
	
	public void displayClientDetails()
	{
		System.out.println("Customer Id: " + getCustomerId());
		System.out.println("Name: " + getName());
		System.out.println("Address: " + getAddress());
		
	}
}
