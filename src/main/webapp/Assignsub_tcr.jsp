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
<h2>Assign Subject To Teacher</h2>
<form action="AssignSubject_Teacher" method="post">
<label>Enter Teacher ID</label>
<input type="number" name="tid"><br/>
<label>Enter Subject ID</label>
<input type="text" name="subid"><br/>
<input type="submit" value="Assign Subject">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>