package javabasic_2018;
import java.lang.String;
import java.util.Scanner;

public class Biggestsubstring 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner sn=new Scanner(System.in);
		System.out.println("enter string: ");
		String str=sn.nextLine();
		
		
		String longest="";
		int maxlength=0;
		
		String arr[]=str.split(" "); //array of string type		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
			
			if(arr[i].length()>maxlength)
			{
				maxlength=arr[i].length();
				longest=arr[i];
			}
		}
		
		System.out.println("longest substring: "+longest);
	}

}
