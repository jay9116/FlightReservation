<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<title>Register User</title>
</head>
<body>
	<script src="static/js/bootstrap.min.js"></script>

	<div class="container">
		<form action="registerUser" method="post">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Registration Page:</th>
					</tr>
				</thead>
				<tr>
					<td>First Name:</td>
					<td><input type="text" name="firstName" required /></td>
				</tr>
				<tr>
					<td>Last Name:</td>
					<td><input type="text" name="lastName" required /></td>
				</tr>
				<tr>
					<td>Email:</td>
					<td><input type="text" name="email" required /></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password" required /></td>
				</tr>
				<tr>
					<td>Confirm Password:</td>
					<td><input type="password" name="confirmPassword" required /></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="Register" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>