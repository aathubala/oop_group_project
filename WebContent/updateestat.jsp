<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>e update</title>
<link rel="stylesheet" href="css/ebutton.css">
<style type="text/css">
	 body{
	 	background-image: url("images/back2.jpg");
	 	background-size:100% auto;
	 }
</style>
</head>
<body>

	<%
		String id = request.getParameter("id");
		String ecno = request.getParameter("ecno");
		String name = request.getParameter("name");
		String cvn = request.getParameter("cvn");
		String email = request.getParameter("email");
		String phone = request.getParameter("phone");
	%>

<div class="signupSection4">
	  <div class="info">
	    <h2>Mission to Deep Space</h2>
	    <i class="icon ion-ios-ionic-outline" aria-hidden="true"></i>
	    <p>The Future Is Here</p>
	  </div>
	  <form action="eupdate" method="POST" class="signupForm" name="signupform">
	    <h2>Update E-statement</h2>
	    <ul class="noBullet">
	      <li>
	        <label for="id"></label>
	        <input type="text" class="inputFields" id="id" name="id" value="<%= id %>" readonly>
	      </li>
		  <li>
	        <label for="cno"></label>
	        <input type="text" class="inputFields" id="cno" name="cno" placeholder="Card number"  value="<%= ecno %>">
	      </li>
	      <li>
	        <label for="name"></label>
	        <input type="text" class="inputFields" id="name" name="name" placeholder="Card holder name"  value="<%= name %>">
	      </li>
		  <li>
	        <label for="cvn"></label>
	        <input type="text" class="inputFields" id="cvn" name="cvn" placeholder="CVN" value="<%= cvn %>">
	      </li>
	      <li>
	        <label for="email"></label>
	        <input type="email" class="inputFields" id="email" name="email" placeholder="Email" value="<%= email %>">
	      </li>
		  <li>
	        <label for="phone"></label>
	        <input type="text" class="inputFields" id="phone" name="phone" placeholder="Phone" value="<%= phone %>">
	      </li>
	      <li id="center-btn">
	        <input type="submit" id="join-btn" name="join" alt="Join" value="UPDATE">
	      </li>
	    </ul>
	  </form>
	</div>

<script type="text/javascript" src="js/ebutton.js"></script>
</body>
</html>