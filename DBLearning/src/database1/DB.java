package database1;

import java.sql.*;

public class DB {
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;

	public static void main(String[] s) {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Problem in loading or " + "registering MS Access JDBC driver");
			cnfex.printStackTrace();
		}
		try {
			String msAccDB = "Employee.accdb";
			String dbURL = "jdbc:ucanaccess://" + msAccDB;
			// Step 2.A: Create and get connection
			// using DriverManager class
			try {
				connection = DriverManager.getConnection(dbURL);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Step 2.B: Creating JDBC Statement
			statement = connection.createStatement();

			// Step 2.C: Executing SQL & retrieve
			// data into ResultSet
			resultSet = statement.executeQuery("SELECT * FROM EMPLOYEE");
			while (resultSet.next()) {
				var id = resultSet.getInt(1);
				var name = resultSet.getString(2);
				var salary = resultSet.getString(3);
				System.out.println("Employee #" + id + ": " + name + ", " + salary);
			}
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
		} finally {
			// Step 3: Closing database connection
			try {
				if (connection != null) {
					// cleanup resources, once
					// after processing
					resultSet.close();
					statement.close();
					// and then finally close connection
					connection.close();
				}
			} catch (SQLException sqlex) {
				sqlex.printStackTrace();
			}
		}
	}
}
