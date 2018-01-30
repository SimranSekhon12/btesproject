package swings;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import database_connectivity.Db_Sample;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Secondframe extends JFrame implements ActionListener 
{
	JLabel l1,l2,l3;
	JTextField txt1,txt2;
	JButton btn1,btn2,btn3;
	/*JPasswordField p;*/
	
	public Secondframe() 
	{
		l1=new JLabel("Login Page");
		l1.setBounds(115,20,180,50);
		add(l1);
		
		l2=new JLabel("UserName");
		l2.setBounds(20,100,80,30);
		add(l2);
		
		l3=new JLabel("PassWord");
		l3.setBounds(20,180,60,30);
		add(l3);
		
		txt1= new JTextField(20);
		txt1.setBounds(100,100,100,30);
		add(txt1);
		
		txt2= new JTextField(30);
		txt2.setBounds(100,180,100,30);
		add(txt2);
		
		/*p=new JPassword(20)
		 p.setBounds(90,50,80,30)
		 p.setEchoChar('*')
		 add(p);*/
		
		btn1=new JButton("Submit");
		btn1.setBounds(20,275,80,30);
		add(btn1);
		
		btn2=new JButton("Cancel");
		btn2.setBounds(150,275,80,30);
		add(btn2);
		
		btn3=new JButton("Delete");
		btn3.setBounds(85,325,80,30);
		add(btn3);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setLayout(null);
		setVisible(true);
		setSize(400,450);
	}


	public static void main (String args[])
	
	{
		Secondframe s = new Secondframe();
	}
	
	public void actionPerformed(ActionEvent arg1) 
	{
		// TODO Auto-generated method stub
		if(arg1.getSource()==btn1)
		{
			String name = txt1.getText();
			String pass = txt2.getText();
			Db_Sample obj1 = new Db_Sample();
			obj1.select(name, pass);
			
		}
		else if(arg1.getSource()==btn2)
		{
			txt1.setBackground(Color.RED);
			txt2.setBackground(Color.RED);
		}
	}
	
}
