

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment2
 */
public class Assignment2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assignment2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 PrintWriter writer = response.getWriter();
		 Cookie sname=new Cookie("hello","google");
		 Cookie s1name=new Cookie("hello1","google1");
		 response.addCookie(sname);
		 response.addCookie(s1name);
         
	        Cookie[] cookies = request.getCookies();
	        writer.print("<html><body>");
	        writer.println("<table border=\"1\" cellpadding=\"5\" + cellspacing =\"5\">");
	        writer.println("<tr><th>Cookie name</th>"+
			          "<th>Cookie Value</th></tr>");
	         
	        if (cookies == null) {
	            writer.println("No cookies found");
	        } else {
	            writer.println("Number of cookies: " + cookies.length);
	             
	            for (Cookie aCookie : cookies) {
	                String name = aCookie.getName();
	                writer.print("<tr><td>"+name+"\n<td>");
	                String value = aCookie.getValue();
	                 
	                writer.println(value);
	            }
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
