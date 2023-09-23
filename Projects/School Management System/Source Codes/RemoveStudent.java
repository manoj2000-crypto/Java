//Remove student using roll number....

package remove;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class RemoveStudent extends JFrame implements ActionListener
{
	private static JFrame     jf;
	private static JTextField jtf;

	public RemoveStudent()
	{
		jf = new JFrame("REMOVE STUDENT");
		
		final Font font = new Font("Arial",Font.BOLD,25);

		final JLabel jl = new JLabel("Enter Roll Number To Remove The Student");
		jl.setSize(650,40);
		jl.setLocation(30,30);
		jl.setFont(font);
		jl.setForeground(Color.BLACK);
		jf.add(jl);

		jtf = new JTextField();
		jtf.setSize(200,40);
		jtf.setLocation(240,100);
		jtf.setFont(font);
		jtf.setHorizontalAlignment(JTextField.CENTER);
		jf.add(jtf);

		final JButton jb = new JButton("REMOVE");
		jb.setSize(170,50);
		jb.setLocation(255,200);
		jb.setFont(font);
		jb.addActionListener(this);
		jf.add(jb);

		jf.setSize(680,330);
		jf.setLocationRelativeTo(null);
		jf.setResizable(false);
		jf.getContentPane().setBackground(new Color(128,128,128));
		jf.setLayout(null);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();
		if(s.equals("REMOVE"))
		{
			try
			{
				Connection con = null;
				PreparedStatement ps = null;

				Class.forName("org.postgresql.Driver");
				con = DriverManager.getConnection("jdbc:postgresql://localhost/tydb","ty","ty@123");
				int rno = Integer.parseInt(jtf.getText());
				ps = con.prepareStatement("DELETE FROM student1 WHERE rno = ?");
                        	ps.setInt(1,rno);

				int option = JOptionPane.showConfirmDialog(jf,"Are you sure ?");

                                if(option == JOptionPane.YES_OPTION)
                                {
                                        int status = ps.executeUpdate();
					if(status == 0)
                                	{
                                        	jf.getContentPane().setBackground(Color.RED);
                                        	JOptionPane.showMessageDialog(jf,"Unable To Delete !","ERROR",JOptionPane.ERROR_MESSAGE);
						jtf.setText("");
						jtf.requestFocus();
						jf.getContentPane().setBackground(new Color(128,128,128));
                                	}
                                	else
                                	{
                                        	jf.getContentPane().setBackground(Color.GREEN);
                                        	JOptionPane.showMessageDialog(jf,"Record Deleted Successfully !!!","SUCCESS",JOptionPane.PLAIN_MESSAGE);
						jtf.setText("");
						jtf.requestFocus();
						jf.getContentPane().setBackground(new Color(128,128,128));
                                	}
                                }
				if(option == JOptionPane.CANCEL_OPTION)
				{
					jtf.setText("");
					jtf.requestFocus();
					jf.getContentPane().setBackground(new Color(128,128,128));
				}
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(jf,e.getMessage(),"EXCEPTION",JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new RemoveStudent();
			}
		});
	}
}
