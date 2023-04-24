package com.Questions;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/QInsert")
public class QInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("uname");
		String catergory = request.getParameter("category");
		String qustion = request.getParameter("question");
		String answers = "";
		
		//Validate User Inputs
		if(qustion == "" ) {
	       response.setContentType("text/html");
	       PrintWriter pw=response.getWriter();
	       pw.println("<script type=\"text/javascript\">");
	       pw.println("alert('Enter Question please');");
	       pw.println("</script>");
	       RequestDispatcher rd=request.getRequestDispatcher("NewQuestion.jsp");
	       rd.include(request, response);
		}else {
			boolean isTrue=DBHandle.insertQuestions(name, catergory, qustion, answers);
			
			if(isTrue == true) {				
				RequestDispatcher patch = request.getRequestDispatcher("aquestions.jsp");
				patch.forward(request, response);
				
			}else {
				RequestDispatcher patch = request.getRequestDispatcher("unsuccess.jsp");
				patch.forward(request, response);
			}
		}
		
	}

}
