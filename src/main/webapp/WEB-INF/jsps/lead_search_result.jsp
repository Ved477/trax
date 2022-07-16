<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Leads</title>
</head>
<body>
	
	<a href="viewCreateLead">Create New Lead</a>
	
	<h2>Search All Leads...</h2>
	
	<div>${msg}</div>
	
	<table border='1'>
		<tr>
			<th>Id</th>
			<th>First Name</th>
			<th>Last Name</th>
			<th>Lead Source</th>
			<th>Email</th>
			<th>Mobile</th>
			<th></th>
		</tr>
		<c:forEach items="${leads}" var="lead">
		<tr>
			<td>${lead.id}</td>
			<td><a href="leadInfo?id=${lead.id}">${lead.firstName}</a></td>
			<td>${lead.lastName}</td>
			<td>${lead.leadSource}</td>
			<td>${lead.email}</td>
			<td>${lead.mobile}</td>
			<td>
				<form action="convertLead" method="post">
					<input type="hidden" name="id" value="${lead.id}"/>
			 		<input type="submit" value="convert"/>
				</form>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>