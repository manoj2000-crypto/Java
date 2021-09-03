//School Managment System for Adding,Updating and Removing Student From Database

import add.AddStudent;
import remove.RemoveStudent;
import display.DisplayStudent;
import update.UpdateStudent;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

class SchoolManagment extends JFrame implements ActionListener
{
	JFrame     jf;
	JLabel     jl;
	JMenuBar   jmbr;
	JMenu      mStudent;
	JMenuItem  miAddStudent, miRemoveStudent, miUpdateStudent, miDisplayStudent, miExit;

	SchoolManagment()
	{
		jf  = new JFrame();
		
		jf.setLayout(null);

		Font font = new Font("Arial", Font.BOLD, 25);

		jl = new JLabel("Welcome To The School Managment System");
		jl.setSize(700,50);
		jl.setLocation(100,20);
		jl.setFont(font);
		jl.setForeground(new Color(0,255,0));//Lime Color..
		jf.add(jl);

		jmbr = new JMenuBar();	   // R   G  B
		jmbr.setBackground(new Color(180,180,180));//Dark grey..
		jf.setJMenuBar(jmbr);//no need to set location for menubar just use this method...
		
		mStudent = new JMenu("Student");
		jmbr.add(mStudent);

		miAddStudent = new JMenuItem("Add Student");
		miAddStudent.addActionListener(this);
		mStudent.add(miAddStudent);

		miRemoveStudent = new JMenuItem("Remove Student");
		miRemoveStudent.addActionListener(this);
		mStudent.add(miRemoveStudent);

		miUpdateStudent = new JMenuItem("Update Student");
		miUpdateStudent.addActionListener(this);
		mStudent.add(miUpdateStudent);

		miDisplayStudent = new JMenuItem("Display Student");
		miDisplayStudent.addActionListener(this);
		mStudent.add(miDisplayStudent);
		
		mStudent.addSeparator(); //Adding simple line above exit button...

		miExit = new JMenuItem("Exit");
		miExit.addActionListener(this);
		mStudent.add(miExit);

		jf.setTitle(" School Managment System ");
		jf.getContentPane().setBackground(new Color(128,128,128));//grey color..
		jf.setSize(800,600);
		jf.setLocationRelativeTo(null);//method is for center window//setLocation(640,200);
		jf.setResizable(true);//
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		jf.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we)
			{
				int ifYes = JOptionPane.showConfirmDialog(null,"Are you sure ?");

                        	if(ifYes == JOptionPane.YES_OPTION)
                        	{
                                	System.exit(0);
                        	}
			}
		});

	}
	public void actionPerformed(ActionEvent ae)
	{
		String s = (String) ae.getActionCommand();

		if(s.equals("Add Student"))
		{
			AddStudent as = new AddStudent();
		}
		if(s.equals("Remove Student"))
		{
			RemoveStudent rs = new RemoveStudent();
			//System.out.println(" Removig...");
		}
		if(s.equals("Update Student"))
		{
			UpdateStudent us = new UpdateStudent();
			//System.out.println(" Updating...");
		}
		if(s.equals("Display Student"))
		{
			DisplayStudent ds = new DisplayStudent();
			//System.out.println(" Displaing");
		}
		if(s.equals("Exit"))
                {
			int exitYes = JOptionPane.showConfirmDialog(this,"Are you sure ?");
			
			if(exitYes == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		}
	}
	public static void main(String args[])
	{
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run()
			{
				SchoolManagment sm = new SchoolManagment();
			}
		});
	}
}
