<%@page import="study.entity.BookEntity"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
List<BookEntity> list = (List<BookEntity>) request.getAttribute("showall");
%>
	<table>
		<tr>
			<th>Book ID</th>
			<th>Book Name</th>
			<th>Book Cost</th>
		</tr>
		<%
  for(BookEntity book : list){
  %>
		<tr>
			<td><%= book.getId() %></td>
			<td><%= book.getName() %></td>
			<td><%= book.getCost() %></td>
		</tr>
		<%
	}
	%>
	</table>
	<br><br><br>
	
	<form action="deletebook1" method="post">
<label>Select Book : </label>
<select name="id">
	<%
	List<BookEntity> list1 = (List<BookEntity>) request.getAttribute("deletebook");
		for(BookEntity bk1 : list){
	%>
	<option value=<%= bk1.getId() %>><%= bk1.getName() %></option>
	<%
	}
	%>
	</select>
	<input type="submit" value="Delete Book">
	</form>
	

</body>
</html>