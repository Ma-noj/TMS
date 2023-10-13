<%@page import="com.ty.tms.dto.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Manager</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<style>

.table-block table th, td {
	padding: 15px;
	align-items: center;
}
</style>
<body>

	<div>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="Login.jsp">Login Page</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="employee_sign_up.jsp">Add
						Employee</a></li>
				<li><a href="createtask.jsp">Create Task</a></li>
				<li><a href="viewTask.jsp">View All Task</a></li>
			</ul>
		</div>
	</nav>
	</div>

	<div class="table-block">
		<table border="2px solid red" style="padding: 6px; margin: 15px">
			<tr>
				<th>id</th>
				<th>name</th>
				<th>email</th>
				<th>role</th>
			</tr>


			<%
			List<User> list = (List<User>) request.getAttribute("employeeList");
			for (User user : list) {
			%>


			<tr>
				<td><%=user.getId()%></td>
				<td><%=user.getName()%></td>
				<td><%=user.getEmail()%></td>
				<td><%=user.getRole()%></td>
			</tr>



			<%
			}
			%>
		</table>
	</div>
	<br>
	
	
</body>
</html>