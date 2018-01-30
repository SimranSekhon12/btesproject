package swings;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;

import database_connectivity.Db_Connection;
import database_connectivity.Db_Sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Firstframe extends JFrame implements ActionListener
{
JLabel l1,l2,l3,l4,l5;
JTextField txt1,txt2,txt3,txt4,txt5;
JButton btn1,btn2;
JRadioButton rbtn1,rbtn2;
ButtonGroup bg;

	public Firstframe()
	{
		l1=new JLabel("Username");
		l1.setBounds(20,25,80,30);
		add(l1);
		
		l2=new JLabel("Password");
		l2.setBounds(20,75,80,30);
		add(l2);
		
		l3=new JLabel("Contact");
		l3.setBounds(20,125,60,30);
		add(l3);
		
		l4=new JLabel("E-mail");
		l4.setBounds(20,175,60,30);
		add(l4);
		
		l5=new JLabel("Address");
		l5.setBounds(20,225,60,30);
		add(l5);
		
		txt1= new JTextField(20);
		txt1.setBounds(100,22,125,30);
		add(txt1);
		
		txt2= new JTextField(20);
		txt2.setBounds(100,75,125,30);
		add(txt2);
		
		txt3= new JTextField(50);
		txt3.setBounds(100,125,125,30);
		add(txt3);
		
		txt4= new JTextField(12);
		txt4.setBounds(100,175,125,30);
		add(txt4);
		
		txt5= new JTextField(12);
		txt5.setBounds(100,225,125,30);
		add(txt5);
		
		/*bg=new ButtonGroup();
		
		rbtn1= new JRadioButton("Male");
		rbtn1.setBounds(80,100,60,30);
		add(rbtn1);
		bg.add(rbtn1);
		
		rbtn2= new JRadioButton("Female");
		rbtn2.setBounds(140,100,80,30);
		add(rbtn2);
		bg.add(rbtn2);*/
		
		btn1=new JButton("Submit");
		btn1.setBounds(20,300,80,30);
		add(btn1);
		
		btn2=new JButton("Cancel");
		btn2.setBounds(150,300,80,30);
		add(btn2);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
				setLayout(null);
				setVisible(true);
				setSize(400,450);
	}

	public static void main (String args[])
	
	{
		Firstframe f = new Firstframe();
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		// TODO Auto-generated method stub
		if(arg0.getSource()==btn1)
		{
			String username = txt1.getText();
			String password = txt2.getText();
			String contact = txt3.getText();
			String email = txt4.getText();
			String address = txt5.getText();
			
			Db_Sample obj = new Db_Sample();
			obj.insert(username,password,contact,email,address);
			
			new Secondframe();
			/*txt1.setText("hello");*/
		}
		else if(arg0.getSource()==btn2)
		{
			txt1.setBackground(Color.RED);
			txt2.setBackground(Color.RED);
			txt3.setBackground(Color.RED);
			txt4.setBackground(Color.RED);
			txt5.setBackground(Color.RED);
		}
	}

}

