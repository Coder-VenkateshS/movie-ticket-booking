package com.org.face.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.org.face.beans.UserAccount;
import com.org.face.dao.UserDAO;
import com.org.face.utility.ConnectionManager;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       ConnectionManager conn=new ConnectionManager();
       UserDAO userdao=new UserDAO();
    public RegistrationServlet() {
        super();
         }

// When clicking registration link it navigates to Registration Page
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/registerView.jsp");
	rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstname=request.getParameter("firstname");
		String lastname=request.getParameter("lastname");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirmpassword=request.getParameter("confirmpassword");
		String email=request.getParameter("email");
		String mobile=request.getParameter("mobile");
		// Encapsulate your data
		UserAccount user=new UserAccount();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setUsername(username);
		user.setPassword(confirmpassword);
		user.setConfirmpassword(confirmpassword);
		user.setEmail(email);
		user.setMobile(mobile);
		//userdao.registerUser saves user data in database
		try {
			if(userdao.registerUser(user,conn)) {
				 response.sendRedirect(request.getContextPath() + "/LoginServlet");
}
		} catch (SQLException e) {
			
			e.printStackTrace();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
}
