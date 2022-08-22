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
<h2>Display Class Details</h2>
<table border="1">
<tr>
    <th>Class ID</th>
    <th>Section</th>
</tr>
<core:forEach items="${sessionScope.listOfCls}" var="sub">
<tr>
<td><core:out value="${sub.cid}"></core:out></td>
<td><core:out value="${sub.section}"></core:out></td>
</tr>
</core:forEach>
</table>
<br/>
<a href="home.jsp">Go To Main Page!</a>
</div>
</body>
</html>