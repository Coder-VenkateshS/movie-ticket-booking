package com.org.face.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.org.face.beans.UserAccount;
import com.org.face.utility.ConnectionManager;

public class UserDAO {
// Performs data insertion in database
	public boolean registerUser(UserAccount user, ConnectionManager conn) throws SQLException, Exception {
	
		String sql="insert into UserAccount(firstname,lastname,username,password,email,mobile)values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.getConnection().prepareStatement(sql);
		ps.setString(1, user.getFirstname());
		ps.setString(2, user.getLastname());
		ps.setString(3, user.getUsername());
		ps.setString(4, user.getPassword());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getMobile());
		int resultset=ps.executeUpdate();
		
		if(resultset!=0) {
			conn.getConnection().close();
			return true;
		}
		else {
			return false;
		}
	}

}
