<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="webjars/bootstrap/3.2.0/css/bootstrap.min.css" rel ="stylesheet" >
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<title>index</title>
</head>
<body>
	 <form:form method="POST" action="adminLogin" modelAttribute="adminUser">
         First Name: <input type = "text" name = "userName">
         <br />
         password <input type = "password" name = "password" />
         <input type = "submit" value = "Submit" />
      </form:form>
</body>
</html>