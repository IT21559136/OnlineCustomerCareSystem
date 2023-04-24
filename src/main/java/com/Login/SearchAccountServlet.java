package com.Login;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchAccountServlet")
public class SearchAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mobile = request.getParameter("phone");
		
		try {
			List<Account> accDetails = CustomerDBUtil.validate1(mobile);
			request.setAttribute("accDetails", accDetails);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("confirmAccount.jsp");
		dis.forward(request, response);
	}

}
