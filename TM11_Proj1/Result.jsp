<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
h1{text-align:center;}
p{text-align:center;}
body {
  background-color: #FFFF00;
}
th{border: 1px solid black;
background-color: #000000;
color:white;}
table,td{border: 1px solid white;
text-align:center;
margin-left:auto;
margin-right:auto;;
}
</style>
<body>
<h1>Bid Submitted</h1>
<p>Your bid is now active.If your bid is successful,you will be notified within 24 hours of the close of bidding.</p> 
<jsp:useBean id="user" class="p.Bean" scope="session"></jsp:useBean>
<jsp:setProperty property="itemid" name="user" param="itemid"/>
<jsp:setProperty property="itemname" name="user" param="itemname"/>
<jsp:setProperty property="uname" name="user" param="uname"/>
<jsp:setProperty property="email" name="user" param="email"/>
<jsp:setProperty property="bidamount" name="user" param="bidamount"/>
<jsp:setProperty property="autoi" name="user" param="autoi"/>
<table>
<tr>
<th><jsp:getProperty property="itemname" name="user"/></th>
</tr>
<tr><td>Item ID:<jsp:getProperty property="itemid" name="user"/></td></tr>
<tr><td>Name:<jsp:getProperty property="uname" name="user"/></td></tr>
<tr><td>Email address:<jsp:getProperty property="email" name="user"/></td></tr>
<tr><td>Bid price: Rs<jsp:getProperty property="bidamount" name="user"/>.0</td></tr>
<tr><td>Auto-increment price:<jsp:getProperty property="autoi" name="user"/></td></tr>
</table>
</body>
</html>