//AddStudent is for adding a student into database with zero efforts...

package add; // Creating package so we can acess this window in other window...

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class AddStudent extends JFrame implements ActionListener
{
	Connection con = null;
        PreparedStatement ps = null;

	JFrame jf = new JFrame("Add Student");

	JLabel     jl1,  jl2,  jl3,  jl4;
        JTextField jtf1, jtf2, jtf3, jtf4;
        JButton    jb1,  jb2;

	public AddStudent()
	{
		Font font = new Font("Arial", Font.BOLD, 25);

		jl1 = new JLabel("Enter Roll Number :- ");
		jl1.setSize(300,20);
		jl1.setLocation(20,20);
		jl1.setFont(font);
		jl1.setForeground(Color.BLACK);
		jf.add(jl1);

		jtf1 = new JTextField();
		jtf1.setSize(370,30);
		jtf1.setLocation(350,20);
		jtf1.setFont(font);
		jtf1.setHorizontalAlignment(JTextField.CENTER);
		jtf1.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke)
			{
				char ch = ke.getKeyChar();
				if(Character.isDigit(ch) || ch == '\b')
					return;
				ke.setKeyChar('\b');
			}
		});
		jf.add(jtf1);

		jl2 = new JLabel("Enter Student Name :- ");
		jl2.setSize(340,20);
		jl2.setLocation(20,80);
		jl2.setFont(font);
		jl2.setForeground(Color.BLACK);
		jf.add(jl2);

		jtf2 = new JTextField();
		jtf2.setSize(370,30);
		jtf2.setLocation(350,80);
		jtf2.setFont(font);
        	jtf2.setHorizontalAlignment(JTextField.CENTER);
        	jtf2.addKeyListener(new KeyAdapter() {
        		public void keyTyped(KeyEvent ke)
        		{
        			char ch = ke.getKeyChar();
        			if(Character.isLetter(ch) || ch == '\b')
        				return;
        			ke.setKeyChar('\b');
        		}
        	});
		jf.add(jtf2);

		jl3 = new JLabel("Enter Phone No. :- ");
		jl3.setSize(300,20);
		jl3.setLocation(20,140);
		jl3.setFont(font);
		jl3.setForeground(Color.BLACK);
		jf.add(jl3);

		jtf3 = new JTextField();
		jtf3.setSize(370,30);
		jtf3.setLocation(350,140);
		jtf3.setFont(font);
		jtf3.setHorizontalAlignment(JTextField.CENTER);
		jtf3.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke)
			{
				char ch = ke.getKeyChar();
				if(Character.isDigit(ch) || ch == '\b')
				{
					String tfno = jtf3.getText();
					if(tfno.length() == 10)
					{
						ke.setKeyChar('\b');
					}
					return;
				}
				ke.setKeyChar('\b');
			}
		});
		jf.add(jtf3);

		jl4 = new JLabel("Enter Student Marks :- ");
		jl4.setSize(360,20);
		jl4.setLocation(20,200);
		jl4.setFont(font);
		jl4.setForeground(Color.BLACK);
		jf.add(jl4);

		jtf4 = new JTextField();
		jtf4.setSize(370,30);
		jtf4.setLocation(350,200);
		jtf4.setFont(font);
        	jtf4.setHorizontalAlignment(JTextField.CENTER);
		jtf4.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke)
			{
				char ch = ke.getKeyChar();
				if(Character.isDigit(ch) || ch == '\b' || ch == '.')
				{
					String tfper = jtf4.getText();
					if(tfper.contains(".") && ch == '.')
					{
						ke.setKeyChar('\b');
					}
					return;
				}
				ke.setKeyChar('\b');
			}
		});
        	jf.add(jtf4);

		jb1 = new JButton("OK");
		jb1.setSize(120,40);
		jb1.setLocation(200,280);
		jb1.setFont(font);
		jb1.addActionListener(this);
		jf.add(jb1);

		jb2 = new JButton("Reset");
		jb2.setSize(170,40);
		jb2.setLocation(360,280);
		jb2.setFont(font);
		jb2.addActionListener(this);
		jf.add(jb2);

		jf.setSize(740,400);
		jf.setLocationRelativeTo(null);//CENTER THE WINDOW... //setLocation(640,300);
		jf.setLayout(null);
		jf.setResizable(false);
		jf.getContentPane().setBackground(new Color(128,128,128));//grey
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);//DISPOSE_ON_CLOSE
	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();

		if(s.equals("OK"))
		{
			try
			{
				//load driver
				Class.forName("org.postgresql.Driver");
				//Forming a connection
                        	con = DriverManager.getConnection("jdbc:postgresql://localhost/tydb","ty","ty@123");
                        	int    rno  = Integer.parseInt(jtf1.getText());
                        	String name = jtf2.getText();
                        	long   phno = Long.parseLong(jtf3.getText());//
                        	float  per  = Float.parseFloat(jtf4.getText());

				//Prepare SQL
                        	ps = con.prepareStatement("insert into student1 values(?,?,?,?)");
                        	ps.setInt(1,rno);
                        	ps.setString(2,name);
                        	ps.setLong(3,phno);//Postgresql "BigInt" is similar to "long" in java
                        	ps.setFloat(4,per);

				//Execute SQL
				int status = ps.executeUpdate();

                        	if(status == 0)
                        	{
					jf.getContentPane().setBackground(Color.RED);

                                	JOptionPane.showMessageDialog(jf,"Unable to insert !","ERROR",JOptionPane.ERROR_MESSAGE);
                        	}
                        	else
                        	{
					jf.getContentPane().setBackground(Color.GREEN);

					JOptionPane.showMessageDialog(jf,"Record is Saved Successfull !!!","Success",JOptionPane.PLAIN_MESSAGE);
                        	}
				//Close Connection.
				con.close();
			}
			catch(Exception e)
			{//Three Types of showing Exception...
				//e.printStackTrace(); //many numbers of line...with discription
				//System.out.println(e.toString()); //name and discription only...
				JOptionPane.showMessageDialog(jf,e.getMessage(),"Exception",JOptionPane.WARNING_MESSAGE);
			}
		}
		if(s.equals("Reset"))
		{
			jf.getContentPane().setBackground(new Color(128,128,128));//grey

			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");

			jtf1.requestFocus();
		}
	}

	public static void main(String args[])throws Exception
        {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			
			public void run()
			{
				new AddStudent();
			}
		});
	}
}
