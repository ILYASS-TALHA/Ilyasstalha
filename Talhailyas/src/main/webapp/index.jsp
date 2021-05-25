<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<style type="text/css">
@import url('https://fonts.googleapis.com/css?family=Roboto:700&display=swap');
*{
	padding: 0;
	margin: 0;
	
}

.wrapper{
	background: url(bg1.jpg) no-repeat;
	background-size: cover;
	height: 100vh;
}
.navbar{
	position: fixed;
	height: 80px;
	width: 100%;
	top: 0;
	left: 0;
	background: #4682B4;
	
}
.navbar .logo{
	width: 140px;
	height: auto;
	padding: 20px 100px;
}
.navbar ul{
	float: right;
	margin-right: 20px;
}
.navbar ul li{
	list-style: none;
	margin: 0 8px;
	display: inline-block;
	line-height: 80px;
}
.navbar ul li a{
	font-size: 20px;
	font-family: 'Roboto', sans-serif;
	color: white;
	padding: 6px 13px;
	text-decoration: none;
	transition: .4s;
}
a{
	font-size: 20px;
	font-family: 'Roboto', sans-serif;
	color: white;
	padding: 0px 10px;
	text-decoration: none;
	transition: .4s;
}
a.active,
 a:hover{
	background: #4682B4;
	border-radius: 2px;
}
.navbar ul li a.active,
.navbar ul li a:hover{
	background: #B0C4DE;
	border-radius: 2px;
}
.wrapper .center{
	position: absolute;
	left: 50%;
	top: 55%;
	transform: translate(-50%, -50%);
	font-family: sans-serif;
	user-select: none;
	
}
.center h1{
	color: #4682B4;
	font-size: 70px;
	width: 900px;
	font-weight: bold;
	text-align: center;
}
.center h2{
	color: white;
	font-size: 70px;
	font-weight: bold;
	margin-top: 10px;
	width: 885px;
	text-align: center;
}
.center .buttons{
	margin: 35px 280px;
}
.buttons button{
	height: 50px;
	width: 150px;
	font-size: 18px;
	font-weight: 600;
	color: #4682B4;
	background: #B0C4DE;
	outline: none;
	cursor: pointer;
	border: 1px solid #B0C4DE;
	border-radius: 25px;
	transition: .4s;
}
.buttons .btn2{
	margin-left: 25px;
}
.buttons button:hover{
	background: #4682B4;





</style>
	<meta charset="UTF-8">
	<title>Book</title>
	<link rel="stylesheet" href="Style.css">
</head>
<body>
	<div class="wrapper">
			<nav class="navbar">
				<img class="logo" src="logo.png">
				<ul>
					<li><a class="active" href="index.jsp">Home</a></li>
					<li><a href="Inscri.jsp">Sign up</a></li>
					<li><a href="login.jsp">Sign in</a></li>
					
					
				</ul>
			</nav>
			<div class="center">
			<h1>BOOK</h1>
			<h1>Ilyass talha</h1>
			<div class="buttons">
			<button><a href="Inscri.jsp">Sign up/in</a></button>
			
			
		</div>
		</div>
</body>
</html>