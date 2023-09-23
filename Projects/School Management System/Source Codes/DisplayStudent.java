//Display Records from the database in table format.....

package display;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class DisplayStudent extends JFrame
{
	Connection con = null;
	Statement  st  = null;

	public DisplayStudent()
	{
		JFrame jf = new JFrame("Display Students Record");
		DefaultTableModel dtm = new DefaultTableModel(new String[]{"rno","name","phno","per"},0);
		try
		{
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://localhost/tydb","ty","ty@123");
			String sql = "SELECT * FROM student1;";
			st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);

			while(rs.next())
			{
				String r   = rs.getString("rno");
				String n   = rs.getString("name");
				String p   = rs.getString("phno");
				String per = rs.getString("per");
				dtm.addRow(new Object[]{r,n,p,per});
			}

			con.close();
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(jf,e.getMessage(),"Exception",JOptionPane.WARNING_MESSAGE);
		}

		JTable jt = new JTable(){
			public boolean editCellAt(int row, int column, java.util.EventObject e){
				return false;//now user has no permission to edit the cell...
			}
		};
		jt.setRowSelectionAllowed(false);//nothing can be selected by the user..
		jt.getTableHeader().setReorderingAllowed(false);//stop user from dragging columns... 
		jt.setModel(dtm);//setting the model to the table...
		
		JScrollPane sp = new JScrollPane(jt,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		sp.setSize(400,300);
		sp.setLocation(50,50);
		jf.add(sp);

		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.getContentPane().setBackground(new Color(128,128,128));
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
	}

	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new DisplayStudent();
			}
		});
	}
}
