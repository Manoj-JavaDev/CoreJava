

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/JDBCServlet")
public class JDBCServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		String url = "jdbc:postgresql://localhost:5432/practice_db";
		String user = "postgres";
		String password = "M.manoj@143";

		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

		try (
				Connection con = DriverManager.getConnection(url, user, password);
				Statement st = con.createStatement();
				ResultSet rs = st.executeQuery(
						"SELECT emp_id, empname, empsalary, empexperienceinyears FROM techouts;");) {
				
					while (rs.next()) {
					System.out.print("Id = " + rs.getInt("emp_id") + " ");
					System.out.print("Name = " + rs.getString("empname") + " ");
					System.out.print("Salary = " + rs.getInt("empsalary") + " ");
					System.out.print("Experience = " + rs.getInt("empexperienceinyears") + " ");
					System.out.println();
				}
			}

		catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	
}
}
