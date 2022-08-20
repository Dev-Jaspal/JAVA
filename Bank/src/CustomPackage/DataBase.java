package CustomPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBase {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public DataBase() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String connectionString = "BankAccountDB.accdb";
			String dbURL = "jdbc:ucanaccess://" + connectionString;
			connection = DriverManager.getConnection(dbURL);

			statement = connection.createStatement();

		} catch (ClassNotFoundException ex) {
			System.out.println("Problem in loading the driver");
			System.out.println(ex.getMessage());
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}

	public boolean insertRecord(AccountDetail acc) {

		try {
			String insertQ = "INSERT INTO Account (AccId,FirstName, LastName, CurrentBal) " + "Values (" + acc.getAccNum() + ",'"
					+ acc.getfName() + "','" + acc.getlName() + "'," + acc.getBal() + ")";

			statement.executeUpdate(insertQ);
			closeDbConnection();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	
	
	public ResultSet getAllInfo() {
		try {

			resultSet = statement.executeQuery("SELECT * FROM Account");
			closeDbConnection();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} 
	return resultSet;
	}
	
	private void closeDbConnection()
	{
		if (connection != null) {
			try {
				//resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException err) {
				// TODO Auto-generated catch block
				// e.printStackTrace();
				System.out.println(err.getMessage());
			}

		}
	}

}