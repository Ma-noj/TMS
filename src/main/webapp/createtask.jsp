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
	border: 3px solid lightblack;
	width: 450px;
	margin: 150px;s
	padding: 17px;
	
	
}

#input1 {
	width: 250px;
	border: 2px solid lightblack;
	height: 35px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 8px;
}

::placeholder {
	font-family: "Lucida Console", "Courier New", monospace;
	text-decoration: blink;
	font-weight: bold;
}

#input2 {
	width: 250px;
	border: 2px solid lightblack;
	height: 35px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 8px;
}

#input3 {
	width: 250px;
	border: 2px solid lightblack;
	height: 35px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 8px;
}

#input4 {
	display: inline-block;
	margin-left: 90px;
	width: 150px;
	border: 3px solid black;
	border-radius: 5px;
	height: 35px;
	text-shadow: gray;
	font-weight: bold;
}

#input5 {
	display: inline-block;
	width: 150px;
	border: 3px solid black;
	border-radius: 5px;
	height: 35px;
	font-weight: bold;
}
.container{
  background: url('https://wallpapercave.com/wp/wp3621277.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
  

}
#input4:hover {
	font-size: 20px;
	color:green;
}
#input5:hover{
 font-size: 20px;
	color:red;
}


</style>
</head>

<body class="container">
	<div id="grad">
		<div class="dv">
			<form action="task" method="post" class="form">
				<h1 style="color: white" align="center">CREATING TASKS</h1>
				<input id="input1" type="id" placeholder="enter task_id" name="t_id"
					required><br> <input id="input2" type="discription"
					placeholder="enter discription" name="discription" required><br>
				<input id="input3" type="user_id" placeholder="enter user_id"
					name="user_id" required><br> <input id="input4"
					type="submit" value="submit"> <input id="input5"
					type="submit" value="cancel">
			</form>
		</div>
	</div>
</body>
</html>