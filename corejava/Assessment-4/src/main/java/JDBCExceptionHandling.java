import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExceptionHandling {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		
		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";
		Class.forName("org.postgresql.Driver");
		try (Connection con = DriverManager.getConnection(url, user, password)) {
			
			Statement st = con.createStatement();
			
			String str ="create table Books(book_number int , book_name varchar(30), author varchar(50);";
			
			st.executeUpdate(str);
			
		}
		
		catch (SQLException e) {
			System.out.println(e);
		}
		
	}
}
