package sorting_prog;

import java.util.Comparator;

public class Beancomparator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		Beanproduct1 bp1 = (Beanproduct1) o1;
		Beanproduct1 bp2 = (Beanproduct1) o2;
		return bp1.brand.compareTo(bp2.brand);
	}
}

