<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<%@ page import="com.face.bo.RegisterBO" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All User</title>
</head>
<body>

<% 
        if (request.getAttribute("user") != null) {
            RegisterBO reg = (RegisterBO) request.getAttribute("user");
    %>
  
    <h1>Record</h1>
    <div>Name: <%= reg.getName()%></div>
     <div>Password: <%= reg.getPassword()%></div>
    <div>Address: <%= reg.getAddress()%></div>
    <div>Mobile: <%= reg.getMobile()%></div>
         
    <% 
        } else { 
    %>
 <h1>No student record found.</h1>
          
    <% } %> 

</body>
</html>