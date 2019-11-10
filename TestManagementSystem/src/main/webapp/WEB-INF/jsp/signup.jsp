<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Management System</title>
</head>
<body>
	<h3>Sign up Page</h3>
	<form action="signupRequest" method="post">
		
		<table>
			<tr>
				<td><label>Name:</label></td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><label>UserName:</label></td>
				<td><input type="text" name="username" /></td>
			</tr>
			<tr>
				<td><label>Email Id:</label></td>
				<td><input type="email" name="email" /></td>
			</tr>
			<tr>
				<td><label>Phone Number:</label></td>
				<td><input type="text" name="phone" /></td>
			</tr>
			<tr>
				<td><label>Password:</label></td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		
		</table>
	
	</form>

</body>
</html>