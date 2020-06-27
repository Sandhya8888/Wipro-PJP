<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@page import="java.util.Iterator"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<th>Number</th>
<th>Prime numbers</th>
</tr>
<tr>
<td>
<% out.println(request.getAttribute("data")); %>
</td>
<td>
<%
out.println(request.getAttribute("data1"));
%>

</td>
</tr>
</table>
</body>
</html>