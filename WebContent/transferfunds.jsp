<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/transferform.css">
<style>
body {
  background-image: url('images/back.jpg');
  background-size:100% auto;
}
</style>
</head>
<body>	
	<div>
		<p>Transfer Money</p>
		<form class="form-style-7" action="fund" method="post">
		<ul>
		<li>
		    <input type="text" name="accnum">
		    <span>Enter your account number here</span>
		</li>
		<li>
		    <input type="text" name="accno">
		    <span>Enter receiver account number here</span>
		</li>
		<li>
		    <input type="text" name="amount">
		    <span>Enter transfer amount</span>
		</li>
		<li>
		    <input type="submit" value="Confirm Transfer" >
		</li>
		</ul>
		</form>
	</div>
	
	
</body>
</html>