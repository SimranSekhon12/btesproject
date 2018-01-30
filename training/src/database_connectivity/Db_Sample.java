package database_connectivity;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Db_Sample {
	 java.sql.Connection con;
	 
	public Db_Sample() {
		// TODO Auto-generated constructor stub
		 
		 con = Db_Connection.db();
	}
	
	public static Connection db()
	{
		return null;
	}
	
	public void insert(String username, String password, String contact, String email, String address)
	{
	  
	       
        try 
        	{
        	
            PreparedStatement pd = con.prepareStatement("Insert into registration (username,password,contact,email,address) values(?,?,?,?,?) ");
      
           
            	pd.setString(1, username);
                pd.setString(2, password); 
                pd.setString(3, contact);
                pd.setString(4, email);
                pd.setString(5, address);
                        
                int i = pd.executeUpdate();
                          
                          if(i>0)
                          {
                              System.out.println("Successfully Inserted");
                          }                             	
        	}
        
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
	}
	
	public void select(String name, String pass)
	{
		
		try 
		{
            PreparedStatement pd = con.prepareStatement("select * from registration where username = '"+name+"' and password = '"+pass+"' ");
            ResultSet rs = pd.executeQuery();
            
            while (rs.next()) 
            	{
            	
				/*String unam = rs.getString(2);
				String pswd = rs.getString(3);*/
				String conn = rs.getString(4);
				String mail = rs.getString(5);
				String addr = rs.getString(6);
				
				System.out.println("value is::"+name);
				System.out.println("value is::"+pass);
				System.out.println("value is::"+conn);
				System.out.println("value is::"+mail);
				System.out.println("value is::"+addr);
				
				}
            
		}
		
		catch(Exception e)
		{
			System.out.println(""+e);
		}
		
	}
	
	public void delete (int id)
	{
	  
        try 
        	{
        	
            	PreparedStatement pd = con.prepareStatement("delete from registration where id= '"+id+"'  ");
             
            	int i=   pd.executeUpdate();
         
            		if(i>0)
            		{
            			System.out.println("Successfully Deleted");
            		}	

        	}
        
        catch(Exception e)
        {
        	System.out.println(e);
        }
        
	}

	public static void main(String[] args) 
	{

	
		Scanner sn = new Scanner(System.in);
		
		System.out.println("1. Registration");
		System.out.println("2. Login");
		System.out.println("3. Delete");
		System.out.println("Enter Your choice ::");
		
		Db_Sample obj = new Db_Sample();
		
		int choice = sn.nextInt();
		 switch (choice) 
		 
		 {
		 
		case 1:
			
			System.out.println("Enter you Username ::");
			String username = sn.nextLine();
			
			System.out.println();
			
			System.out.println("Enter you Password ::");
			String password = sn.nextLine();
			
			System.out.println("Enter you Contact ::");
			String contact = sn.nextLine();
			
			System.out.println("Enter you Email ::");
			String email = sn.nextLine();
			
			System.out.println("Enter you Address ::");
			String address = sn.nextLine();
			
			obj.insert(username, password, contact, email, address);
			break;
			
		case 2:
			
			System.out.println("Enter you Username ::");
			String name = sn.next();
			
			System.out.println("  ");
			
			System.out.println("Enter you Password ::");
			String pass = sn.next();
			
			obj.select(name, pass);
			break;
		
		case 3:
			
			System.out.println("enter id no. to be deleted: "+"id");
			int id = sn.nextInt();		
			obj.delete(id);
		    break;
		    
		default:
		    
			break;
		 
		 }
			 
			 
		
	}
	
}

