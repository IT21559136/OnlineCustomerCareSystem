package com.Login;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//if prompt doesn't works, use as the resetpwservlet :-)
		
		String adminUN  = request.getParameter("adminUN");
		String adminPW = request.getParameter("adminPW");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.adminValidate(adminUN, adminPW);
		
		if(isTrue == true) {
			
			List<Admin> adminDetails = CustomerDBUtil.getAdminDetails(adminUN);
			request.setAttribute("adminDetails", adminDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("adminHome.jsp");
			dis.forward(request, response);
			
		}else {
//			System.out.println("admin Incorrect password");
//			out.println("<script type='text/javascript'>");
//			out.println("alert('Your Username or password is Incorrect\n Cantact Database Admin to reset');");
//			out.println("location='adminLogin.jsp'");
//			out.println("</script>");
			
			 response.setContentType("text/html");
	           PrintWriter pw=response.getWriter();
	           pw.println("<script type=\"text/javascript\">");
	           pw.println("alert('Incorrect password or username');");
	           pw.println("</script>");
	           RequestDispatcher rd=request.getRequestDispatcher("adminLogin.jsp");
	           rd.include(request, response);
		}
		
		
	}

}
