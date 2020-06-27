<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Verify" method="post" name="myform" id="myform">
<p>
Username:<input type="text" name="u" id="u"/>
</p>
<p>
Password:<input type="password" name="p" id="p">
</p>
<div style="color: #FF0000;">${errorm}</div>
<p>
<input type="submit" name="submit" value="submit"/>
</p>
</form>
</body>
</html>