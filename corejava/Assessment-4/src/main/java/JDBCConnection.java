import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {

	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		
		st.addBatch("create table teachers (tid int , tname varchar(40), tsubject varchar);");
		st.addBatch("insert into teachers values (1,'Hyder0','telugu');");
		st.executeBatch();
		
		
	}
	
}
