<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="static/css/bootstrap.min.css" rel="stylesheet">
<title>User Login</title>
</head>
<body>
	<script src="static/js/bootstrap.min.js"></script>


	
	<div class ="container">
		<form action="login" method="post">

			<table class="table table-striped">
				<thead>
					<tr>
						<th>Login</th>
					</tr>
				</thead>

				<tr>
					<td>User Name(Email):</td>
					<td><input type="text" name="email" required/></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td> <input type="password" name="password" required/></td> 
				</tr>	
				<tr>
					<td colspan="2"><input type="submit" value="Login" /> ${msg} </td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>