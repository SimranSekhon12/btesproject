package javabasic_2018_patterns;
import java.util.Scanner;

public class Xpattern 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("enter number: ");
		Scanner sn=new Scanner(System.in);
		int n=sn.nextInt();
		int arr[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			
			for(int j=0;j<n;j++)
			{
				if(i==j || (i+j)==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
		System.out.println("");
		}
		
	}

}
