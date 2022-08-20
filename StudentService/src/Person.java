
public class Person {
	private String firstName;
	private String lastName;
	private String address;
	private String zipCode;
	private String phoneNum;

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public void display()
	{
		System.out.println(firstName + " " + lastName + " " + address + " " + zipCode + " " + phoneNum);
	}
}
