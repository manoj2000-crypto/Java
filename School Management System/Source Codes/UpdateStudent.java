//updating information of student using their roll no....

package update;

import update.nameUpdate.NameUpdateWindow;
import update.percentageUpdate.PercentageUpdateWindow;
import update.phoneNumberUpdate.PhnoUpdateWindow;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class UpdateStudent extends JFrame implements ActionListener
{
	Connection con = null;
	PreparedStatement ps = null;

	JFrame       jf;
	JLabel 	     jl;
	JRadioButton jrb1,jrb2,jrb3;

	public UpdateStudent()
	{
		jf = new JFrame("Update Records");

		Font font = new Font("Arial",Font.BOLD,20);

		jl = new JLabel("Select One Of The Following...");
		jl.setSize(400,40);
		jl.setLocation(100,40);
		jl.setFont(font);
		jl.setForeground(Color.BLACK);
		jl.setBackground(new Color(128,128,128));
		jf.add(jl);

		jrb1 = new JRadioButton("Update Name");
                jrb1.setSize(300,40);
                jrb1.setLocation(100,100);
                jrb1.setFont(font);
                jrb1.setForeground(Color.BLACK);
                jrb1.setBackground(new Color(128,128,128));
                jrb1.addActionListener(this);
                jf.add(jrb1);

                jrb2 = new JRadioButton("Update Phone Number");
                jrb2.setSize(300,40);
                jrb2.setLocation(100,200);
                jrb2.setFont(font);
                jrb2.setForeground(Color.BLACK);
                jrb2.setBackground(new Color(128,128,128));
                jrb2.addActionListener(this);
                jf.add(jrb2);

                jrb3 = new JRadioButton("Update Percentage");
                jrb3.setSize(300,40);
                jrb3.setLocation(100,300);
                jrb3.setFont(font);
                jrb3.setForeground(Color.BLACK);
                jrb3.setBackground(new Color(128,128,128));
                jrb3.addActionListener(this);
                jf.add(jrb3);

		ButtonGroup bg = new ButtonGroup();
                bg.add(jrb1);
                bg.add(jrb2);
                bg.add(jrb3);
		
		jf.setLayout(null);
		jf.setSize(500,500);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.getContentPane().setBackground(new Color(128,128,128));
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();

		try
		{
			Class.forName("org.postgresql.Driver");
                        con = DriverManager.getConnection("jdbc:postgresql://localhost/tydb","ty","ty@123");		

			if(s.equals("Update Name"))
			{
				NameUpdateWindow nuw = new NameUpdateWindow();
			}
			if(s.equals("Update Phone Number"))
                	{
				PhnoUpdateWindow puw = new PhnoUpdateWindow();
                	}
			if(s.equals("Update Percentage"))
                	{
				PercentageUpdateWindow peruw = new PercentageUpdateWindow();
                	}
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(jf,e.getMessage(),"Exception",JOptionPane.WARNING_MESSAGE);
		}
	}

	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				new UpdateStudent();
			} 
		});
	}
}
