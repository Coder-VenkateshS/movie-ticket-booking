<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Registration Page</title>
     <link rel="Stylesheet" href="style.css">
  </head>
  <body>
     <jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
     Welcome to Sign Up
<div>
<form action="/Prograd_Day_1_Lab_1_Registration/RegistrationServlet" method="post">
<label> First name:</label><br><input type="text" name="Firstname" required><br>
<label> Last name:</label><br><input type="text" name="lastname" required><br>
<label> User name:</label><br><input type="text" name="username" required><br>
<label> Password:</label><br><input type="password" name="password" required><br>
<label> Confirm Password:</label><br><input type="password" name="confirmpassword" required><br>
<label> Email:</label><br><input type="email" name="email" required><br>
<label> Mobile:</label><br><input type="number" name="mobile" required><br>
<input type="submit" name="signup" value="Signup">
</form>
</div>
<p>
<ol>
<li>All fields are required</li>
<li>User name should not be empty. It can be alphanumeric</li>
<li>Password should not be empty. Password should have a minimum of 8 character and it should not be more than 20 characters.Password must be alphanumeric with 1 Uppercase, 1 lowercase and special characters.
</ol>
<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>