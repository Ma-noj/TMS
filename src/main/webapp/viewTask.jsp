<%@page import="com.ty.tms.dto.Task"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
 .dv table td{
 padding: 20px;
 
}
</style>
</head>
<body>
 <div class="dv">
  <table border="2px"  >
	<%
	List<Task> listOfTask = (List<Task>) request.getAttribute("list_task");
	for (Task task : listOfTask) {
	%>
  
		<tr >
			<td id="t1"><%=task.getT_id()%></td>
			<td id="t2"><%=task.getDicription()%></td>
			<td id="t3"><%=task.getStatus()%></td>
			<td id="t4"><%=task.getUser_id()%></td>
			<td></a></td>
		</tr>



	<%
	}
	%>  
		</table>
		</div>
</body>
</html>