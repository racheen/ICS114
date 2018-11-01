<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="en">

<head>
	
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
                <a href="#services" onclick=$("#menu-close").click();>Calculator</a>
            </li>
            <li>
                <a href="viewatransactions.html" onclick=$("#menu-close").click();>Records A</a>
            </li>
            <li>
                <a href="viewbtransactions.html" onclick=$("#menu-close").click();>Records B</a>
            </li>
            <li>
                <a href="viewctransactions.html" onclick=$("#menu-close").click();>Records C</a>
            </li>
            <li>
                <a href="viewalltransactions.html" onclick=$("#menu-close").click();>Records</a>
            </li>
            <li>
                <a href="#contact" onclick=$("#menu-close").click();>Contact</a>
            </li>
        </ul>
    </nav>
    <!-- Header -->
    <header id="top" class="header">
        <div class="text-vertical-center">
            <h1>Sales Commission Calculator</h1>
            <br>
            <a href="#services" class="btn btn-dark btn-lg">USE CALCULATOR</a>
        </div>
    </header>

    <section id="services" class="services bg-success">
        <div class="container">
            <div class="row text-center">
                <div class="col-lg-10 col-lg-offset-1">
                    <form id="loginForm"class="form-horizontal" action="processcompute.html" method="post" >
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
    </script>

</body>

</html>

