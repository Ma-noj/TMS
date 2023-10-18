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
	margin: 150px;
	padding: 17px;
	border-radius: 20px;
	background-image: linear-gradient(white, pink, black);
}

#input1 {
	width: 200px;
	border: 2px solid lightblack;
	height: 27px;
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
	width: 200px;
	border: 2px solid lightblack;
	height: 27px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 8px;
}

#input3 {
	width: 200px;
	border: 2px solid lightblack;
	height: 27px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 8px;
}

#input4 {
	display: inline-block;
	margin-left: 90px;
	width: 123px;
	border: 3px solid black;
	border-radius: 5px;
	height: 30px;
	text-shadow: gray;
	font-weight: bold;
}

#input5 {
	display: inline-block;
	width: 125px;
	border: 3px solid black;
	border-radius: 5px;
	height: 30px;
	font-weight: bold;
}
.container{
  background: url('https://th.bing.com/th/id/OIP.7txHyDBuHVQ1fFDF9eVMNgHaFj?pid=ImgDet&rs=1');

}


</style>
</head>

<body class="container">
	<div id="grad">
		<div class="dv">
			<form action="task" method="post" class="form">
				<h1 style="color: black" align="center">CREATING TASKS</h1>
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