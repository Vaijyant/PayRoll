<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register Yourself</title>
</head>
<body background="back.jpg">
<div align="center"><H1>Registeration Form</H1></div>
<hr>
<form action="EmployeeRegistration" method="post">
	<table>
		<tr><td>Employee ID:</td><td><input type="text" name="id"/></td></tr>
		<tr><td>Password:</td><td><input type="password" name="password"/></td></tr>
		<tr><td>Confirm Password:</td><td><input type="password" name="cpassword"/></td></tr>
		<tr><td>Name:</td><td><input type="text" name="name"/></td></tr>
		<tr><td>Age:</td><td><input type="text" name="age"/></td></tr>
		<tr><td>Gender:</td><td><input type="radio" name="gender" value="male">Male 
			<input type="radio" name="gender" value="female">Female<td></tr>
		<tr><td>Contact:</td><td><input type="text" name="contact"/></td></tr>
		<tr><td>Address:</td><td><input type="text" name="address"/></td></tr>
		<tr><td>Category:</td><td><select name="category">
  								<option value="1">A</option>
  								<option value="2">B</option>
  								<option value="3">C</option></select></td></tr>
		<tr><td>Salary:</td><td><input type="text" name="salary"/></td></tr>
	</table>
<input type="submit" value="Register"/>
</form>
</body>
</html>