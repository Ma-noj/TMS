<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

form {
	border: 2px solid blue;
	width: 400px;
	height: 200px;
	margin: 20px;
	padding: 30px;
}

.form-block {
	display: flex;
	align-items: center;
	justify-content: space-around;
}

#input-field {
	border: 2px solid green;
	width: 250px;
	height: 30px;
	padding: 10px;
}
</style>
</head>
<body>
	<div class="form-block">
		<form action="login-verification" method="post">
			<input type="text" name="user_email" id="input-field"
				placeholder="enter email"> <br> <br> <input
				type="password" name="user_password" id="input-field"
				placeholder="enter password"> <br> <br> <input
				type="submit" value="Login">

		</form>
	</div>
</body>
</html>