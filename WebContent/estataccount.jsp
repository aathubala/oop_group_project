<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>your e stat</title>
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
	    <table>
		<c:forEach var="es" items="${estatDetails}">
		
		<c:set var="id" value="${es.id}"/>
		<c:set var="ecno" value="${es.ecno}"/>
		<c:set var="name" value="${es.name}"/>
		<c:set var="cvn" value="${es.cvn}"/>
		<c:set var="email" value="${es.email}"/>
		<c:set var="phone" value="${es.phone}"/>
		
		<tr>
			<td>E-statement id</td>
			<td>${es.id}</td>
		</tr>
		<tr>
			<td>Card number</td>
			<td>${es.ecno}</td>
		</tr>
		<tr>
			<td>Card holder's name</td>
			<td>${es.name}</td>
		</tr>
		<tr>
			<td>CVN</td>
			<td>${es.cvn}</td>
		</tr>
		<tr>
			<td>Email</td>
			<td>${es.email}</td>
		</tr>
		<tr>
			<td>Phone</td>
			<td>${es.phone}</td>
		</tr>
			
	</c:forEach>
	</table>
	
	
	  </div>
	  <div class="signupForm">
	  <h2>Result</h2>
		<c:url value="updateestat.jsp" var="estatupdate">
			<c:param name="id" value="${id}"/>
			<c:param name="ecno" value="${ecno}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="cvn" value="${cvn}"/>
			<c:param name="email" value="${email}"/>
			<c:param name="phone" value="${phone}"/>
		</c:url>	

		<ul class="noBullet">
			<li id="center-btn">
				<a href="${estatupdate}">
					<button id="join-btn">UPDATE E-STAT</button>
				</a>
			</li>
		</ul>

		
		
		<c:url value="deleteestat.jsp" var="estatdelete">
			<c:param name="id" value="${id}"/>
			<c:param name="ecno" value="${ecno}"/>
			<c:param name="name" value="${name}"/>
			<c:param name="cvn" value="${cvn}"/>
			<c:param name="email" value="${email}"/>
			<c:param name="phone" value="${phone}"/>
		</c:url>
		
		<ul class="noBullet">
			<li id="center-btn">
				<a href="${estatdelete}">
					<button id="join-btn">DELETE E-STAT</button>
				</a>
			</li>
		</ul>
		</div>
	</div>


	
<script type="text/javascript" src="js/ebutton.js"></script>
</body>
</html>