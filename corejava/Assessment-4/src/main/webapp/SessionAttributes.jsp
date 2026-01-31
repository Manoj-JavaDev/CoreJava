<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SessionValue</title>
</head>
<body>

<% session.setAttribute("user", "manoj"); %>
	Session User : <%= session.getAttribute("user") %>

</body>
</html>