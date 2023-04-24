package Answers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ansIDServlet1
 */
@WebServlet("/ansIDServlet1")
public class ansIDServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("Gid");
		
		
		try {
			
			List<Answers> getAns = AdmnDBHandle.replyQuestion(id);
			request.setAttribute("getAns", getAns);
			
			RequestDispatcher patch1 = request.getRequestDispatcher("updateAnswerPanel.jsp");
			patch1.forward(request, response);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
