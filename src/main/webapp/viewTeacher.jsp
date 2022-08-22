<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h2>Display Teacher Details</h2>
<table border="1">
<tr>
    <th>TeacherID</th>
    <th>TeacherName</th>
</tr>
<core:forEach items="${sessionScope.listOftcr}" var="tcr">
<tr>
<td><core:out value="${tcr.tid}"></core:out></td>
<td><core:out value="${tcr.tname}"></core:out></td>
</tr>
</core:forEach>
</table>
<br/>
<a href="home.jsp">Go To Main Page!</a>
</div>
</body>
</html>