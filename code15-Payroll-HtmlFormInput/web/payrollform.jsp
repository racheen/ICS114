<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll Form</title>
</head>
<body>
	<h2>Payroll Form</h2>
	<form action="compute.action" method="POST">
		<p>Enter hours worked: <input type="text" name="hoursWorked" id="hoursWorked" /></p>
		<p>Enter payrate: <input type="text" name="payRate" id="payRate" /></p>
		<p><input type="submit" value="Compute Payroll" /></p>
		<p><input type="reset" /></p>
	</form>
</body>
</html>