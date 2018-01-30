package sorting_prog;

public class Beanproduct implements Comparable
{
public int price;
public String brand;
public String color;

	public Beanproduct (int price, String brand, String color)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}

		public int getprice()
		{
			return price;
		}

		public String getbrand()
		{
			return brand;
		}

		public String getcolor()
		{
			return color;
		}

			public int compareTo(Object o)
				{
					Beanproduct bp = (Beanproduct)o;
					//return price.compareTo(bp.price);
					
					if (price == bp.price) //we can compare price & brand
						return 0;
					
					else if (price > bp.price) 
					{
						return 1;
					}
					else
					{
						return -1;
					}
				}
}

