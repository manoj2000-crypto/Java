package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JdbcEg2 {

	private static final Scanner scanObj = new Scanner(System.in) ;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = connectWithDB();
		insertRecord(connection);
		//readRecordByCarNum(connection);
		//updateRecordByCarNum(connection);
		//deleteRecordByCarNum(connection);
	}

//	private static void deleteRecordByCarNum(Connection connection) throws SQLException {
//	final String deleteQuery = "DELETE FROM temp.temp_employee WHERE id = ?";
//	System.out.println("Enter id number you want to delete details...");
//	int id = scanObj.nextInt();
//	PreparedStatement preparedStmt = connection.prepareStatement(deleteQuery);
//	preparedStmt.setString(1, id);
//	if(preparedStmt.executeUpdate() > 0) {
//		System.out.println("record deleted successfully");
//	}
//	else 
//	{
//		System.out.println("Record is not deleted !");
//	}
//	connection.close();
//	}

//	private static void updateRecordByCarNum(Connection connection) throws SQLException {
//		final String updateQuery = "UPDATE temp.temp_employee SET name = ? WHERE id = ?";
//		System.out.print("Enter name that you want to update details : ");
//		String name = scanObj.next();
//		System.out.print("Enter the id of the employee : ");
//		String carName = scanObj.next();
//		PreparedStatement preparedStmt = connection.prepareStatement(updateQuery);
//		preparedStmt.setString(1, carName);
//		preparedStmt.setString(2, carNumber);
//		if(preparedStmt.executeUpdate() > 0) {
//			System.out.println("record updated successfully");
//		}
//		connection.close();
//		
//	}

//	private static void readRecordByCarNum(Connection connection) throws SQLException {
//		System.out.println("Enter id number you want to see the details...");
//		int id = scanObj.nextInt();
//		final String readQuery = "SELECT id, name FROM temp.temp_employee WHERE id = ?"; 
//		PreparedStatement preparedStmt = connection.prepareStatement(readQuery);
//		preparedStmt.setInt(1, id);
//		ResultSet resultsFromDb = preparedStmt.executeQuery();
//		for(; resultsFromDb.next();) {
//			System.out.println(resultsFromDb.getString(1)+" "+resultsFromDb.getString(2));
//		}
//		connection.close();
//	}

	private static void insertRecord(Connection connection) throws SQLException {
		final String insertQuery = "INSERT INTO temp.temp_employee VALUES(?,?,?,?)";
		PreparedStatement preparedStmt = connection.prepareStatement(insertQuery);
		System.out.print("Enter four values : ");
		int id = scanObj.nextInt();
		String name= scanObj.next();
		int age = scanObj.nextInt();
		float salary = scanObj.nextFloat();
		preparedStmt.setInt(1, id);
		preparedStmt.setString(2, name);
		preparedStmt.setInt(3, age);
		preparedStmt.setFloat(4, salary);
		if(preparedStmt.executeUpdate() > 0) {
			System.out.println("record inserted successfully");
		}
		connection.close();
	}

	private static Connection connectWithDB() throws ClassNotFoundException, SQLException {
		final String userName = "root";
		final String password = "manoj"; 
		final String connectionUrl = "jdbc:mysql://127.0.0.1:3306?user=root";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection establishConn = DriverManager.getConnection(connectionUrl, userName, password);
		return establishConn;
	}

}