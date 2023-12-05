package jdbcPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ResultSetExample2 {

	public static void main(String[] args) {
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/temp", "root", "manoj");
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			System.out.println("***Ascending Order***\n");
			
			System.out.println("ID\tNAME\tAGE\tSALARY");
			System.out.println("----------------------------");
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM temp_employee limit 5");
			
			while(rs.next()) 
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
			System.out.println("\n***Descending Order***");
			
			System.out.println("ID\tNAME\tAGE\tSALARY");
			System.out.println("----------------------------");
			
			//Dont type this line again because it will throw an exception 
			//stmt.executeQuery("SELECT * FROM temp_employee limit 5");
			
			while(rs.previous()) 
			{
				System.out.println(rs.getString(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4));
			}
			
			rs.close();
			con.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
	}

}
