<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>after admin is logged in
	 <form:form method="POST" action="addMenuItems" modelAttribute="menuItems">
	Item name <input type="text" name="itemName"></br>
	Item price <input type="text" name ="itemPrice"></br>
	<input type="submit" value="add">
	</form:form>
	
	<form:form  action="deleteMenuItems/{itemName}" modelAttribute="menuItems" method="GET">
	Item name <input type="text" name="itemName"></br>
	<!-- Item price <input type="text" name ="itemPrice"></br> -->
	<input type="submit" value="delete">
	</form:form>
	<table>
			<tr>
				<th>Item Name</th>
				<th>Item Price</th>
			</tr>
			 <c:forEach items="${listMenuItems}" var="menuItem">
			<tr>
				<td><c:out value="${menuItem.itemName }"/></td>
				<td><c:out value="${menuItem.itemPrice }"/></td>
			</tr>
			</c:forEach>
		</table>
</body>
</html>