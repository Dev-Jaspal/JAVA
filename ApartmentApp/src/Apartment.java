
public class Apartment {
	private int aprtNum;
	private int bedroomNum;
	private int bathNum;
	private double rentAmt;

	public int getApartNum()
	{
		return aprtNum;
	}
	
	public int getBedRoomNum()
	{
		return bedroomNum;
	}
	
	public int getBathNum()
	{
		return bathNum;
	}
	
	public double getRentAmt()
	{
		return rentAmt;
	}
	
	public Apartment(int apartNum, int bedRoomNum, int bathNum, double rentAmt)
	{
		this.aprtNum = apartNum;
		this.bathNum = bathNum;
		this.bedroomNum = bedRoomNum;
		this.rentAmt = rentAmt;
	}
}
