package javabasic_2018_patterns;
import java.util.Scanner;

public class Leftriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.out.println("enter number: ");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				System.out.print("*");
			}
		System.out.println("");
		}
	}

}
