package bean_class;

public class Mainclass 
{
		public static void main(String [] args)
		{
		Beanclass obj1=new Beanclass (101,"red","abc");
		Beanclass obj2=new Beanclass (102,"blue","xyz");
		Beanclass obj3=new Beanclass (103,"green","pqr");
		Beanclass arr[]={obj1,obj2,obj3};

			for(int i=0;i<arr.length;i++)
			{
				System.out.println("id = "+arr[i].getId());
				System.out.println("color = "+arr[i].getColor());
				System.out.println("name = "+arr[i].getName());
				System.out.println(" ");
			}
		}
}
