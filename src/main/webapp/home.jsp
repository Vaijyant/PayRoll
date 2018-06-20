<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to the Pay Roll Manage.</title>
</head>
<body background="back.jpg">
	<div align="center">
		<H1>Payroll Manager</H1>
	</div>
	<hr>
	<form action="EmployeeLogin" method="post">
		<table align="center">
			<tr>
				<td>Employee ID:</td>
				<td><input type="text" name="id" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Login" align="middle"/></td>
			</tr>
		</table>

	</form>
	<p align="center">
		<a href="registration.jsp">New? Register here!</a>
	</p>
</body>
</html>