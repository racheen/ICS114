<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix ="s" uri = "/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
	<h2>Meralco Payment Bill</h2>
	<s:form action="compute.action" method="post" >
		<s:textfield label="Enter the number of kilowatt hours consumed" key="kilowattHours"/>
		
		<s:submit value="Submit" />
		<s:reset value="Reset" />
	</s:form>
	
	
</body>
</html>