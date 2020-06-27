<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="myform" method="post" action="Verifys" onsubmit="return validate()">
<p>
Username:
<input type="text" name="u" id="u" required/>
</p>
<p>
Old password:
<input type="password" name="p" id="p" required/>
</p>
<p>
New Password:
<input type="password" name="np" id="np" required/>
</p>
<p>
Re-type New Password:
<input type="password" name="rp" id="rp" required/></p>
<span id="error1"></span>
<div style="color: #FF0000;">${errorm}</div>
<p>
<input type="submit" name="submit" value="Change"/>
</p>
</form>
</body>
<script type="text/javascript">
function validate(){
	var np = document.forms["myform"]["np"].value;
	var rp =  document.forms["myform"]["rp"].value;
	if(np!=rp){
		document.getElementById("error1").innerHTML ="Password and Confirm password does not match!".fontcolor("red");
		return false;
	}
	else{
		return true;
	}
}
</script>
</html>