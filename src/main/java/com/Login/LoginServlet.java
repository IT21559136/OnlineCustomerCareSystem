package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(getServletInfo());
		
		String username  = request.getParameter("uid");
		String password = request.getParameter("pw");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.validateLogin(username, password);
		
		if(isTrue == true) {
			
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(username);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("home.jsp");
			dis.forward(request, response);
			RequestDispatcher dis1 = request.getRequestDispatcher("Header.jsp");
			dis1.forward(request, response);
			
		}else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Dear Customer your Username or password is Incorrect');");
			out.println("location='LoginHome.jsp'");
			out.println("</script>");
		}
		
		
		
		
		
		
		
//		try {
//		List<Customer> cusDetails = CustomerDBUtil.validate(username, password);
//		request.setAttribute("cusDetails", cusDetails);
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		RequestDispatcher dis = request.getRequestDispatcher("useraccount.jsp");
//		dis.forward(request, response);
		
	}

}
