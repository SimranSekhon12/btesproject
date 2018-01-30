package javabasic_2018;
import java.util.Scanner;

public class Array2d 
{

	public static void main(String[] args) 
	{
		
		// TODO Auto-generated method stub
		System.out.println("Enter Numbers:");
		int arr2[][] = new int[3][3];
		Scanner sn=new Scanner(System.in);
		
		for (int i=0;i<arr2.length;i++)
		{
			
			for(int j=0;j<arr2[i].length;j++)
			{
				arr2[i][j]=sn.nextInt();
			}
		System.out.println("");
		}
		
			for (int i=0;i<arr2.length;i++)
			{
			
				for(int j=0;j<arr2[i].length;j++)
				{
					System.out.print(arr2[i][j]+"\t"); // \t is for tab space & \n is for next line.
				}
			System.out.println("");
			}
			
			//put smallest no find logic
		
	}

}
