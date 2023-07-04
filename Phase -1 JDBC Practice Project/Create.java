package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306";
		String username = "root";
		String password = "Praju.s1";
		String query = "Create Database action_movies;";
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			Statement stmt = con.createStatement();
			stmt.execute(query);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		finally {
			con.close();
		}

	}

}
