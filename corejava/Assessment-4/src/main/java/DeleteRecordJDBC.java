import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteRecordJDBC {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";
		
		Class.forName("org.postgresql.Driver");
		
		Connection con = DriverManager.getConnection(url, user, password);
	
		
		//"create table teachers (tid int , tname varchar(40), tsubject varchar);"
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Id to Search");
		int id = sc.nextInt();
		
		String sql = "DELETE FROM teachers WHERE tid = ?;";

	    try (PreparedStatement ps = con.prepareStatement(sql)) {
	        ps.setInt(1, id);

	        int rowsDeleted = ps.executeUpdate();

	        if (rowsDeleted > 0) {
	            System.out.println("Teacher deleted successfully!");
	        } else {
	            System.out.println("No teacher found with ID: " + id);
	        }
	    }
	}
		
	}
	

