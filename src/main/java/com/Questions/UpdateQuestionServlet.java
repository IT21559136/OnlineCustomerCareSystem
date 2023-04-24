package com.Questions;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateQuestionServlet")
public class UpdateQuestionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Nid = request.getParameter("uid1");
		String nuname = request.getParameter("uname1");
		String ncategory = request.getParameter("category1");
		String nquestion = request.getParameter("question1");
		
		boolean istrue = DBHandle.UpdateQuestions(Nid, nuname, ncategory, nquestion);
		
		if(istrue == true) {
			RequestDispatcher patch2 = request.getRequestDispatcher("MyQuestions.jsp");
			patch2.forward(request, response);
		}else {
			RequestDispatcher patch2 = request.getRequestDispatcher("unsuccess.jsp");
			patch2.forward(request, response);
		}
		
	}

}
