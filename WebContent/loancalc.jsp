<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>loan details</title>
<link rel="stylesheet" href="css/formtype.css">
</head>
<body>
	<p>Loan Installment Calculator</p>
	<form action="calc" method="POST">      
		  <input name="time" type="text" class="feedback-input" placeholder="Duration in months" />   
		  <input name="amount" type="text" class="feedback-input" placeholder="Amount" />
		  <h2 class="feedback-input2">Loan type</h2>
	        <select class="feedback-input" id="type" name="type">
				<option class="feedback-input3" value="personal">Personal</option>
				<option class="feedback-input3" value="educational">Educational</option>
				<option class="feedback-input3" value="home">Housing</option>
				<option class="feedback-input3" value="business">Business</option>
				<option class="feedback-input3" value="FD">FD</option>
				<option class="feedback-input3" value="term">Term</option>
			</select>
		  <input type="submit" value="SUBMIT"/>
	</form>
</body>
</html>