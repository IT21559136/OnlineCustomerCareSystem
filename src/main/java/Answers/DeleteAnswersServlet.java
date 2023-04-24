package Answers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class DeleteAnswersServlet
 */
@WebServlet("/DeleteAnswersServlet")
public class DeleteAnswersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("Gid");
		boolean isTrue=AdmnDBHandle.deleteAnswers(id);
		
		if(isTrue == true) {				
			RequestDispatcher patch = request.getRequestDispatcher("notAnsweredQuestions.jsp");
			patch.forward(request, response);
			
		}else {
			RequestDispatcher patch = request.getRequestDispatcher("unsuccess.jsp");
			patch.forward(request, response);
		}
	}

}
