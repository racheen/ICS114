<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Forex Web Application</title>
</head>
<body>
	<h1>Forex Web Application</h1>
		<p> The amount of <b>Php${palitanNgPera.phpAmount}</b>
			is equivalent to  <b>${palitanNgPera.currency}&nbsp; </b>
			<b>${palitanNgPera.results}</b></p> 
		<hr/>
		<form action="index.html" method="post">
			<p><input type="submit" value="<<GO BACK>>">
		</form>
</body>
</html>