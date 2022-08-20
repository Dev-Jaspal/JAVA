package Custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public Database() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String connectionString = "CustomerDb.accdb";
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

	public boolean insertRecord(CustomerInfo obj) {

		try {
			String insertQ = "INSERT INTO CustomerTable (Num, Name, Direction) " + "Values (" + obj.getNum() + ",'"
					+ obj.getName() + "','" + obj.getDirection() + "')";

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

			resultSet = statement.executeQuery("SELECT Name FROM CustomerTable");
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
