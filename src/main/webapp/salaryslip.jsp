<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Salary Slip</title>
<jsp:useBean id="authEmp" scope="application" class="com.model.payroll.Employee"></jsp:useBean>
<jsp:setProperty  property="*" name="authEmp"/>

<jsp:useBean id="ps" scope="application" class="com.model.payroll.PaySlab"></jsp:useBean>
<jsp:setProperty  property="*" name="ps"/>

</head>
<body background="back.jpg">
<div align="center"><h1>Pay Slip</h1></div>
<div align="right"><h2>Welcome,&nbsp;<jsp:getProperty name="authEmp" property="name" /></h2><br><h3><a href="EmployeeLogout">logout</a></h3></div>
<hr>
Your Salary information is as follows:<br>
category <jsp:getProperty name="authEmp" property="category" />

<table align="center" width="50%">
	<tr><th>House Rental Allowance</th><th>Traveling Allowance</th><th>Provident Fund</th></tr>
	<tr>
		<td align="center"><jsp:getProperty name="ps" property="hra"/>%</td>
		<td align="center"><jsp:getProperty name="ps" property="ta"/>%</td>
		<td align="center"><jsp:getProperty name="ps" property="pf"/>%</td>
	</tr>
</table>

<hr>
<table align="center">
	<tr>
		<td align="center">Gross salary</td>
		<td align="center">${gsal}</td>
	</tr>
	<tr>
		<td align="center">Net salary</td>
		<td align="center">${netsal}</td>
	</tr>
</table>	
</body>
</html>