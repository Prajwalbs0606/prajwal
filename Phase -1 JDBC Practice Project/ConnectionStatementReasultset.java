package jdbcDemo;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.Statement;
	import java.sql.SQLException;

	public class ConnectionStatementReasultset {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			String dbUrl = "jdbc:mysql://localhost:3306/MOVIE"; //connection string
			String username="root";
			String password = "Praju.s1";
			String query = "Select * from MOVIES;";
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(dbUrl, username, password); //connecting DB
			Statement stmt = con.createStatement(); //Execute the query
			ResultSet rs =  (stmt).executeQuery(query); //Save the result after executing the query
			
			while (rs.next())
			{
				System.out.print("TITLE: " + rs.getString("TITLE") + "\t");
				System.out.print("GENERE: " + rs.getString("GENERE") + "\t");
				System.out.print("DIRECTOR: " + rs.getString("DIRECTOR") + "\t");
				System.out.println("RELEASE_YEAR: " + rs.getString("RELEASE_YEAR"));
			}
			
			
		}

	}
