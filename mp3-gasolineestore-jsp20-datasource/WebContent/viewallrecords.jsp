<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="records" type="java.sql.ResultSet" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gasoline eStore</title>
</head>
<body>
	<h1 align="center">Gasoline eStore</h1>
	<table align="center" border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Transaction ID</th>
			<th>Fuel Type</th>
			<th>Price per Liter</th>
			<th>Purchase Amount</th>
			<th>Vat</th>
			<th>Total Amount</th>
		</tr>

		<% while (records.next()) { %>
		<tr align="center">
			<td><%=records.getInt("id") %></td>
			<td><%=records.getString("fuelType") %></td>
			<td><%=records.getDouble("pricePerLiter") %></td>
			<td><%=records.getDouble("purchaseAmount") %></td>
			<td><%=records.getDouble("vat") %></td>
			<td><%=records.getDouble("totalAmount") %></td>
		</tr>
		<% } %>
	</table>
		
	<p align="center">
		Click <a href="index.html">here</a> to go back
	</p>
</body>
</html>