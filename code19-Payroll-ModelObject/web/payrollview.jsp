<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll Details</title>
</head>
<body>
	<h2>Payroll Computational Details Using JSP Struts 2 Taglib</h2>
	
	<p>ID: <B><s:property value="employee.empId"/></B></p>
	<p>Name: <B><s:property value="employee.lastName"/>, <s:property value="employee.firstName"/></B></p>
	<p>Hours Worked: <B><s:property value="employee.hoursWorked"/>Hours</B></p>
	<p>Pay Rate: <B>Php<s:property value="employee.payRate"/></B></p>
	<p>Basic Pay: <B>Php<s:property value="employee.basicPay"/></B></p>
	<p>Overtime Pay: <B>Php<s:property value="employee.overTimePay"/></B></p>
	<p>Gross Pay: <B>Php<s:property value="employee.grossPay"/></B></p>
	<p>Withholding Tax: <B>Php<s:property value="employee.taxRate"/></B></p>
	<p>Net Pay: <B>Php<s:property value="employee.netPay"/></B></p>
	
</body>
</html>