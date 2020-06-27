

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Hello
 */
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String u=request.getParameter("u");
		String p=request.getParameter("p");
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");  
			/*String s="CREATE TABLE IF NOT EXISTS DS("+"uname varchar(100),"+"pass varchar(100)"+")";
			
			stmt.executeUpdate(s);*/
			Statement stmt=c.createStatement();
			String s2="insert into DS values('" +u+ "', '" +p+"')";
			stmt.executeUpdate(s2);
			request.setAttribute("u",u);
			request.setAttribute("p",p);
			request.getRequestDispatcher("Login.jsp").forward(request, response);
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
