

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DoPostServlet")
public class DoPostServlet extends HttpServlet {
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out =  response.getWriter();
		String user = request.getParameter("username").trim();
		String password = request.getParameter("password").trim();
		
		if(user.length() != 0 && password.length() != 0 ) {
			out.println("<h1>User Name You Have Entered is : " + user +"</h1><br><br>");
			out.println("<h1>Password you have entered is : " + password + "</h1><br><br>");
		}
		else {
			out.println("Enter Valid Credentials !!");
			response.sendRedirect("login.html");
		}
		
	}

}
