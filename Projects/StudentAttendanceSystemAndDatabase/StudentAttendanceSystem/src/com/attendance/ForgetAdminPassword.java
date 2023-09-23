package com.attendance;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.email.EmailUtility;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class ForgetAdminPassword
 */
@SuppressWarnings("serial")
@WebServlet("/ForgetAdminPassword")
public class ForgetAdminPassword extends HttpServlet 
{
	private String host;
	private String port;
	private String user;
	private String pass;

	public void init() 
	{
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email = request.getParameter("email");
		String uname = "";
		String password = "";
		String uname_password = "";
		
		try 
		{
			Connection con = DatabaseConnection.getConnection();
			Statement statement = con.createStatement();
			ResultSet resultset = statement.executeQuery("select uname,password from admin where email='" + email + "'");
			
			while (resultset.next()) 
			{
				uname = resultset.getString(1);
				password = resultset.getString(2); 
				uname_password="Hi "+uname+","+System.lineSeparator()+System.lineSeparator()+ "Your Admin Login Portal"+System.lineSeparator()+"User Name: "+uname + System.lineSeparator()+"Password: "+ password +System.lineSeparator()+System.lineSeparator()+"Thank you."+System.lineSeparator()+"Student Attendance Team.";
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		String message = "Student Attendance System.";
		// String content = request.getParameter("content");
		String resultMessage = "";
		
	
		PrintWriter out = response.getWriter();
		
		try 
		{
			//changing the email address
			EmailUtility.sendEmail(host, port, "manojkale2000@gmail.com", "hijubovsnvasdmyp", email, message,uname_password);
			HttpSession session = request.getSession();
			resultMessage = "Your login user name & password send successfully in your email.";
			session.setAttribute("mail-success", resultMessage);
			
		} 
		catch (Exception ex) 
		{
			ex.printStackTrace();
			resultMessage = "There were an error: " + ex.getMessage();
		} 
		finally 
		{
			//request.setAttribute("Message", resultMessage);
			response.sendRedirect("forgetPassword.jsp");
		}
	}
}
