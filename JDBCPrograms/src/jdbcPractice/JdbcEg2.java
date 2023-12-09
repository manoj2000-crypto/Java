package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JdbcEg2 {

	private static final Scanner scanObj = new Scanner(System.in);

	// main method
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection connection = connectWithDB();

		// creating menu driven program
		// Scanner menuDrivenScanner = new Scanner(System.in);

		System.out.println("Choose given option to perform CRUD operation :");
		int option = 0;
		
		while (true) {

			System.out.print("\nType 1.Read \t 2.Insert \t 3.Update \t 4.Delete \t 5.Exit: ");
			try {
				option = scanObj.nextInt();
			} catch (InputMismatchException imme) {
				System.out.println("You have given wrong input! ");
				System.out.println("Choose correct option again! ");
				scanObj.next(); //Clear the invalid input
				//Restart the loop to allow the user to input the correct option
				continue;
			}

			switch (option) {

			case 1:
				System.out.println("\n***READING***");
				readRecordByEmployeeId(connection);
				break;

			case 2:
				System.out.println("\n***INSERTING***");
				insertRecord(connection);
				break;

			case 3:
				System.out.println("\n***UPDATING***");
				updateRecordByEmployeeId(connection);
				break;

			case 4:
				System.out.println("\n***DELETING***");

				System.out.print("\nAre you sure : YES/NO -> ");
				String confirm = scanObj.next();

				if (confirm.equalsIgnoreCase("No"))
					System.out.println("Delete operation failed.");
				else if (confirm.equals("YES"))
					deleteRecordByEmployeeId(connection);
				else
					System.out.println("Type \'YES\' correctly.");
				break;

			case 5:
				System.out.println("\nThank you !!!");
				connection.close();
				System.exit(0);
				break;

			default:
				System.out.println("Please give correct option.");
				break;
			}
		}
	}

	private static void deleteRecordByEmployeeId(Connection connection) throws SQLException {
		final String deleteQuery = "DELETE FROM temp.temp_employee WHERE id = ?";

		System.out.print("Enter Employee id : ");
		int employeeId = scanObj.nextInt();

		PreparedStatement preparedStmt = connection.prepareStatement(deleteQuery);
		preparedStmt.setInt(1, employeeId);

		if (preparedStmt.executeUpdate() > 0) {
			System.out.println("Record deleted successfully");
		} else {
			System.out.println("Record is not deleted !");
		}
	}

	private static void updateRecordByEmployeeId(Connection connection) throws SQLException {
		final String updateQuery = "UPDATE temp.temp_employee SET name = ? WHERE id = ?";

		System.out.print("Enter updated name : ");
		String newName = scanObj.next();

		System.out.print("Enter the id : ");
		String employeeId = scanObj.next();

		PreparedStatement preparedStmt = connection.prepareStatement(updateQuery);
		preparedStmt.setString(1, newName);
		preparedStmt.setString(2, employeeId);

		if (preparedStmt.executeUpdate() > 0) {
			System.out.println("Record updated successfully");
		}

	}

	private static void readRecordByEmployeeId(Connection connection) throws SQLException {
		System.out.print("Enter employee id : ");
		int employeeId = scanObj.nextInt();

		final String readQuery = "SELECT id, name FROM temp.temp_employee WHERE id = ?";

		PreparedStatement preparedStmt = connection.prepareStatement(readQuery);
		preparedStmt.setInt(1, employeeId);

		ResultSet resultsFromDb = preparedStmt.executeQuery();

		for (; resultsFromDb.next();) {
			System.out.println(resultsFromDb.getString(1) + " " + resultsFromDb.getString(2));
		}

	}

	private static void insertRecord(Connection connection) throws SQLException {
		final String insertQuery = "INSERT INTO temp.temp_employee VALUES(?,?,?,?)";

		PreparedStatement preparedStmt = connection.prepareStatement(insertQuery);

		System.out.print("Enter employee id : ");
		int employeeId = scanObj.nextInt(); // ID

		System.out.print("Enter employee name : ");
		String employeeName = scanObj.next(); // NAME

		System.out.print("Enter employee age : ");
		int employeeAge = scanObj.nextInt(); // AGE

		System.out.print("Enter emplyee salary : ");
		float employeeSalary = scanObj.nextFloat(); // SALARY

		preparedStmt.setInt(1, employeeId);
		preparedStmt.setString(2, employeeName);
		preparedStmt.setInt(3, employeeAge);
		preparedStmt.setFloat(4, employeeSalary);

		if (preparedStmt.executeUpdate() > 0) {
			System.out.println("Record inserted successfully");
		}

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