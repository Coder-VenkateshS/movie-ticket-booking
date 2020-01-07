package com.face.action.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import com.face.action.bo.User;
import com.face.action.businesslogic.RegistrationValidation;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	RegistrationValidation reg=new RegistrationValidation();;
    public RegisterServlet() {
        super();
     }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("Welcome to Register Servlet");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
	String firstname=request.getParameter("firstname");
	String lastname=request.getParameter("lastname");
	String username=request.getParameter("username");
	String password=request.getParameter("password");
	String confirmpassword=request.getParameter("confirmpassword");
	String email=request.getParameter("email");
	String mobile=request.getParameter("mobile");
	if(reg.validate(firstname, lastname, username, password, confirmpassword, email, mobile))
	{
		
		User user=new User();
		user.setFirstname(firstname);
		user.setLastname(lastname);
		user.setUsername(username);
		user.setPassword(confirmpassword);
		user.setConfirmpassword(confirmpassword);
		user.setEmail(email);
		user.setMobile(mobile);
		 RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.html");
		 dispatcher.forward(request, response);
	}
	
	else
		out.println("check your fields");
	 	
	}



}
