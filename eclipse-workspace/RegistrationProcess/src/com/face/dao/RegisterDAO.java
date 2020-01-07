package com.face.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import com.face.bo.RegisterBO;

public class RegisterDAO {
	 public static final RegisterDAO regdao = new RegisterDAO();
	 public static void Save(Connection connection, RegisterBO rg)
	 {
	 String opt=rg.getoption();
	 if(opt.equals("1"))
	 {
	 try
	 {
	 Statement stmt=connection.createStatement();
	 String query = "INSERT INTO register VALUES ('"+rg.getfName()+"','" + rg.getmid()+"','" + rg.getcn() +
	"','" + rg.getadd()+ "','" + rg.getmob() + "','" + rg.getre() + "')";
	 int result=stmt.executeUpdate(query);
	 if(result==1) {
	 System.out.println("Data inserted successfully");
	 }
	 } catch(SQLException e) {
	 e.printStackTrace();
	 }
	}
	 }
	 }
