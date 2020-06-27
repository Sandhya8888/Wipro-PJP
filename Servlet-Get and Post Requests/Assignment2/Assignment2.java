

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assignment2
 */
public class Assignment2 extends HttpServlet implements Servlet{
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
		Enumeration<String> pn=request.getParameterNames();
		response.setContentType("text/html");
		PrintWriter o=response.getWriter();
		o.print("<html><body>");
		o.println("<table border=\"1\" cellpadding=\"5\" + cellspacing =\"5\">");
		o.println("<tr><th>Parameter name</th>"+
		          "<th>Parameter Value</th></tr>");
		while(pn.hasMoreElements()) {
			String pname=(String)pn.nextElement();
			o.print("<tr><td>"+pname+"</td>\n<td>");
			String[] pvalues=request.getParameterValues(pname);
			if(pvalues.length==1) {
				String pvalue=pvalues[0];
				if(pvalue.length()==0) {
					o.print("No Value");
				}
				else{
					o.println(pvalue);
				}
			}
			else {
				o.println("<ul>");
				for(int i=0;i<pvalues.length;i++) {
					o.println("<li>"+pvalues[i]+"</li>");
				}
				o.println("</ul>");
			}
		}
		o.println("</table></body></html>");
		
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}
	

}
