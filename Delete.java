package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String dbUrl = "jdbc:mysql://localhost:3306/movie";
		String username = "root";
		String password = "Praju.s1";
		String query = "DELETE from MOVIES where title = 'finding Nemo';";
	
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dbUrl,username,password);
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
		}

	}

}


