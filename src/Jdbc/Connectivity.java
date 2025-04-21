package Jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectivity {

	public static void main(String[] args) {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost/morning","root","root12345");
			if(con==null) {
				System.out.println("not established");
			}
			else {
				System.out.println("established");
			}
		}
		catch(SQLException e){
			
			
		}

	}

}
