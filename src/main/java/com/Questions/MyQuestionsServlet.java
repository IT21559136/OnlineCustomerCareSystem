package com.Questions;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyQuestionsServlet")
public class MyQuestionsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String myName = request.getParameter("myquestions");
		
		try {
		
		
		List<Question> myquestions = DBHandle.ViewMyQuestions(myName);
		request.setAttribute("myquestions", myquestions);
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		RequestDispatcher patch = request.getRequestDispatcher("MyQuestions1.jsp");
		patch.forward(request, response);
	}

}
