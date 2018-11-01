<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<style>
	#form1 {
	 margin: 130px auto 0; 
	 width: 500px; 
	}

	body {
 	 background-image: url("images/low-poly-texture-11.png");
 	 background-repeat: no-repeat;
 	 background-size:cover;
	}
	</style>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/bootstrap-theme.min.css">
	<title>Sales Commission Application</title>
</head>
<body>
	<div class="navbar navbar-primary navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<p class="navbar-brand"><img src="images/racheen.png" class="img-rounded" width="30px" height="30px"></p>		
			</div>
			<ul class="nav navbar-nav navbar-right">
      			<li><a href="http://www.gmail.com"><img src="images/mail all white.png" height="20px" width="20"></a></li>
      			<li><a href="http://www.facebook.com"><img src="images/facebook all white.png"  height="20px"></a></li>
      			<li><a href="http://www.twitter.com"><img src="images/twitter all white.png" height="20px"></a></li>
    		</ul>
		</div>
	</div>
	<div id="form1" class="container col-sm-offset-1" align="center">
		<div class="row">
			<div class="panel panel-success" >
				<div class="panel-heading"><h3>Sales Commission Calculator</h3></div>
				<div class="panel-group">
					<div class="panel-body">
					<div class="table-responsive">
						<table class="table table-striped">
							<tr>
								<td>Employee Name:</td>
								<td><b> ${TakeHomePay.name}</b></td>
							</tr>
							<tr>
								<td>Sales Code:</td>
								<td><b> ${TakeHomePay.code}</b></td>
							</tr>
							<tr>
								<td>Sales Amount:</td>
								<td><b> ${TakeHomePay.amount}</b></td>
							<tr>
								<td>Sales Gross Commission:</td>
								<td><b> ${TakeHomePay.grossCommission}</b></td>
							<tr>	
								<td>Sales Commission:</td>
								<td><b> ${TakeHomePay.commission}</b></td>
							</tr>
						</table>
					</div>
					<form action="index.html" method="post">
						<button type="submit" id="submit"class="btn btn-primary">BACK</button>
					</form>
					</div>
				</div>
			</div>
		</div>
	 </div>
		
		
		<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
</body>
</html>