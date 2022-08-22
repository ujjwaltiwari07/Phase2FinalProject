<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Learners Academy</title>
</head>
<body>
<div align="center">
<h2>Login page</h2>
<hr>
<form action="LoginController" method="post">
EmailID		:<input type="email" name="email"><br>
<br>
Password	:<input type="password" name="pass"><br>
<br>
<input type="submit" value="LOGIN">
<input type="reset" value="RESET">
</form>
</div>
</body>
</html>