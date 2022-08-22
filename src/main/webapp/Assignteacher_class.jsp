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
<h2>Assign Teacher to Class</h2>
<form action="AssignTeacher_Class" method="post">
<label>Enter Teacher ID</label>
<input type="number" name="tid"><br/>
<label>Enter Class ID</label>
<input type="text" name="cid"><br/>
<input type="submit" value="Assign Teacher">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>