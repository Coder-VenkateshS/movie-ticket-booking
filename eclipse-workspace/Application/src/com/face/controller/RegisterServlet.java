package com.face.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.utility.ConnectionManager;

/**
 * @author Venkatesh
 * @param <E>
 * @implNote perform user registration
 * Date - 14-11-2019
 * @category controller class
 */

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	 

    public RegisterServlet() {
        super();
        }
  
	/**
	 * @implSpec -> action method to register customer with database
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Welcome to servlet");
		response.setContentType("text/html");
		boolean status = false;
		String name=request.getParameter("name");
		String password = request.getParameter("password");
		String address=request.getParameter("address");
		String mobile=request.getParameter("mobile");
		
		RegisterBO regbo=new RegisterBO();
		regbo.setName(name);
		regbo.setPassword(password);
		regbo.setAddress(address);
		regbo.setMobile(mobile);
		ConnectionManager con=new ConnectionManager();
		try {
			 status=RegisterDAO.save(con.getConnection(),regbo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(status==true) {
			
		try {
			// this is used to map the data from database to our jsp file
			request.setAttribute("user", RegisterDAO.get(regbo.getName()));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		 RequestDispatcher rd = request.getRequestDispatcher("/success.jsp");
		 if (rd != null){
			  rd.forward(request, response);
			  } 

	}
		}
	}

