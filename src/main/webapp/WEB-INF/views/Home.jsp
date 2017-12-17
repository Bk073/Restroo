<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css" rel ="stylesheet" >
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<title>index</title>
</head>
<body>
	 <div class="container">
	 	<nav class="navbar navbar-inverse">
	 		<div class="container-fluid">
	 			<div class="navbar-header">
	 				<a href="#">restroo</a>
	 			</div>
	 			<ul class="nav navbar-nav">
	 				<li><a href="<c:url value="/Home"/>">Home</a>
	 				<li><a href="<c:url value="/onlineOrder"/>">Online Order </a>
	 				<li><a href="<c:url value="/contact"/>">Contact</a>
	 				<li><a href="#">Portfa</a>
	 			</ul>
	 		</div>
	 	</nav>
	 	
   </div> 
</body>
</html>