<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en"><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

	<meta name="description" content="Entry Management System">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <title>Entry Management System</title>
	<link rel="stylesheet" href="./files/bootstrap.css">
</head>

<body class="Body" style="padding-top: 67.9219px;">
<div id="page_outline">
	<nav class="navbar navbar-default navbar-fixed-top" style="background-color:#2980B9;color:#EAF2F8">
		<div class="container">
		<img src="./files/logo.png" class="img-responsive pull-left" alt="User Image" width="200" height="75">
		<h3 class="pull-right" style="color: #fff;font-family:Times; font-size: 24px;">Power-Board</h3>
		</div>
	</nav>    	
  	<div id="page-wrapper" style="padding-top:50px;">
	<section id="loginbox" class="col-md-4 col-md-offset-4">
	<div class="box box-info">
		<div class="box-header with-border">
			<h3 class="box-title">Enter Vistor Details</h3>
		</div>
		<div class="box-body">
				<form class="form-signin" id="form-signin_v1" action="addvisitor" method="POST">
				
				<div class="form-group has-feedback">
					<input type="text" class="form-control bg-default" id="name" name="name" placeholder="Name" > <span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control bg-default" id="email" name="email" placeholder="Email" > <span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control bg-default" id="mobno" name="mobno" placeholder="Phone No." > <span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control bg-default" id="hostname" name="hostname" placeholder="Host Name" > <span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input type="text" class="form-control bg-default" id="department" name="department" placeholder="Department" > <span class="glyphicon glyphicon-user form-control-feedback"></span>
				</div>
				<div class="row col-xs-6">
					<button type="submit" class="btn btn-primary pull-right">Check-In/Check-Out</button>
				</div>	
				<div class="row col-xs-6">
					<button type="reset" class="btn btn-primary pull-right">Clear</button>
				</div>	
			</form> 
		</div>
	</div>
	</section>
</div>
</div>

</body></html>