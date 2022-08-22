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
<h2>Add Class Details</h2>
<form action="ClassController" method="post">
<label>ClassId</label>
<input type="number" name="cid"><br/>
<label>Section</label>
<input type="text" name="section"><br/>
<input type="submit" value="Store Class">
<input type="reset" value="reset">
</form>
<br/>
<a href="home.jsp">Main Page</a>
</div>
</body>
</html>