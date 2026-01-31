<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ReadFormData</title>
</head>
<body>

<% 
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
%>

</body>
</html>