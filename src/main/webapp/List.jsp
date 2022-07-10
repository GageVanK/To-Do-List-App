<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>To Do List Application</h1>
<h3> To Do List: </h3> 
<form action="Home.jsp">
	1. <%= request.getParameter("item1") %> <br>
	2. <%= request.getParameter("item2") %> <br>
	3. <%= request.getParameter("item3") %> <br>
	4. <%= request.getParameter("item4") %> <br>
	5. <%= request.getParameter("item5") %> <br>
	<br>
	<input type="submit" value="Reset List" />
	
</form>
</body>
</html>