package Answers;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ansIDServlet")
public class ansIDServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("Gid");
		
		
		try {
			
			List<Answers> getAns = AdmnDBHandle.replyQuestion(id);
			request.setAttribute("getAns", getAns);
			
			RequestDispatcher patch1 = request.getRequestDispatcher("replyPannel.jsp");
			patch1.forward(request, response);
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	}


