package JDBC;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Connection;


public class UpdateQuery {
	
	public static void main(String[] arg) throws SQLException {
		
		Connection con=null;
		
		String url = "jdbc:mysql : //localhost:3306/accountdb";	
 		String user = "root";
 		String pass = "Aparna@04";
 		String sql1 = "Update accounts set balance=balance-? where accountNo=?";
 		String sql2 = "Update accounts set balance=balance+? where accountNo=?";
 		
 		PreparedStatement pst1 = null;
 		PreparedStatement pst2 = null;
 		Scanner sc=null;
 		
		 
	     try {
	    	
	    	//Local driver
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 
	    	 //Create connection
	    	  con = DriverManager.getConnection(url, user, pass);
	    	 
	    	 //Prepared Statement
	    	 con.setAutoCommit(false);
	    	 pst1 = con.prepareStatement(sql1);
	    	 pst2 = con.prepareStatement(sql2);
	    	 sc=new Scanner(System.in);
	    	 System.out.println("Enter product id: ");
	    	 int product=sc.nextInt();
	    	 System.out.println("Please enter id to update: ");
	    	 int id=sc.nextInt();
	    	 System.out.println("Please enter amount to sent: ");
	    	 double s_amount=sc.nextDouble();
	    	 
	    	 pst1.setDouble(1, s_amount);
	    	 pst1.setInt(2, );
	    	 
	    	 pst2.setDouble(1, s_amount);
	    	 pst2.setInt(2, recv_acc);
	    	 
	    	 pst1.executeUpdate();
	    	 pst2.executeUpdate();
	    	 con.commit();
	    	 con.setAutoCommit(true);
	    	 
	     } catch (Exception e) {
	    	 try {
	    		 System.out.println("Error occured. Don't worry your money will refunded within 24 hours ");
	    		 con.rollback();
	    	 } catch (SQLException e1) {
	    		 e1.printStackTrace(); 
	      }
	    finally {
	       try {
	    		 sc.close();
	  			 con.close();
	   		 } catch (SQLException e1) {
	   			 e1.printStackTrace();
    		 }
	       }
	     }
	}

}

