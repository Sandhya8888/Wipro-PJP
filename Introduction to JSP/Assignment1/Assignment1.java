

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment1
 */
public class Assignment1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Assignment1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String n=request.getParameter("number");
		int p=Integer.parseInt(n);
		ArrayList<Integer> l=new ArrayList<Integer>();
		int q=0;
		for(int i=1;i<=p;i++) {
			int c=0;
			for(q=i;q>=1;q--) {
				if(i%q==0) {
					c++;
				}
			}
			if(c==2) {
				l.add(i);
			}
			
		}
		request.setAttribute("data",p);
		request.setAttribute("data1", l);
		getServletContext().getRequestDispatcher("/Assignment1.jsp").forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
