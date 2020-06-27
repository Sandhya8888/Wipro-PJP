<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="c" class="p1.Assign" scope="session"></jsp:useBean>
<jsp:setProperty property="x"  name="c" param="x"/>
This is page 2
<br>
The entered number is:
<br>
<jsp:getProperty property="x" name="c"/>
</body>
</html>