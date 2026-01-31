import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatementDemo {
	
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
	
		
		//"create table teachers (tid int , tname varchar(40), tsubject varchar);"
		
		PreparedStatement ps = con.prepareStatement("insert into teachers values(?,?,?);");
		
		ps.setInt(1, 2);
		ps.setString(2, "manoj");
		ps.setString(3,"English");
		
		ps.executeUpdate();
		
		
	}
	
}
