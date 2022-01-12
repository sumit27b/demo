<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD BOOK</title>
</head>
<body>
<label><h3>Insert Book Details</h3></label>
<form action="addbooktbl" method="post">
<label>Cost : </label><input type="number" name="cost"><br><br>
<label>Name : </label><input type="text" name="name"><br><br>
<input type="submit" value="Add Book">  
</form>
</body>
</html>