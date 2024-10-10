import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="Admin1";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			if(con!=null)
				System.out.print("connected to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
