<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>e insert</title>
<link rel="stylesheet" href="css/ebutton.css">
<style type="text/css">
	 body{
	 	background-image: url("images/back2.jpg");
	 	background-size:100% auto;
	 }
</style>
</head>
<body>
	
		<div class="signupSection2">
	  <div class="info">
	    <h2>Mission to Deep Space</h2>
	    <i class="icon ion-ios-ionic-outline" aria-hidden="true"></i>
	    <p>The Future Is Here</p>
	  </div>
	  <form action="estatement" method="POST" class="signupForm" name="signupform">
	    <h2>Apply E-statement</h2>
	    <ul class="noBullet">
	      <li>
	        <label for="cno"></label>
	        <input type="text" class="inputFields" id="cno" name="cno" placeholder="Card number" required/>
	      </li>
	      <li>
	        <label for="name"></label>
	        <input type="text" class="inputFields" id="name" name="name" placeholder="Card holder name" required/>
	      </li>
		  <li>
	        <label for="cvn"></label>
	        <input type="text" class="inputFields" id="cvn" name="cvn" placeholder="CVN" required/>
	      </li>
	      <li>
	        <label for="email"></label>
	        <input type="email" class="inputFields" id="email" name="email" placeholder="Email" required/>
	      </li>
		  <li>
	        <label for="phone"></label>
	        <input type="text" class="inputFields" id="phone" name="phone" placeholder="Phone" required/>
	      </li>
	      <li id="center-btn">
	        <input type="submit" id="join-btn" name="join" alt="Join" value="INSERT">
	      </li>
	    </ul>
	  </form>
	</div>

<script type="text/javascript" src="js/ebutton.js"></script>
</body>
</html>