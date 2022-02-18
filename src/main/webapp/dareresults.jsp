<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Here's your dare</title>
</head>
<body>
<p>${dareResult.generateDare()}</p>
<form action="getDareServlet" method="post">
<input type="submit" name="dareGenerate" value="Generate a Dare?">
</form>
<form action="getTruthServlet" method="post">
<input type="submit" name="truthGenerate" value="Generate a Truth?">
</form>
<a href="index.jsp">Return to main page</a>
</body>
</html>