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
<h2>Add Subject Details</h2>
<form action="SubjectController" method="post">
<label>SubjectId</label>
<input type="number" name="subid"><br/>
<label>SubjectName</label>
<input type="text" name="subname"><br/>
<input type="submit" value="Store Subject">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>