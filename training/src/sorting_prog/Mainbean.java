package sorting_prog;

import java.util.*;

public class Mainbean 
{
public static void main (String args[])
{
	/*ArrayList<Beanproduct> al = new ArrayList<Beanproduct>();

		Beanproduct bean = new Beanproduct (2000,"adidas","black");
		Beanproduct bean1 = new Beanproduct (5000,"levis","blue");
		Beanproduct bean2 = new Beanproduct (12000,"tommy","red");
		
		al.add(bean);
		al.add(bean1);
		al.add(bean2);
		
		Collections.sort(al);
		
		for(Beanproduct Beanproduct : al)
		{
			System.out.println(Beanproduct.getbrand());
			System.out.println(Beanproduct.getcolor());
			System.out.println(Beanproduct.getprice());
			System.out.println("");
		}*/
		
		ArrayList<Beanproduct1> al = new ArrayList<Beanproduct1>();
		
		Beanproduct1 bp1 = new Beanproduct1 (1000,"puma","red");
		Beanproduct1 bp2 = new Beanproduct1 (2000,"nike","white");
		Beanproduct1 bp3 = new Beanproduct1 (3000,"umbro","blue");
		
		al.add(bp1);
		al.add(bp2);
		al.add(bp3);
		
		Collections.sort(al,new Beancomparator());
		
		for(Beanproduct1 Beanproduct : al)
		{
			System.out.println(Beanproduct.getbrand());
			System.out.println(Beanproduct.getcolor());
			System.out.println(Beanproduct.getprice());
			System.out.println("");
		}
}
}
