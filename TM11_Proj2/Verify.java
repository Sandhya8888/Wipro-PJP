

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
 * Servlet implementation class Verify
 */
public class Verify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Verify() {
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
			int flag=0;
			ResultSet r=stmt.executeQuery(s);
			String u=request.getParameter("u");
			String p=request.getParameter("p");
			while(r.next()) {
				String u1=r.getString("uname");
				String p1=r.getString("pass");
				if(u.equals(u1) && p.equals(p1)) {
					flag=1;
					break;
				}
			
			}
			
			if(flag==1) {
				request.getRequestDispatcher("Result.html").forward(request, response);
			}
			if(flag==0) {
				request.setAttribute("errorm","Invalid username or password");
				request.getRequestDispatcher("Login1.jsp").forward(request, response);
			}
		}
		catch(Exception e){ 
			System.out.println(e);
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
