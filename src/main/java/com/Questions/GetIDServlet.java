package com.Questions;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetIDServlet
 */
@WebServlet("/GetIDServlet")
public class GetIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("Gid");
		
		
		try {
			
			List<Question> getQue = DBHandle.Qgetform1(id);
			request.setAttribute("getQue", getQue);
			
			RequestDispatcher patch1 = request.getRequestDispatcher("EditQuestions.jsp");
			patch1.forward(request, response);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
