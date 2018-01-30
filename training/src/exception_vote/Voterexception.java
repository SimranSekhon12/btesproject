package exception_vote;

public class Voterexception extends Exception
{
public Voterexception (int age)
{
	super();
	System.out.println("you are not eligible to vote");
}
}
