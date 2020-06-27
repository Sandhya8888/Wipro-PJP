

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class A1
 */
public class A1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public A1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		 String title = "Welcome Back";
	      Integer visitCount = new Integer(0);
	      String visitCountKey = new String("visitCount");
	      if (session.isNew()) {
	          title = "Welcome, you are visiting for the first time";
	       } else {
	          visitCount = (Integer)session.getAttribute(visitCountKey);
	          visitCount = visitCount + 1;
	       }
	       session.setAttribute(visitCountKey,  visitCount);
	       response.setContentType("text/html");
	       PrintWriter out = response.getWriter();
	       out.println(title);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	

}
