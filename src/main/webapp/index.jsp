<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Truth or Dare</title>
</head>
<body>
<h1>Truth or Dare Generator</h1>
<p>Truth, or dare?</p>
<form action="getTruthServlet" method="post">
<input type="submit" name="truthGenerate" value="Truth">
</form>
<form action="getDareServlet" method="post">
<input type="submit" name="dareGenerate" value="Dare">
</form>
</body>
</html>