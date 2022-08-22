<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>Assign Class To Student</h2>
<form action="AssignClass_Student" method="post">
<label>Enter Student ID</label>
<input type="number" name="sid"><br/>
<label>Enter Class ID</label>
<input type="text" name="cid"><br/>
<input type="submit" value="Assign Class">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>