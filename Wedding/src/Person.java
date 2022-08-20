import java.time.LocalDate;

public class Person {
	private String fname;
	private String lname;
	private LocalDate birthdate;
	
	public String getFname()
	{
		return fname;
	}

	public String getLname()
	{
		return lname;
	}

	public LocalDate getBirthDate()
	{
		return birthdate;
	}

	public Person(String fname, String lname, LocalDate birthdate) {
		this.fname = fname;
		this.lname = lname;
		this.birthdate = birthdate;
	}
	
	
}
