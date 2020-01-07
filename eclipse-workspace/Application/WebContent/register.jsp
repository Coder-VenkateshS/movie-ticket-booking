<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="/Application/RegisterServlet" method="post">
<h6>Name <input type="text" name="name"/></h6>
<h6>Password <input type="password" name="password"/></h6>
<h6>Address <input type="text" name="address"/></h6>
<h6>Mobile <input type="text" name="mobile"/></h6>
<h6><input type="submit" value="sign up"/></h6>
</form>
</body>
</html>