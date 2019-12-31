<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Home Page</title>
     <link rel="Stylesheet" href="style.css">
  </head>
  <body>
     <jsp:include page="_header.jsp"></jsp:include>
     <jsp:include page="_menu.jsp"></jsp:include>
       <h3>Home Page</h3>
     This is demo Simple web application using jsp,servlet &amp; Jdbc. <br><br>
      <strong>It includes the following functions:</strong>
      <ul>
         <li>Registration</li>
         <li>Login</li>
         <li>User Details</li>
        </ul>
        <div class="footer">
      <jsp:include page="_footer.jsp"></jsp:include>
      </div>
   </body>
</html>