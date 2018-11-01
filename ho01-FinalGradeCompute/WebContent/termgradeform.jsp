<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Term Grade Form</title>
</head>
<body>
	<h2>Term Grade Form</h2>
	<form action="compute.action" method="POST">
		<p>Enter prelim grade: <input type="text" name="prelimGrade" id="prelimGrade" /></p>
		<p>Enter pre-final grade: <input type="text" name="finalGrade" id="finalGrade" /></p>
		<p><input type="submit" value="Compute Term Grade" /></p>
		<p><input type="reset" /></p>
	</form>
</body>
</html>