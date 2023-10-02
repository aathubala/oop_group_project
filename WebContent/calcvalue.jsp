<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Installment fee</title>
<link rel="stylesheet" href="css/formtype.css">
</head>
<body>
	<%
		double value = (Double)request.getAttribute("fee");
	
	%>
	
	<div class="txt">Installment fee for a month : <%= value %></div>
	
	
	<div class="divwithoutform">      
		  
		  
		  <a href="aboutus.jsp"><button>Home</button></a>
		  <a href="loancalc.jsp"><button>Retry</button></a>
	</div>
	
	
	
</body>
</html>