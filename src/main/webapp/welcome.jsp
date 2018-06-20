<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <%@ page import= "com.model.payroll.Employee" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll</title>
<jsp:useBean id="authEmp" scope="application" class="com.model.payroll.Employee"></jsp:useBean>
<jsp:setProperty  property="*" name="authEmp"/>

</head>
<body background="back.jpg" onload="history.forward(-1)">
<div align="center"><h1>Payroll</h1></div>
<div align="right"><h2>Welcome,&nbsp;<jsp:getProperty name="authEmp" property="name" /></h2><br><h3><a href="EmployeeLogout">logout</a></h3></div>
<hr>
<b>Your details are as follows:</b>
<table align="center" width="50%">
		<tr><td>Employee ID:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="id" />" disabled="disabled"/></td></tr>
		<tr><td>Password:</td><td><input type="password" value="<jsp:getProperty name="authEmp" property="password" />" disabled="disabled"/></td></tr>
		<tr><td>Name:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="name" />" disabled="disabled"/></td></tr>
		<tr><td>Age:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="age" />" disabled="disabled"/></td></tr>
		<tr><td>Gender:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="gender" />" disabled="disabled"/></td></tr>
		<tr><td>Contact:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="contact" />" disabled="disabled"/></td></tr>
		<tr><td>Address:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="address" />" disabled="disabled"/></td></tr>
		<tr><td>Category:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="category" />" disabled="disabled"/></td></tr>
		<tr><td>Salary:</td><td><input type="text" value="<jsp:getProperty name="authEmp" property="salary" />" disabled="disabled"/></td></tr>
	</table>	
<hr>
<h3><a href="EmployeePaySlip" target="_blank">View pay slip</a></h3>
	

</body>
</html>