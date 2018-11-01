<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:useBean id="salescoRecordsB" type="java.sql.ResultSet" scope="request" />
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
                <a href="index.jsp" onclick=$("#menu-close").click();>Calculator</a>
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
    
    <section id="services2" class="services bg-success">
        <div class="container">
            <div class="row text-center">
                <div class="col-lg-10 col-lg-offset-1">
                <h1 align="center">Sales Commission Records for Code B</h1>
                <div class="table-responsive">
						<table class="table table-striped">
		<tr>
			<th>Transaction ID</th>
			<th>Name</th>
			<th>Amount</th>
			<th>Gross Commission</th>
			<th>Commission</th>
			<th>Take Home</th>
		</tr>

		<% while (salescoRecordsB.next()) { %>
		<tr align="center">
			<td><%=salescoRecordsB.getInt("id") %></td>
			<td><%=salescoRecordsB.getString("name") %></td>
			<td><%=salescoRecordsB.getDouble("amount") %></td>
			<td><%=salescoRecordsB.getDouble("grossCommission") %></td>
			<td><%=salescoRecordsB.getDouble("commission") %></td>
			<td><%=salescoRecordsB.getDouble("takeHome") %></td>
		</tr>
		<% } %>
	</table>
</div>                </div>
                <!-- /.col-lg-10 -->
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container -->
    </section>
    
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

