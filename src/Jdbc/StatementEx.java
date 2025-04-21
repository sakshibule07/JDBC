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
			
//****************************************Creating Table query**************************************************
			stmt.execute("CREATE TABLE Employee(id INT PRIMARY KEY, name VARCHAR(20), position VARCHAR(20))");
			System.out.println("Table done");
			
//you have to comment above create table query to run insert data query
			 
//******************************************Inserting Data query in table **************************************
			 stmt.execute("insert into employee values(101,'sakshi','java developer')");
			 System.out.println("done with record");
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		

	}

}
