<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean id="records" type="java.sql.ResultSet" scope="request"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Gasoline eStore</title>

        <!-- CSS -->
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="assets/css/form-elements.css">
        <link rel="stylesheet" href="assets/css/style.css">

        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Favicon and touch icons -->
        <link rel="shortcut icon" href="assets/ico/favicon.png">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="assets/ico/apple-touch-icon-57-precomposed.png">

    </head>

    <body>

        <!-- Content -->
        <div class="top-content">
        	
            <div class="inner-bg">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-8 col-sm-offset-2 text">
                        	<a class="logo" href="index.html"></a>
                            <h1><strong>UST</strong> Gasoline eStore</h1>
                            <div class="table-responsive">
                            	<table class="table table-hover" align="center" border="1" cellpadding="2" cellspacing="2">
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
                            </div>
                            <div class="top-big-link">
                            	<a class="btn btn-link-1" href="index.html" >GO BACK</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            
        </div>
        
       


        <!-- Javascript -->
        <script src="assets/js/jquery-1.11.1.min.js"></script>
        <script src="assets/bootstrap/js/bootstrap.min.js"></script>
        <script src="assets/js/jquery.backstretch.min.js"></script>
        <script src="assets/js/scripts.js"></script>
        
        <!--[if lt IE 10]>
            <script src="assets/js/placeholder.js"></script>
        <![endif]-->

    </body>
</html>