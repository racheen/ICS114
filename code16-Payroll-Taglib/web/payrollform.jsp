<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Payroll Form</title>
</head>
<body>
	<h2>Payroll Form Using Traditional HTML</h2>
	<form action="compute.action" method="POST">
		<p>Enter ID: <input type="text" name="empId" id="empId" /></p>
		<p>Enter Lastname: <input type="text" name="lastName" id="lastName" /></p>
		<p>Enter Firstname: <input type="text" name="firstName" id="firstName" /></p>
		<p>Enter Hours worked: <input type="text" name="hoursWorked" id="hoursWorked" /></p>
		<p>Enter Payrate: <input type="text" name="payRate" id="payRate" /></p>
		
		<p><input type="submit" value="Compute Payroll" /></p>
		<p><input type="reset" /></p>
	</form>
	
	<h2>Payroll Form Using Struts2 Taglib</h2>
	<s:form action="compute.action" method="post" >
		<s:textfield label="Enter ID" key="empId"/>
		<s:textfield label="Enter Last Name" key="lastName"/>
		<s:textfield label="Enter First Name" key="firstName"/>
		<s:textfield label="Enter Hours Worked" key="hoursWorked"/>
		<s:textfield label="Enter Payrate" key="payRate"/>
		
		<s:submit value="Compute Payroll" />
		<s:reset value="Reset" />
	</s:form>
	
	
</body>
</html>