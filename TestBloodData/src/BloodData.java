
public class BloodData {

	private String bloodType;
	private String rhFactor;
	
	public void setBloodType(String bloodType)
	{
		this.bloodType = bloodType;
	}
	
	public String getBloodType()
	{
		return bloodType;
	}
	
	public void setRhFactor(String rhFactor)
	{
		this.rhFactor = rhFactor;
	}
	
	public String getRhFactor()
	{
		return rhFactor;
	}
	
	public BloodData() {
		bloodType = "O";
		rhFactor = "+";
	}
	
	public BloodData(String bloodType, String rhFactor)
	{
		this.bloodType = bloodType;
		this.rhFactor = rhFactor;
	}
}
