

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Project1
 */
public class Project1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Project1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String itemid=request.getParameter("itemid");
		String itemname=request.getParameter("itemname");
		String uname=request.getParameter("uname");
		String email=request.getParameter("email");
		String bidamount=request.getParameter("bidamount");
		String autoi=request.getParameter("autoi");
		request.setAttribute("itemid", itemid);
		request.setAttribute("itemname", itemname);
		request.setAttribute("uname", uname);
		request.setAttribute("email", email);
		request.setAttribute("bidamount", bidamount);
		request.setAttribute("autoi", autoi);
		request.getRequestDispatcher("Result.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
