<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<th>Factorial</th>
</tr>
<tr>
<%
String ns= request.getParameter("n");
int n=Integer.parseInt(ns);
%>
<% 
while(n>=1){
	out.println("<tr><td>"+ n +"</td>");
	int fact=1,i=1;
	for(i=1;i<=n;i++){    
	    fact=fact*i;    
	} 
	out.println("<td>"+ fact +"</td></tr>");
	n--;
}

%>

</tr>

</table>
</body>
</html>