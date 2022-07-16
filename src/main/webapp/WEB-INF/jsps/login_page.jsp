<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login | Here</title>
</head>
<body>
	<h2>Please Login here...</h2>
	
	<hr>
	
	<div>${error}</div>
	<div>${msg}</div>
	
	<form action="verifyLogin" method="post">
		<pre>
			Email id 	<input type="text" name="email"/>
			
			Password 	<input type="password" name="password"/>
			
				<input type="submit" value="Login"/> <a href="forgotPassword">Forgot Password?</a>
		</pre>
	</form>
</body>
</html>