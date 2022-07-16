<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All contacts</title>
</head>
<body>
	<h2>Search All Contacts...</h2>
	
	<div>
	${billError}
	</div>
	
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Lead Source</th>
			<th>Email</th>
			<th>Mobile</th>
			<th>Billing</th>
			<th>View Bill</th>
		</tr>
		<c:forEach items="${contacts}" var="contact">
		<tr>
			<td>${contact.id}</td>
			<td><a href="contactInfo?id=${contact.id}">${contact.firstName}</a></td>
			<td>${contact.lastName}</td>
			<td>${contact.leadSource}</td>
			<td>${contact.email}</td>
			<td>${contact.mobile}</td>
			<td><a href="createBill?bid=${contact.id}">billing</a></td>
			<td><a href="viewBill?bid=${contact.id}">view bill</a></td>
		</tr>
		</c:forEach>
	</table>
	${msg}
</body>
</html>