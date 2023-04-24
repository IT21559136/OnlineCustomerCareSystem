package com.UpdateAccount;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/UpdateCustomerServlet")
public class UpdateCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equalsIgnoreCase("button1")) {
			doPost_Button1(request,response);
		}else if(action.equalsIgnoreCase("button2")) {
			doPost_Button2(request,response);
		}
	}
	protected void doPost_Button1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType(getServletInfo());

		 String id=request.getParameter("cusid");
		 String fname=request.getParameter("fname");
		 String sname=request.getParameter("sname");
		 String phone=request.getParameter("phone");
		 String username=request.getParameter("uname");
		 String password=request.getParameter("pass");
		 String birthdate=request.getParameter("bdate");
		

		 
		 boolean isTrue;
		 isTrue= updateCustomerDBUtil.updatecustomer(id, fname, sname, phone, username, password, birthdate);
		 
		 if(isTrue==true) {
			 out.println("<script type='text/javascript'>");
				out.println("alert('You are Updated Succesfully');");
				out.println("location='LoginHome.jsp'");
				out.println("</script>");
			 
		 }
		 else {
			 
			 RequestDispatcher dis= request.getRequestDispatcher("unsuccess.jsp");
			 dis.forward(request, response);
		 }
	}
	protected void doPost_Button2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		PrintWriter out = response.getWriter();
		response.setContentType(getServletInfo());
		
		String id=request.getParameter("cusid");
		boolean isTrue=updateCustomerDBUtil.deleteAccount(id);
		if(isTrue == true) {
			out.println("<script type='text/javascript'>");
			out.println("alert('Acount Deleted Succesfully');");
			out.println("location='LoginHome.jsp'");
			out.println("</script>");
			
			
		}else {
			RequestDispatcher patch = request.getRequestDispatcher("unsuccess.jsp");
			patch.forward(request, response);
		}
	}

}
