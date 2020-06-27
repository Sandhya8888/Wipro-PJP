<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="p1.Assignment3" scope="session"></jsp:useBean>

<jsp:setProperty property="name"  name="user" param="name"/>
<jsp:setProperty property="id" name="user" param="id"/>
<jsp:setProperty property="designation" name="user" param="designation"/>
<% 
String a=user.getName(); 
String b =user.getId();
String c=user.getDesignation();
%>
<jsp:forward page="A3">
<jsp:param value="<%=a %>" name="name"/>
<jsp:param value="<%=b %>" name="id"/>
<jsp:param value="<%=c %>" name="designation"/>
</jsp:forward>

</body>
</html>