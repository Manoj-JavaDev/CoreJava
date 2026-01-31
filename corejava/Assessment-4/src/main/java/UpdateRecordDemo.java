import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateRecordDemo {
	
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
		System.out.println("Enter Updated Name for Teacher!!");
		String name = sc.next();
		System.out.println("Enter Updated Teacing Subject !!");
		String subject = sc.next();
		
		 PreparedStatement ps = con.prepareStatement(
			        "UPDATE teachers SET tname = ?, tsubject = ? WHERE tid = ?"
			    );

			    ps.setString(1, name);
			    ps.setString(2, subject);
			    ps.setInt(3, id);
		ps.executeUpdate();
	}
}
