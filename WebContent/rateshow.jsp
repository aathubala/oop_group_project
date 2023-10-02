<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display rate</title>
<link rel="stylesheet" href="css/rate.css">
</head>
<body>
	<h1><span class="green">Loan Rate</span></h1>

	<table class="container">
		<thead>
		<tr>
			<th><h1>Loan Type</h1></th>
			<th><h1>Rate</h1></th>
		</tr>
		</thead>
		<tbody>
			<c:forEach items="${rateDetails}" var="entry">
		    	<tr>
			    	<td>${entry.key} loan</td>
			    	<td>${entry.value}</td>
		    	</tr>
			</c:forEach>
		</tbody>
	</table>
	
</body>
</html>