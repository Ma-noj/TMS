<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


form {
	border: 2px solid blue;
	width: 450px;
	height: 300px;
	margin: 20px;
	padding: 30px;
}

.form-block {
	display: flex;
	align-items: center;
	justify-content: space-around;
	margin-top: 10%;
	
	
	 
}

#input-field {
	border: 2px ;
	width: 200px;
	height: 25px;
	padding: 10px;
	margin: auto;
	border-radius: 15px;
	
}
#f1{
  background:transparent;
  box-shadow:4px 4px 8px #D4E6F1 ,-4px -4px 8px #D4E6F1 ;
  border:0px;
  opacity:85%;
  border-radius:30px;
  
}
.contain{
 background-image: url('https://th.bing.com/th/id/R.effc021defb326f4a559fcafc72e0b20?rik=t6bQeFA3TvgpcQ&riu=http%3a%2f%2fs1.bwallpapers.com%2fwallpapers%2f2014%2f03%2f03%2fsea-desktop-wallpaper_015437546.jpg&ehk=mzIpcVycurZQ0G0P7RNbTpEj46UAwLc07ldrYYZfxQM%3d&risl=&pid=ImgRaw&r=0');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: cover;
}

h1
{
  color: white;
}
::placeholder {
	font-family: "Lucida Console", "Courier New", monospace;
	text-decoration: blink;
	font-weight: bold;
	
}
#input_f{
  
  border-radius: 15px;
  margin:20px;
  width:150px;
  height: 35px;
  border-right: 50px;
  border-left: 50px;
  border-bottom: 100px;
  border-top: 100px;
 
  
}
#input_f:hover{
font-size:15px;
   color:blue;
}

</style>
</head>
<body class="contain">
	<div class="form-block">
		<form id="f1" action="login-verification" method="post">
		<h1>LOG IN</h1>
			<input type="text" name="user_email" id="input-field"
				placeholder="enter email" required> <br> <br> <input
				type="password" name="user_password" id="input-field"
				placeholder="enter password" required> <br> <br> 
				<input type="submit" value="Login" id="input_f">

		</form>
	</div>
</body>
</html>