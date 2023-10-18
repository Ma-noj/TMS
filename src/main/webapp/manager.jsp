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
	font-size: 20px;
}

.table-block table th{
	color: rgba(0, 106, 124, 1);
	font-size: 30px;
}



.container-fluid{
	background-color: rgba(255, 106, 124, 1);
	font-size: 20px;
	font-family: Lucida Handwriting;
	
}
.nav.navbar-nav li a{
	color:white;
}
.nav.navbar-nav li{
margin-left: 60px;
}

.navbar-brand {

font-size: 30px;
}

.table-block table th,td{
	padding: 20px;
	
}



</style>
<body>

	<div>
		<nav class="navbar navbar-default">
			<div class="container-fluid">
			<a class="navbar-brand" href="Login.jsp" style="color: white;">Login Page</a>
				<ul class="nav navbar-nav">
					<li ><a href="employee_sign_up.jsp">Add Employee</a></li>
					<li><a href="createtask.jsp">Create Task</a></li>
					<li><a href="view">View All Task</a></li>
				</ul>
			</div>
		</nav>
	</div>

	<div class="table-block">
		<table border="2px solid red" style="padding: 10px; margin: 15px" >
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Email</th>
				<th>Role</th>
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
				<td><a href="remove?user_id=<%=user.getId()%>" style="text-decoration: none; font-size: 20px; color: red"> Remove</a></td>
			</tr>



			<%
			}
			%>
		</table>
	</div>
	<br>


</body>
</html>