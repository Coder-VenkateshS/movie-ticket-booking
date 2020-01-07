<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Students Detail</title>
</head>
<body>
<form action="/RegistrationProcess/RegisterServlet" method="post">
<h1 align=center>Students Detail</h1>
<table width=25% align=center>
<tr><td align=right>First Name:</td><td align=left><input type=text name=fn></td></tr>
<tr><td align=right>Mail id:</td><td align=left><input type=text name=mid></td></tr>
<tr><td align=right>College Name:</td><td align=left><input type=text name=cname></td></tr>
<tr><td align=right>Address:</td><td align=left><input type=text name=add></td></tr>
<tr><td align=right>Mobile number:</td><td align=left><input type=text name=mo></td></tr>
<tr><td align=right>Reference:</td><td align=left><select name=re><option value="0">select your
option</option><option value=1>Website</option><option value=2>Newspaper</option>
<option value=3>Word of Mouth</option></select></td></tr>
<tr><td align=right>Options:</td><td align=left><select name=op><option value="0">select your
option</option><option value=1>Save</option><option value=2>Delete</option>
<option value=3>View</option><option value=4>Update</option></select></td></tr>
<tr><td colspan=2 align=center><input type=submit value="Submit" name=b1></td></tr>
</table></form></body></html>