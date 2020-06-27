

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Verifys
 */
public class Verifys extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verifys() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
			Statement stmt=c.createStatement();
			String s="SELECT * FROM DS";
			int flag=3;
			ResultSet r=stmt.executeQuery(s);
			String u=request.getParameter("u");
			String p=request.getParameter("p");
			String np=request.getParameter("np");
			while(r.next()) {
				String u1=r.getString("uname");
				String p1=r.getString("pass");
				if(u.equals(u1) && p.equals(p1)) {
					String q="update DS set pass='"+np+"' where uname= '"+u+"' ";
					stmt.executeUpdate(q);
					flag=2;
					break;	
				}
			}
			if(flag==2) {
				request.setAttribute("errorm","Password changed");
				request.getRequestDispatcher("Login1.jsp").forward(request, response);
			}
			if(flag==3) {
				request.setAttribute("errorm","Invalid username or password");
				request.getRequestDispatcher("Change.jsp").forward(request, response);
			}
		}
		catch(Exception e){ 
			System.out.println(e);
			} 
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
