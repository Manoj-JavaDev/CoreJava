

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/SessionVisits")
public class SessionVisits extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
  

	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		int count = 0;
		HttpSession session = request.getSession();
		
		session.setAttribute("visits", count);
		
	
		
		count  = (int) session.getAttribute("visits") + 1;
		
		session.setAttribute("visits", count);
		
		
		out.println("Current Visits = " + session.getAttribute("visits"));
		
	}

	
	

}
