<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remove</title>
<link rel="stylesheet" href="css/Home.css">
<script src="js/AddForm.js"></script>
</head>
<body>
<h2 >People Club</h2>
<div class="topnav">
 <a href="Home.html" >Home</a>
 <a href="AddUser.jsp" >Registration</a>
 <a href="showUsers.view" >View</a>
 <a href="Remove.jsp" class="active">Remove</a>

    </div>
	<form action="delete.do" id="frm" method="post">
		<table>
			<tr>
				<td>Id</td>
				<td><input type="text" name="id" id="id"></td>
			</tr>
			<tr>
				<td colspan="2"><input type="button" value="Delete" onclick="deleteUser();"></td>
			</tr>
			
</body>
</html>