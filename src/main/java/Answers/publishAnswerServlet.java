package Answers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/publishAnswerServlet")
public class publishAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	     
		String id = request.getParameter("id");
		String name= request.getParameter("uname");
		String category= request.getParameter("category");
		String question=  request.getParameter("question");
		String answer =request.getParameter("answer1");
		
		System.out.println(answer);
		System.out.println(name);
		System.out.println(category);
		System.out.println(id);
		System.out.println(question);
		System.out.println(answer);
		
		boolean isTrue;
		
		isTrue= AdmnDBHandle.publishAnswer(id, name, category, question, answer);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("adminHome.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis = request.getRequestDispatcher("adminHome.jsp");
			dis.forward(request, response);
		}
	}

}
