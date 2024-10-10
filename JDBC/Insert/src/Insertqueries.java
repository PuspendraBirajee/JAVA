import java.sql.*;
public class Insertqueries {
	public static void main(String args[])
	{
		try
		{
	  Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root","Admin1");
	  if(conn!=NULL)
	  {
		  System.out.println("Connection sucessful");
	  }
	}
	}

}
