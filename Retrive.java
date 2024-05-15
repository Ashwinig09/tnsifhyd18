package net1.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Retrive {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "ashwini";
		 
		try(Connection conn = DriverManager.getConnection(dbURL, username, password)) {
		 
			String sql = "SELECT * FROM employee";
			 
			Statement statement = conn.createStatement();
			ResultSet result = statement.executeQuery(sql);
			 
			int count = 0;
			 
			while (result.next()){
			    String name = result.getString(2);
			    String id = result.getString(1);
			    String emppassword = result.getString("emppassword");
			    String empemail = result.getString("empemail");
			 
			    String output = "User #%d: %s - %s - %s - %s";
                System.out.println(String.format(output, ++count, id, name, emppassword, empemail ));
			}
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}

	}


}
