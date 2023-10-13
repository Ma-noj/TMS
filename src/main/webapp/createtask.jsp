<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.dv {
	display: flex;
	align-items: center;
	justify-content: space-around;
}

form {
	border: 3px solid blue;
	width: 400px;
	margin: 150px;
	padding: 13px;
}

#input1 {
	width: 200px;
	border: 2px solid green;
	height: 25px;
	display: flex;
	align-items: center;
	justify-content: space-around;
}
</style>
</head>

<body>
	<div class="dv">
		<form action="task" method="post">
			<h1>CREATING TASKS</h1>
			<input id="input1" type="id" placeholder="enter task_id" name="t_id"><br>
			<br> <input type="discription" placeholder="enter discription"
				name="discription"><br> <br> <input type="user_id"
				placeholder="enter user_id" name="user_id"><br> <br>
			<input type="submit" value="submit"> <input type="submit"
				value="cancel">
		</form>
	</div>
</body>
</html>