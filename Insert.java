package net1.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insert {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ashwini";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "INSERT INTO employee (empid, empname, emppassword, empemail) VALUES (?, ?, ?, ?)";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    
		 
		    statement.setString(1, "126");
		    statement.setString(2, "Ajay Reddy");
		    statement.setString(3, "ajay");
		    statement.setString(4, "ajay@microsoft.com");
		    statement.setString(1, "127");
		    statement.setString(2, "Ashwini");
		    statement.setString(3, "ashu");
		    statement.setString(4, "ashu@microsoft.com");
		    statement.setString(1, "124");
		    statement.setString(2, "Varsha Goud");
		    statement.setString(3, "Varsha");
		    statement.setString(4, "varsha@microsoft.com");
		    statement.setString(1, "125");
		    statement.setString(2, "Anjali");
		    statement.setString(3, "anju");
		    statement.setString(4, "anjali@microsoft.com");
		    
		     
		    int rowsInserted = statement.executeUpdate();
		    if (rowsInserted > 0) {
		        System.out.println("A new user was inserted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

}
}
