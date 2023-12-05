package jdbcPractice;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetExample3 {

	public static void main(String[] args) { 
		
		/*
		 * Exception is occurring like : Not Updatable. 
		 * because , In my MySQL database, I have not declared Primary key for my table.
		 * After altering the table column for primary key,
		 * My issue got solved.
		 * Query : ALTER table temp_employee MODIFY id int primary key;
		 * */
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/temp", "root", "manoj");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
			ResultSet rs = stmt.executeQuery("SELECT * FROM temp_employee");
			
			System.out.println("Record before update : \n");
			System.out.println("Id\tName\tAge\tSalary");
			System.out.println("-----------------------------");
			
			while(rs.next()) 
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			System.out.println("-----------------------------");
			
			System.out.println("\nProgram is going in pause state to update DB ... ");
			
			System.out.println("Press any enter to continue .... \nwaiting ...");
			
			System.in.read(); //Reading the input from console
			//if we press enter it will show the updated database.
			//but when it is accepting user action , until then we have to update our our database.
			//then hit enter to see the rest of code .
			rs.beforeFirst();
			
			System.out.println("After updating the Data Base.\n");
			System.out.println("Id\tName\tAge\tSalary");
			System.out.println("-----------------------------");
			
			while(rs.next()) 
			{
				rs.refreshRow();
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			System.out.println("-----------------------------");
			
			rs.close();
			con.close();
			
		}
		catch(ClassNotFoundException cnfe) 
		{
			cnfe.printStackTrace();
		}
		catch(SQLException sqle) 
		{
			sqle.printStackTrace();
		}
		catch(IOException ioe) 
		{
			ioe.printStackTrace();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}

}
