

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
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
		response.setContentType("text/html");
		PrintWriter p=response.getWriter();
		ServletConfig s=getServletConfig();
		Enumeration<String> e=s.getInitParameterNames();
		String s1;
		while(e.hasMoreElements()) {
			s1=e.nextElement();
			p.println("Param name"+s1);
			p.println("Value:"+s.getInitParameter(s1));
		}
		p.println("\n");
		ServletContext c=getServletContext();
		Enumeration<String> e1=c.getInitParameterNames();
		String p2;
		while(e1.hasMoreElements()) {
			p2=e1.nextElement();
			p.println("\n");
			p.println("Param name:"+p2);
			p.println("Value:"+c.getInitParameter(p2));
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
