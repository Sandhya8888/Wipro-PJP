<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="emp" class="p1.Employee" scope="request"></jsp:useBean>
<jsp:setProperty property="name"  name="emp" param="ename"/>
<jsp:setProperty property="id" name="emp" param="eid"/>
<jsp:setProperty property="salary" name="emp" param="esalary"/>
The name of the employee is:
<br>
<jsp:getProperty property="name" name="emp"/>
<br>
The id of the employee is:
<br>
<jsp:getProperty property="id" name="emp"/>
<br>
The salary of the employee is:
<br>
<jsp:getProperty property="salary" name="emp"/>
<br>
</body>
</html>