package com.face.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.swing.JOptionPane;
import com.face.bo.RegisterBO;
import com.face.dao.RegisterDAO;
import com.face.util.ConnectionManager;
public class RegisterServlet extends HttpServlet{
RegisterBO regbo;
RegisterDAO rgdao;
ConnectionManager conn;
 @Override
public void doPost(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
{
System.out.println("Welcome to servlet");
regbo=new RegisterBO();
rgdao=new RegisterDAO();
conn=new ConnectionManager();
response.setContentType("text/html");

regbo.setfName(request.getParameter("fn"));
regbo.setmid(request.getParameter("mid"));
regbo.setcn(request.getParameter("cname"));
regbo.setadd(request.getParameter("add"));
regbo.setmob(request.getParameter("mo"));
regbo.setre(request.getParameter("re"));
String f= request.getParameter("op");
regbo.setoption(f);
if(f.equals("0")) {
 System.out.println("Select a proper option");
 }
else {
 RegisterDAO.Save(conn.getConnection(), regbo);
 }
if(!f.equals("3")) {
 response.sendRedirect("/RegistrationProcess/register.jsp");
 }/*
else
{
 
 List agentList = new ArrayList();
 agentList.add(rg.getfName());
 agentList.add(rg.getmid());
 agentList.add(rg.getcn());
 agentList.add(rg.getadd());
 agentList.add(rg.getmob());
 agentList.add(rg.getre());
 request.setAttribute("data", agentList);
 RequestDispatcher dispatcher = request.getRequestDispatcher("Index.jsp");
 if (dispatcher != null) {
 dispatcher.forward(request, response);
 }
}*/
}
}
