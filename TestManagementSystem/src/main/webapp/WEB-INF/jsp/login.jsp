<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Test Management System</title>
</head>
<body>
	Login Page
	<form action="loginProcess" method="post">
		<table>
			<tr>
				<td><label>Username:</label></td>
				<td><input type="text" name="username" /></td>
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