<%@ page language="java" contentType="text/html"%>
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee Records</title>
</head>
<body>

<h3>Displaying Employee Records Using JDBC</h3>

<table border="1">
<tr>
    <th>Employee Id</th>
    <th>Employee Name</th>
    <th>Salary</th>
    <th>Experience (Years)</th>
</tr>

<%
String url = "jdbc:postgresql://localhost:5432/practice_db";
String user = "postgres";
String password = "M.manoj@143";

try {
    Class.forName("org.postgresql.Driver");

    try (
        Connection con = DriverManager.getConnection(url, user, password);
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(
            "SELECT emp_id, empname, empsalary, empexperienceinyears FROM techouts"
        );
    ) {
        while (rs.next()) {
%>
<tr>
    <td><%= rs.getInt("emp_id") %></td>
    <td><%= rs.getString("empname") %></td>
    <td><%= rs.getInt("empsalary") %></td>
    <td><%= rs.getInt("empexperienceinyears") %></td>
</tr>
<%
        }
    }
} 
catch (Exception e) {
    out.println("Error: " + e.getMessage());
}
%>

</table>

</body>
</html>
