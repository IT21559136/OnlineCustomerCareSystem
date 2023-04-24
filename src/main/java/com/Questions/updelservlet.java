package com.Questions;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/updelservlet")
public class updelservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		System.out.println(action);
		if(action.equalsIgnoreCase("button1")) {
			doPost_Button1(request,response);
		}else if(action.equalsIgnoreCase("button2")) {
			doPost_Button2(request,response);
		}
	}
	
	protected void doPost_Button1(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
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
	
	protected void doPost_Button2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		String id = request.getParameter("Gid");
		//numberformat exception
		boolean isTrue=DBHandle.deleteQuestion(id);
		
		if(isTrue == true) {				
			RequestDispatcher patch = request.getRequestDispatcher("MyQuestions.jsp");
			patch.forward(request, response);
			
		}else {
			RequestDispatcher patch = request.getRequestDispatcher("unsuccess.jsp");
			patch.forward(request, response);
		}
	}

}
