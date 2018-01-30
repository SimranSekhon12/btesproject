package javabasic_2018_patterns;
import java.util.Scanner;

public class Primetriangle 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int i,j,k,l,row,counter;
		int[] arr=new int[50];
		int size=0;
		
		for(k=2;k<=100;k++)
		{
			l=k/2;
			counter=0;
			
				for(i=2;i<=l;i++)
				{
					if(k%i==0)
					{
						counter=1;
						break;
					}
				}

					if(counter==0)
					{
					arr[size]=k;
					size++;
					}
		}
			
			System.out.print("enter number of rows: ");
			Scanner sn=new Scanner(System.in);
			row=sn.nextInt();
			
				for(i=0;i<row;i++)
				{
					for(j=0;j<=i;j++)
					{
					System.out.print(arr[j]+" ");
					}
				System.out.println("");
				}
	}

}
