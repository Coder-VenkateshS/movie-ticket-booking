package com.face.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionManager {
	 String userName="root"; // text var
	 String password="root"; // text var
	 String url="jdbc:mysql://localhost/app" ; // text var
	 Connection cn;
	 public ConnectionManager() {}
	 public Connection getConnection() {
	 try {
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 } catch(ClassNotFoundException e) {
	 e.printStackTrace();
	 }
	 try {
	 cn=DriverManager.getConnection(url, userName, password);
	 } catch(SQLException e) {
	 e.printStackTrace();
	 }
	 return cn;
	 }
	}