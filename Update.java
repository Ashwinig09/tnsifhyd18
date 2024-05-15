package net1.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Update {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ashwini";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "UPDATE employee SET empname=?, emppassword=?, empemail=? WHERE empid=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "Varsha Goud");
		    statement.setString(2, "varsha1");
		    statement.setString(3, "varsha@microsoft.com");
		    statement.setString(4, "124");
		    PreparedStatement statement1 = conn.prepareStatement(sql);
		    statement1.setString(1, "Ajay Reddy");
		    statement1.setString(2, "ajay3");
		    statement1.setString(3, "ajay@microsoft.com");
		    statement1.setString(4, "126");
		     
		    int rowsUpdated = statement.executeUpdate();
		    rowsUpdated = statement1.executeUpdate();
		    if (rowsUpdated > 0) {
		        System.out.println("An existing user was updated successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
