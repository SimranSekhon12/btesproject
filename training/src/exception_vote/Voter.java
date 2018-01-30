package exception_vote;

import java.util.Scanner;

public class Voter 
{
public void agecheck(int age) throws Voterexception
{
	if (age<18)
	{
		throw new Voterexception(age);
	}
	else 
	{
		System.out.println("you are 18 and eligible to vote");
	}
}

public static void main (String args [])
{
	Scanner sn = new Scanner (System.in);
	System.out.println("Enter your age: ");
	int age=sn.nextInt();
	Voter v=new Voter();
	try 
	{
		v.agecheck(age);
	}
	catch (Voterexception c)
	{
		System.out.println(c);
	}
}
}
