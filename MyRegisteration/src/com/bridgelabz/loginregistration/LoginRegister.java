package com.bridgelabz.loginregistration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	public LoginRegister() {}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDAO Ud=new UserDAOImpl();
		
		String userName=request.getParameter("username");
		
		String password=request.getParameter("password1");
		
		String submitType=request.getParameter("submit");
		
		
		User U =Ud.getUser(userName, password);
		
		if(submitType.equals("login") && U!=null && U.getFirstname()!=null){
			
			request.setAttribute("messgae",U.getFirstname());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
	
		}else if(submitType.equals("register")) {
			
			U.setUsername(userName);
			U.setFirstname(request.getParameter("firstname"));
			U.setLastname(request.getParameter("lastname"));
			U.setPhonenumber(request.getParameter("phonenumber"));
			U.setPassword(password);
			
			Ud.InsertUser(U);
			
			request.setAttribute("successMessage","Registration done , please to  login continue !!");
			
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else {
			request.setAttribute("message","Data not Found, click on Register !!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
}
