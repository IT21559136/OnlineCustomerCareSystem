package com.UpdateAccount;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Login.Account;


@WebServlet("/GetCustomerdetailsServlet")
public class GetCustomerdetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("cusid");
		System.out.println(id);
		try {
		List<com.Login.Customer> getcusdes = updateCustomerDBUtil.getCustomerDetails(id);
		request.setAttribute("getcusdes", getcusdes);
		RequestDispatcher patch1 = request.getRequestDispatcher("useraccount.jsp");
		patch1.forward(request, response);
		}catch(Exception E){
			
		}

	}
}
