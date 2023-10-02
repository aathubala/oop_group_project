<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>e view</title>
<link rel="stylesheet" href="css/ebutton.css">
<style type="text/css">
	 body{
	 	background-image: url("images/back2.jpg");
	 	background-size:100% auto;
	 }
</style>
</head>
<body>
		<div class="signupSection3">
	  <div class="info">
	    <h2>Mission to Deep Space</h2>
	    <i class="icon ion-ios-ionic-outline" aria-hidden="true"></i>
	    <p>The Future Is Here</p>
	  </div>
	  <form action="estat" method="POST" class="signupForm" name="signupform">
	    <h2>View E-statement</h2>
	    <ul class="noBullet">
	      <li>
	        <label for="cno"></label>
	        <input type="text" class="inputFields" id="cno" name="cno" placeholder="Search from Card number" required/>
	      </li>
	      <li>
	      <li id="center-btn">
	        <input type="submit" id="join-btn" name="join" alt="Join" value="VIEW">
	      </li>
	    </ul>
	  </form>
	</div>
	
	<script type="text/javascript" src="js/ebutton.js"></script>
</body>
</html>