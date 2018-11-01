<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll Details</title>
</head>
<body>
	<h2>Payroll Computational Details</h2>
	
	<p>Hours Worked: <B>${hoursWorked}Hours</B></p>
	<p>Pay Rate: <B>Php${payRate}</B></p>
	<p>Basic Pay: <B>Php${basicRate}</B></p>
	<p>Overtime Pay: <B>Php${overTimePay}</B></p>
	<p>Gross Pay: <B>Php${grossPay}</B></p>
	<p>Withholding Tax: <B>Php${taxRate}</B></p>
	<p>Net Pay: <B>Php${netPay}</B></p>
	
</body>
</html>