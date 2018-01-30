package javabasic_2018;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Democlass 
{

	int getdata(int marks1, int marks2, int marks3)
	{
		int add=marks1+marks2+marks3;
		return add;
	}
	
	void details(String name, int rollno)
	{
		System.out.println("Name is: "+name);
		System.out.println("Roll No is: "+rollno);
	}
	
	void calculate(int add)
	{
		int avg=add*100/300;
		System.out.println("Percentage is: "+avg);
	}
	
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		Democlass obj=new Democlass();
		
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(r);
		
		System.out.println("Enter Name & Roll No. ");
		String name=br.readLine();
		int rollno=Integer.parseInt(br.readLine());
		obj.details(name, rollno);
		
		System.out.println("Enter marks in 3 subjects ");
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int var=obj.getdata(n1,n2,n3);
		System.out.println("total marks: "+var);
		
		obj.calculate(var);
	}

}
