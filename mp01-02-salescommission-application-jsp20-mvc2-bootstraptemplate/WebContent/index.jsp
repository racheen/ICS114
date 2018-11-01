<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
		<style type="text/css">
		#loginForm .has-error .control-label,
		#loginForm .has-error .help-block,
		#loginForm .has-error .form-control-feedback {
		    color: #f39c12;
		}
		
		#loginForm .has-success .control-label,
		#loginForm .has-success .help-block,
		#loginForm .has-success .form-control-feedback {
		    color: #18bc9c;
		}
	</style>
	
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

	<title>Sales Commission Application</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/stylish-portfolio.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,700,300italic,400italic,700italic" rel="stylesheet" type="text/css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

</head>

<body>

    <!-- Navigation -->
    <a id="menu-toggle" href="#" class="btn btn-dark btn-lg toggle"><i class="fa fa-bars"></i></a>
    <nav id="sidebar-wrapper">
        <ul class="sidebar-nav">
            <a id="menu-close" href="#" class="btn btn-light btn-lg pull-right toggle"><i class="fa fa-times"></i></a>
            <li class="sidebar-brand">
                <a href="#top" onclick=$("#menu-close").click();><img src="images/racheen.png" width="30px" height="30px"> &nbsp; RACHEEN</a>
            </li>
            <li>
                <a href="#top" onclick=$("#menu-close").click();>Home</a>
            </li>
            <li>
                <a href="#about" onclick=$("#menu-close").click();>About</a>
            </li>
            <li>
                <a href="#services" onclick=$("#menu-close").click();>Calculator</a>
            </li>
            <li>
                <a href="#services2" onclick=$("#menu-close").click();>Results</a>
            </li>
            <li>
                <a href="#contact" onclick=$("#menu-close").click();>Contact</a>
            </li>
        </ul>
    </nav>

    <!-- Header -->
    <header id="top" class="header">
        <div class="text-vertical-center">
            <h1>Racheen's</h1>
            <h3>Sales Commission Calculator</h3>
            <br>
            <a href="#about" class="btn btn-dark btn-lg">Find Out More</a>
        </div>
    </header>

    <!-- About -->
    <section id="about" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>This calculator will compute your take home pay!</h2>
                    <p class="lead">Try Using the Calculator Now</p>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>

    <!-- Services -->
    <!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->
    <section id="services" class="services bg-success">
        <div class="container">
            <div class="row text-center">
                <div class="col-lg-10 col-lg-offset-1">
                    <form id="loginForm"class="form-horizontal" action="ProcessComputeController" method="post" >
									<div class="form-group">
										<label class="control-label col-sm-3" for="name">Name:</label>
										<div class="col-sm-7">
											<input type="text" name="name" id="name" class="form-control" placeholder="Enter name" required/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3" for="code">Code: </label>
											<div class="col-sm-7">
												<select class="form-control" name="code" id="code">
														<ins>Select Code</ins>
														<option value="A">A</option>
														<option value="B">B</option>
														<option value="C">C</option>
												</select>
											</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-3" for="sales">Sales:</label>
										<div class="col-sm-7">
											<input type="number" name="sales" id="sales" class="form-control" placeholder="Enter sales" min="1" required/>
										</div>
									</div>
									<div class="form-group">
										<label class="control-label col-sm-2"></label>
										<div class="col-sm-7">
												<button type="submit" id="submit" class="btn btn-success col-sm-offset-1">Submit</button> &nbsp; &nbsp; &nbsp; 
												<button type="reset" class="btn btn-warning col-sm-offset-1">Clear</button>
									 	</div>
									</div> 
							</form>
						<!-- /.row (nested) -->
                </div>
                <!-- /.col-lg-10 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
    <!-- About -->
    <section id="about" class="about">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <p class="lead">The results will show here</p>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
    <!-- Services -->
    <!-- The circle icons use Font Awesome's stacked icon classes. For more information, visit http://fontawesome.io/examples/ -->
    <section id="services2" class="services bg-success">
        <div class="container">
            <div class="row text-center">
                <div class="col-lg-10 col-lg-offset-1">
                 <div class="table-responsive">
						<table class="table table-striped">
							<tr>
								<td>Employee Name:</td>
								<td><b>${TakeHomePay.name}
									</b></td>
							</tr>
							<tr>
								<td>Sales Code:</td>
								<td><b> ${TakeHomePay.code}
										</b></td>
							</tr>
							<tr>
								<td>Sales Amount:</td>
								<td><b> ${TakeHomePay.amount}
										</b></td>
							<tr>
								<td>Sales Gross Commission:</td>
								<td><b> ${TakeHomePay.grossCommission}
										</b></td>
							<tr>	
								<td>Sales Commission:</td>
								<td><b>${TakeHomePay.commission}
										</b></td>
							</tr>
							<tr>	
								<td>Take Home Pay:</td>
								<td><b>${TakeHomePay.takeHome}
										</b></td>
							</tr>
							
						</table>
					</div>
						<a href="#services" class="btn btn-dark btn-lg">BACK</a>
					</div>   
                    <!-- /.row (nested) -->
                </div>
                <!-- /.col-lg-10 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
    <!-- Footer -->
    <footer>
        <div id="contact" class="container">
            <div class="row">
                <div class="col-lg-10 col-lg-offset-1 text-center">
                    <h4><strong>Rachel Tumulak</strong>
                    </h4>
                    <p>3CSA</p>
                    <ul class="list-unstyled">
                        <li><i class="fa fa-phone fa-fw"></i> (+63) 9157130346</li>
                        <li><i class="fa fa-envelope-o fa-fw"></i> <a href="http://www.gmail.com">2014073375@ust-ics.mygbiz.com</a>
                        </li>
                    </ul>
                    <br>
                    <ul class="list-inline">
                        <li>
                            <a href="http://www.facebook.com/rmktumulak"><i class="fa fa-facebook fa-fw fa-3x" style="color:green"></i></a>
                        </li>
                        <li>
                            <a href="http://www.twitter.com/rachePUSH"><i class="fa fa-twitter fa-fw fa-3x" style="color:green"></i></a>
                        </li>
                        <li>
                            <a href="http://www.google.com"><i class="fa fa-google fa-fw fa-3x" style="color:green"></i></a>
                        </li>
                    </ul>
                    <hr class="small">
                    <p class="text-muted">Copyright &copy; Racheen 2016</p>
                </div>
            </div>
        </div>
        <a id="to-top" href="#top" class="btn btn-dark btn-lg"><i class="fa fa-chevron-up fa-fw fa-1x"></i></a>
    </footer>

    <!-- jQuery -->
    <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script>
    // Closes the sidebar menu
    $("#menu-close").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });
    // Opens the sidebar menu
    $("#menu-toggle").click(function(e) {
        e.preventDefault();
        $("#sidebar-wrapper").toggleClass("active");
    });
    // Scrolls to the selected menu item on the page
    $(function() {
        $('a[href*=#]:not([href=#],[data-toggle],[data-target],[data-slide])').click(function() {
            if (location.pathname.replace(/^\//, '') == this.pathname.replace(/^\//, '') || location.hostname == this.hostname) {
                var target = $(this.hash);
                target = target.length ? target : $('[name=' + this.hash.slice(1) + ']');
                if (target.length) {
                    $('html,body').animate({
                        scrollTop: target.offset().top
                    }, 1000);
                    return false;
                }
            }
        });
    });
    //#to-top button appears after scrolling
    var fixed = false;
    $(document).scroll(function() {
        if ($(this).scrollTop() > 250) {
            if (!fixed) {
                fixed = true;
                // $('#to-top').css({position:'fixed', display:'block'});
                $('#to-top').show("slow", function() {
                    $('#to-top').css({
                        position: 'fixed',
                        display: 'block'
                    });
                });
            }
        } else {
            if (fixed) {
                fixed = false;
                $('#to-top').hide("slow", function() {
                    $('#to-top').css({
                        display: 'none'
                    });
                });
            }
        }
    });
    // Disable Google Maps scrolling
    // See http://stackoverflow.com/a/25904582/1607849
    // Disable scroll zooming and bind back the click event
    var onMapMouseleaveHandler = function(event) {
        var that = $(this);
        that.on('click', onMapClickHandler);
        that.off('mouseleave', onMapMouseleaveHandler);
        that.find('iframe').css("pointer-events", "none");
    }
    var onMapClickHandler = function(event) {
            var that = $(this);
            // Disable the click handler until the user leaves the map area
            that.off('click', onMapClickHandler);
            // Enable scrolling zoom
            that.find('iframe').css("pointer-events", "auto");
            // Handle the mouse leave event
            that.on('mouseleave', onMapMouseleaveHandler);
        }
        // Enable map zooming with mouse scroll when the user clicks the map
    $('.map').on('click', onMapClickHandler);
        
    $(document).ready(function() {
        $('#loginForm').formValidation({
            framework: 'bootstrap',
            icon: {
                valid: 'glyphicon glyphicon-ok',
                invalid: 'glyphicon glyphicon-remove',
                validating: 'glyphicon glyphicon-refresh'
            },
            fields: {
                name: {
                    validators: {
                        notEmpty: {
                            message: 'The username is required'
                        },
                        stringLength: {
                            min: 6,
                            max: 30,
                            message: 'The username must be more than 6 and less than 30 characters long'
                        },
                        regexp: {
                            regexp: /^[a-zA-Z]+$/,
                            message: 'The username can only consist of alphabetical, number, dot and underscore'
                        }
                    }
                }
            }
        });
    </script>

</body>

</html>
