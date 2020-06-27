
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A3
 */
public class A3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A3() {
        super();
        
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
     Connection c=Dbcon.getConnection();
	
		try {
			String s1=request.getParameter("name");
			String s2=request.getParameter("id");
			String s3=request.getParameter("designation");
			Statement stmt=c.createStatement();
			String sql="insert into emp values('" +s1+ "', '" +s2+  
                    "', '" +s3+ "')";
			int a=stmt.executeUpdate(sql);
			if(a>0) {
				System.out.println("Data inserted successfully");
			}
			String sql1="select * from emp";
			ResultSet r=stmt.executeQuery(sql1);
			System.out.println("The emp table is");
			System.out.println("Name \t Id \t Designation");
			while(r.next()) {
				String name=r.getString(1);
				String id=r.getString(2);
				String designation=r.getString(3);
				System.out.println(name+"\t"+id+"\t"+designation);
			}
			r.close();
			c.close();
		}
		catch(Exception e) {
			e.printStackTrace();
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
