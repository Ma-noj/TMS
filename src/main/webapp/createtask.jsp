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
    background-image:linear-gradient(white, pink, black);
	
}

form {
	border: 3px solid blue;
	width: 400px;
	margin: 150px;
	padding: 13px;
	border-radius: 20px;
      
}


#input1 {
	width: 200px;
	border: 2px solid green;
	height: 25px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 15px;
}
#input2 {
	width: 200px;
	border: 2px solid green;
	height: 25px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 15px;
}
#input3 {
	width: 200px;
	border: 2px solid green;
	height: 25px;
	display: flex;
	align-items: center;
	margin: 0 auto;
	border-radius: 15px;
}
#input4 {
	
	display: inline-block;
	margin-left: 90px;
	width:123px;
	border: 3px solid green;
	border-radius: 5px;
	
	

}
#input5 {
	
	display: inline-block;
	width:125px;
	border: 3px solid red;
	border-radius: 5px;
	
	
}




</style>
</head>

<body>
	<div class="dv">
		<form action="task" method="post" class="form">
			<h1 style="color:blue" align="center">CREATING TASKS</h1>
			<input  id="input1" type="id" placeholder="enter task_id" name="t_id" required><br>
			 <input id="input2" type="discription" placeholder="enter discription"
				name="discription" required><br> 
				 <input id="input3" type="user_id"
				placeholder="enter user_id" name="user_id" required><br>
			<input id="input4" type="submit" value="submit"> <input id="input5" type="submit"
				value="cancel">
		</form>
	</div>
</body>
</html>