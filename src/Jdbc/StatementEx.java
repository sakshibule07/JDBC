package Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementEx {
	
	
	

	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/morning","root","root12345");
			
			stmt = con.createStatement();
			stmt.execute("CREATE TABLE Employee(id INT PRIMARY KEY, name VARCHAR(20), position VARCHAR(20))");
			 System.out.println("Table done");
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		

	}

}
