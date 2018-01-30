package bean_class;

public class Beanclass 
{
	String name, color;
	int id;
	
	public Beanclass (int id, String color, String name)
	{
		this.id=id;
		this.name=name;
		this.color=color;
	}
	
	public String getName() 
	{
	return name;
	}

	/*public void setName(String name) 
	{
	this.name = name;
	}*/

	public String getColor() 
	{
	return color;
	}

	/*public void setColor(String color) 
	{
	this.color = color;
	}*/
	
	public int getId() 
	{
	return id;
	}
	
	/*public void setId(int id) 
	{
	this.id = id;
	}*/
}
