<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.time.LocalDateTime" %>
<!DOCTYPE html>
<html>
<body>
<% out.println("<h1>Current Date and Time : " + LocalDateTime.now() + "</h1>"); %>

</body>
</html>