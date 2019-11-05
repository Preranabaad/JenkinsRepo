<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page import="java.util.List"%>
<%@page import="com.lti.model.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View People</title>
<link rel="stylesheet" href="css/Home.css">
</head>
<body >
<h2 >People Club</h2>
<div class="topnav">
 <a href="Home.html" >Home</a>
 <a href="AddUser.jsp" >Registration</a>
 <a href="showUsers.view" class="active">View</a>
 <a href="Remove.jsp">Remove</a>

</div>

	
	<table >
		<tr>
			<th>ID</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>DOB</th>
			<th>City</th>
		</tr>
		<c:forEach var="user" items="${ requestScope.UsersList }">
			
			
			<tr>
				<td> <c:out value="${ user.id }"></c:out> </td>
				<td> <c:out value="${ user.firstname }"></c:out> </td>
				<td> <c:out value="${ user.lastname }"></c:out> </td>
				<td> <c:out value="${ user.DOB }"></c:out> </td>
				<td> <c:out value="${ user.city }"></c:out> </td>
			</tr>
		</c:forEach>
		
	</table>
	</form>
</body>
</html>