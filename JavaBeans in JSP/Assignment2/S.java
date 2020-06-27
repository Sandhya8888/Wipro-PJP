

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class S
 */
public class S extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String n=request.getParameter("x");
		int p=Integer.parseInt(n);
		if(p<=10) {
			request.setAttribute("x",n);
			getServletContext().getRequestDispatcher("/Page1.jsp").forward(request,response);
		}
		else if(p>10 && p<99) {
			request.setAttribute("x",n);
			getServletContext().getRequestDispatcher("/Page2.jsp").forward(request,response);
		}
		else{
			request.setAttribute("x",n);
			getServletContext().getRequestDispatcher("/Page3.jsp").forward(request,response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
