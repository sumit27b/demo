<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomerServlet">
<label>Customer ID : </label> <input type="text"  name="id"><br><br>
<label>Customer FirstName : </label> <input type="text"  name="fname"><br><br>
<label>Customer Lastname : </label> <input type="text" name="lname"><br><br>
<label>Customer Address : </label> <input type="text"  name="address"><br><br>
<input type="submit" name="Insert Customer">
</form>
</body>
</html>