package javabasic_2018;
import java.util.*;

public class Sortstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("enter string: ");
		Scanner sn=new Scanner(System.in);
		String original=sn.nextLine();
		
		char[] chars = original.toCharArray(); //converts string to character array
		
		Arrays.sort(chars); //Arrays.sort() is a method 
		
		String sorted = new String(chars);
		System.out.println("sorted string: "+sorted);
		
	}

}
