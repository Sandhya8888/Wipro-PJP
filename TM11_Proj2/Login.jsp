<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<body>
<jsp:useBean id="user" class="p1.Bean" scope="session"></jsp:useBean>
<jsp:setProperty property="u"  name="user" param="u"/>
<jsp:setProperty property="p" name="user" param="p"/>
<% 
String a=user.getU();
String b =user.getP();
%>
<jsp:forward page="Verify">
<jsp:param value="<%=a %>" name="u"/>
<jsp:param value="<%=b %>" name="p"/>
</jsp:forward>
</body>

</body>
</html>
