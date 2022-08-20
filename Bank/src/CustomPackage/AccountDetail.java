package CustomPackage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountDetail {
	private int accNum;
	private String fName;
	private String lName;
	private float bal;

	public int getAccNum() {
		return accNum;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public float getBal() {
		return bal;
	}

	public AccountDetail()
	{
		
	}
	
	public AccountDetail(int accNum, String fName, String lName, float bal) {
		this.accNum = accNum;
		this.fName = fName;
		this.lName = lName;
		this.bal = bal;
	}
	
	public String display(ResultSet rs)
	{
		String msg = " ";
		try {
			while(rs.next())
			{
				msg = msg + "Acc num: " + rs.getInt(2) + " Name: " + rs.getString(3) + " " + rs.getString(4) + " Bal: " + rs.getString(5) + "\r\n";
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return msg;
	}
}
