

import java.sql.*;
import java.util.ArrayList;

public class DataBase {

	Connection connection = null;
	Statement statement = null;
	ResultSet resultSet = null;

	public DataBase() {
		try {
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String connectionString = "Employee.accdb";
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

	public boolean insertRecord(Employee employee) {

		try {
			String insertQ = "INSERT INTO EmployeeTable (Name,Hours) " + "Values ('" + employee.getName() + "',"
					+ employee.getHours() + ")";

			statement.executeUpdate(insertQ);
			closeDbConnection();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean updateRecord(Employee employee, String name) {
		try {
			String updateQ = "UPDATE EmployeeTable SET Hours = " + employee.getHours() + " WHERE " + "name = '"
					+ name + "'";
			statement.executeUpdate(updateQ);
			closeDbConnection();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public boolean deleteRecord(String name) {
		try {

			String deleteQ = "DELETE FROM EmployeeTable WHERE " + "name = '"
					+ name + "'";
			statement.executeUpdate(deleteQ);
			closeDbConnection();
			return true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
	}

	public Employee getInfoByName(String name) {
		Employee emp = null;
		try {

			resultSet = statement.executeQuery("SELECT * FROM EmployeeTable WHERE Name = "+ name );

			emp = new Employee();
			while (resultSet.next()) {
				emp.setName(resultSet.getString(2));
				emp.setHours(resultSet.getFloat(3));
				System.out.println(" name " + emp.getName() + " salary " + emp.getHours());
			}
			closeDbConnection();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} 
		return emp;
	
	}
	
	public void getAllInfo() {
		Employee emp = null;
		try {

			resultSet = statement.executeQuery("SELECT * FROM EmployeeTable");

			emp = new Employee();
			while (resultSet.next()) {
				emp.setName(resultSet.getString(2));
				emp.setHours(resultSet.getFloat(3));
				System.out.println("Name: " + emp.getName() + " Hours: " + emp.getHours());
			}
			closeDbConnection();
		} catch (SQLException e) {

			System.out.println(e.getMessage());
		} 
	
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
