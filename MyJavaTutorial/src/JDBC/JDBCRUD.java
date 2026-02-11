package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCRUD {
	
	public static void main(String[] arg) throws Exception {
		String url = "jdbc:mysql : //localhost:3306/studentdb";
		
		String user = "root";
		String pass = "Aparna@04";
		
		String qury = "select * from phone";
		
		//loading the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//Established the connection
		Connection con = DriverManager.getConnection(url, user, pass);
		
		//Create statement
		Statement pst = con.createStatement();
		
		//ResultSet
		ResultSet rs = pst.executeQuery(query);
		while(rs.next()) {
			System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));;
			
		}
	}

}
