<%@page import="com.ty.tms.dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.dv table td {
	padding: 20px;
	background: threedface;
}

.dv {
/*  	display: flex;
	align */-items: center;
	justify-content: space-evenly;
	border-left: 400px;
	border-radius: 25px;
	margin-bottom: 100px;
}
h1 {
color:red;
font-family: "Lucida Console", "Courier New", monospace;
}

input {
	background: lightgreen;
}
</style>
</head>
<body>
	<h1 id="head">list of task based on Employee id</h1>
	<div class="dv">
		<table border="2px">


			<%
			List<Task> listOfTask = (List<Task>) request.getAttribute("listOfTask");
			for (Task task : listOfTask) {
			%>
			<tr>
				<td id="t1"><%=task.getT_id()%></td>
				<td id="t2"><%=task.getDicription()%></td>
				<td id="t3"><%=task.getStatus()%></td>
				<td id="t4"><%=task.getUser_id()%></td>
				<td><a href="update?taskId=<%=task.getT_id()%>"><input
						type="submit" value="completed"></a></td>
			</tr>



			<%
			}
			%>
			
		</table>
	</div>
</body>
</html>