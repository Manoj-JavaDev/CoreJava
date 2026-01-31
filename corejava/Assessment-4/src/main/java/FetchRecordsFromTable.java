import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchRecordsFromTable {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		

		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
	
		
		//"create table teachers (tid int , tname varchar(40), tsubject varchar);"
		
		
		Statement st = con.createStatement();
		String str = "select * from teachers;";
		
		ResultSet rs = st.executeQuery(str);
		
		while(rs.next()) {
			
			System.out.print("Teacher ID = " + rs.getInt(1) + "  ");
			System.out.print("Teacher Name = " + rs.getString(2) + "  ");
			System.out.print("Teaching Subject" + rs.getString(3) + "  ");
			System.out.println();
			
		}
		
	}
}
