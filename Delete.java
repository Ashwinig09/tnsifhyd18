package net1.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ashwini";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM employee WHERE empid=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "124");
		    PreparedStatement statement1 = conn.prepareStatement(sql);
		    statement1.setString(1, "125");
		     
		    int rowsDeleted = statement.executeUpdate();
		    rowsDeleted = statement1.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

}
