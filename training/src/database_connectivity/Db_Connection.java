package database_connectivity;

public class Db_Connection 
{
	static java.sql.Connection con = null;

	public static java.sql.Connection db()

	{
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/db_test","root","");
		}
		
		catch (Exception e)
		{
			System.out.println("exxxx"+e);
		}
		return con;
	
	}
	
	
}
