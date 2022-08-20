package Custom;

public class CustomerInfo {
	private String name;
	private int Num;
	private String direction;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNum() {
		return Num;
	}

	public void setNum(int num) {
		Num = num;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		if(direction.toUpperCase().equals("S"))
		{
			this.direction = "South";
		}
		if(direction.toUpperCase().equals("N"))
		{
			this.direction = "North";
		}
		if(direction.toUpperCase().equals("W"))
		{
			this.direction = "West";
		}
		if(direction.toUpperCase().equals("E"))
		{
			this.direction = "East";
		}
		
	}
}
