//Percentage Update Window...

package update.percentageUpdate;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PercentageUpdateWindow extends JFrame implements ActionListener
{
	Connection con = null;
	PreparedStatement ps = null;

	JFrame     jf;
	JLabel     jl1,jl2;
	JTextField jtf1,jtf2;
	JButton    jb1;
	
    	public PercentageUpdateWindow()
	{
		jf = new JFrame("Percentage Number Update");

                Font font = new Font("Arial",Font.BOLD,20);

		jl1 = new JLabel("Enter Roll Number");
                jl1.setSize(300,40);
                jl1.setLocation(40,20);
                jl1.setFont(font);
                jl1.setForeground(Color.BLACK);
                jl1.setBackground(Color.RED);
                jl1.setHorizontalAlignment(JLabel.CENTER);
                jf.add(jl1);

		jtf1 = new JTextField();
                jtf1.setSize(300,40);
                jtf1.setLocation(40,80);
                jtf1.setFont(font);
                jtf1.setForeground(Color.BLACK);
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

		jl2 = new JLabel("Enter New Percentage");
                jl2.setSize(300,40);
                jl2.setLocation(40,150);
                jl2.setFont(font);
                jl2.setForeground(Color.BLACK);
                jl2.setBackground(Color.RED);
                jl2.setHorizontalAlignment(JLabel.CENTER);
                jf.add(jl2);

		jtf2 = new JTextField();
                jtf2.setSize(300,40);
                jtf2.setLocation(40,210);
                jtf2.setFont(font);
                jtf2.setForeground(Color.BLACK);
                jtf2.setHorizontalAlignment(JTextField.CENTER);
		jtf2.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent ke)
			{
				char ch = ke.getKeyChar();
				
                        	if(jtf2.getText().isEmpty() != true)
                        	{
				        jb1.setVisible(true);
                        	}
				else
                        	{
					jb1.setVisible(false);
                        	}

                        	if(Character.isDigit(ch) || ch == '\b' || ch == '.')
				{
				        if(jtf2.getText().contains(".") && ch == '.')
				        {
					        ke.setKeyChar('\b');
				        }
				        return;
				}
				ke.setKeyChar('\b');
			}
		});
		jf.add(jtf2);

		jb1 = new JButton("UPDATE");
                jb1.setSize(170,40);
                jb1.setLocation(110,300);
                jb1.setFont(font);
                jb1.addActionListener(this);
		jb1.setVisible(false);
                jf.add(jb1);

		jf.setLayout(null);
                jf.setSize(400,450);
                jf.setLocationRelativeTo(null);
                jf.setResizable(false);
                jf.getContentPane().setBackground(new Color(128,128,128));
                jf.setVisible(true);
                jf.setDefaultCloseOperation(jf.HIDE_ON_CLOSE);

	}

	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();
		if(s.equals("UPDATE"))
		{
			try 
			{
				Class.forName("org.postgresql.Driver");
                                con = DriverManager.getConnection("jdbc:postgresql://localhost/tydb","ty","ty@123");

				ps = con.prepareStatement("UPDATE student1 SET per=? where rno=?");
                        	ps.setFloat(1, Float.parseFloat( jtf2.getText() ) );
                        	ps.setInt( 2, Integer.parseInt( jtf1.getText() ) );

                        	int status = ps.executeUpdate();
                        	if(status == 0)
                        	{
					jf.getContentPane().setBackground(Color.RED);

                                	JOptionPane.showMessageDialog(jf,"Record For Roll Num: "+jtf1.getText()+" Is Not Found","ERROR",JOptionPane.ERROR_MESSAGE);
					
					jf.getContentPane().setBackground(new Color(128,128,128));
					jtf1.setText("");
					jtf2.setText("");
                        	}
                        	else
                        	{
                                	jf.getContentPane().setBackground(Color.GREEN);	
					
					JOptionPane.showMessageDialog(jf,"Record For Num: "+jtf1.getText()+" Is Updated Successfully","Success",JOptionPane.PLAIN_MESSAGE);

					jf.getContentPane().setBackground(new Color(128,128,128));
                                        jtf1.setText("");
                                        jtf2.setText("");
                                }
			}
			catch(Exception e)
			{
				JOptionPane.showMessageDialog(jf,e.getMessage(),"Exception",JOptionPane.WARNING_MESSAGE);
			}
		}
	}

	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run()
			{
				new PercentageUpdateWindow();
			}
		});
	}
}
