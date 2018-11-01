<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Gasoline eStore</title>
</head>
<body>
	<h1>Gasoline eStore</h1>
	<p>
		Fuel Type: 		 <b>${gasolina.fuelType}</b> <br>
		Price per Liter: <b>${gasolina.pricePerLiter} </b> <br>
		Purchase Amount: <b>${gasolina.purchaseAmount} </b> <br>
		VAT:			 <b>${gasolina.vat} </b> <br>
		TOTAL AMOUNT:	 <b>${gasolina.totalAmount} </b> <b>${gasolina.numberInWords} </b> <br>
	</p>
	<hr />
<p>
		Click <a href="viewalltransaction.html">here</a> to view ALL
		transactions
	</p>
	<form action="index.html" method="post">
		<p>
			<input type="submit" value="<<GO BACK>>">
	</form>
</body>
</html>