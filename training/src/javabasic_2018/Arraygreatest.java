package javabasic_2018;
import java.util.Scanner;

public class Arraygreatest 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter numbers:");
		int arr[] = new int[5];
		Scanner sn=new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sn.nextInt();
		}
			
			
				int j,temp;
				for(int i=0;i<arr.length;i++)
				{
					for(j=i+1;j<arr.length;j++)
					{
						if (arr[j]>arr[j-1])
								{
									temp=arr[j];
									arr[j]=arr[j-1];
									arr[j-1]=temp;
								}
					}
					
					System.out.println("Numbers are:"+arr[i]);	
				}
				
			
			
				System.out.print("smallest:"+arr[4]); //put 0 for 0th location for greatest

	}

}
