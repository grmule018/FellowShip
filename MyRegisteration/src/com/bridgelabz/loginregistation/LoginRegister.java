package com.bridgelabz.loginregistation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	public LoginRegister() {  }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CustomerDAO cd=new CustomerDAOImpl();
		String userName=request.getParameter("username");
		
		String password=request.getParameter("password1");
		
		String submitType=request.getParameter("submit");
		
		Customer c =cd.getCustomer(userName, password);
		
		if(submitType.equals("login") && c!=null && c.getFirstname()!=null){
			request.setAttribute("messgae",c.getFirstname());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
	
		}else if(submitType.equals("register")) {
			c.setUsername(userName);
			c.setFirstname(request.getParameter("firstname"));
			c.setLastname(request.getParameter("lastname"));
			c.getPhonenumber();
			c.setPassword(password);
			
			cd.InsertCustomer(c);
			request.setAttribute("successMessage","Registration don , please to  login continue !!");
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Data not Found, click on Register !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
}
