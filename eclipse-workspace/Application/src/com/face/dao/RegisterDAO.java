package com.face.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.face.bo.RegisterBO;
import com.face.utility.ConnectionManager;

public class RegisterDAO {
static RegisterBO regbo=new RegisterBO();
static ConnectionManager cm=new ConnectionManager();
	public static boolean save(Connection connection, RegisterBO regbo) throws SQLException {
	
		
		String query="insert into users(name,password,address,mobile)values(?,?,?,?)";
		
		PreparedStatement st=connection.prepareStatement(query);
		st.setString(1, regbo.getName());
		st.setString(2, regbo.getPassword());
		st.setString(3,regbo.getAddress());
		st.setString(4, regbo.getMobile());
		int resultset=st.executeUpdate();
		if(resultset==1)
		{
	
			return true;
			
		}else
		{
			System.out.println("Please check");
			return false;
		}
	}
// This is a method to get user detail from database 
// and pass to register servlet
	public static RegisterBO get(String name) throws Exception {
		RegisterBO reg = null;
		try {
			reg= new RegisterBO();
			String sql = "SELECT * FROM users where name=?";
			PreparedStatement st = cm.getConnection().prepareStatement(sql);
			st.setString(1, name);
			ResultSet resultSet = st.executeQuery();
			if(resultSet.next()) {
				reg.setName(resultSet.getString("name"));
				reg.setPassword(resultSet.getString("password"));
				reg.setAddress(resultSet.getString("address"));
				reg.setMobile(resultSet.getString("mobile"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return reg;
	}

	

}
