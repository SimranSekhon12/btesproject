package javabasic_2018_patterns;
import java.util.Scanner;

public class Pascaltriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("enter number: ");
		Scanner sn=new Scanner(System.in);
		int r=sn.nextInt();
		
		for(int i=0;i<r;i++)
		{
			for(int k=r;k>i;k--)
			{
				System.out.print("&");
			}		
			
			int num=1;
				
				for(int j=0;j<=i;j++)
				{
					System.out.print(num+" ");
					num=num*(i-j)/(j+1);
				}

		System.out.println("");
		}
	}

}
