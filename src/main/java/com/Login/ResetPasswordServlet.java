package com.Login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ResetPasswordServlet")
public class ResetPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType(getServletInfo());
		
		String id = request.getParameter("id");
		String pW = request.getParameter("pW");
		/*String sname = request.getParameter("sname");
		String fname = request.getParameter("fname");
		String uname = request.getParameter("username");
		String mobile = request.getParameter("mobile");
		String bdate = request.getParameter("bdate");*/
		
		boolean isTrue;
		isTrue = CustomerDBUtil.resetPassword(id, pW);
		
		if(isTrue == true) {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Pasword reset Successfull');");
			out.println("location='LoginHome.jsp'");
			out.println("</script>");
				
		}else {
			
			out.println("<script type='text/javascript'>");
			out.println("alert('Pasword reset Unsuccessfull! Please try Again');");
			out.println("location='LoginHome.jsp'");
			out.println("</script>");
			
//			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
//			dis.forward(request, response);
		}
	}

}
