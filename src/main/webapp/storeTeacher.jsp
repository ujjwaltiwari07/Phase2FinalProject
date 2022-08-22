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
<h2>Add Teacher Details</h2>
<form action="TeacherController" method="post">
<label>TeacherId</label>
<input type="number" name="tid"><br/>
<label>TeacherName</label>
<input type="text" name="tname"><br/>
<input type="submit" value="Store Teacher">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>