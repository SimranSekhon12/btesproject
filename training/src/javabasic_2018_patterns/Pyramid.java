package javabasic_2018_patterns;
import java.util.Scanner;

public class Pyramid 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("enter number: ");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		
		for(int i=1;i<n;i++)
		{
			
			for(int j=1;j<n-i;j++)
			{
				System.out.print(" ");
			}
			
				for(int k=1;k<=i;k++)
				{
					System.out.print("* ");
				}
				
		System.out.println("");
		}
		
	}

}
