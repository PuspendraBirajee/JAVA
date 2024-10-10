package net.birajee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/";
		String user="root";
		String password="Admin1";

		try {
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stm=con.createStatement();
			String sql="SELECT eid,first,last,age FROM EMPLOYEE";
			ResultSet rs=stm.executeQuery(sql);
			while(rs.next()) {
				System.out.print("EID:"+rs.getInt("eid"));
				System.out.print(",Age:"+rs.getInt("age"));
				System.out.print(",First:"+rs.getInt("first"));
				System.out.println(",Last:"+rs.getInt("last"));
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}

}
