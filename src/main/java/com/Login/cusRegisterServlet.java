package com.Login;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cusRegisterServlet")
public class cusRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(getServletInfo());
		
		String fName = request.getParameter("fName");
		String sName = request.getParameter("sName");
		String mobileNumber = request.getParameter("MobileNum");
		String username = request.getParameter("Username");
		String password = request.getParameter("password");
		String bDate = request.getParameter("BDate");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.registerCustomer(fName, sName, mobileNumber, username, password, bDate);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('You are registered Succesfully');");
			out.println("location='LoginHome.jsp'");
			out.println("</script>");
			
//			RequestDispatcher go1 = request.getRequestDispatcher("LoginHome.jsp");
//			go1.forward(request, response);
		}else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Something went wrong! try again');");
			out.println("location='cusRegister.jsp'");
			out.println("</script>");
			
//			RequestDispatcher go2 = request.getRequestDispatcher("cusRegister.jsp");
//			go2.forward(request, response);
		}
		
	}

}
