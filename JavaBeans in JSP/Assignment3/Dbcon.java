import java.sql.Connection;
import java.sql.DriverManager;

public class Dbcon {
	static Connection conn = null;
	   public static Connection getConnection() {
	      if (conn != null) return conn;
	      String Username = "hr";
	      String password = "hr";
	      return getConnection(Username, password);
	   }
	   private static Connection getConnection(String UserName, String password) {
	      try {
	    	  Class.forName("oracle.jdbc.driver.OracleDriver");
	         conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",UserName,password);
	      } catch (Exception e) {
	         e.printStackTrace();
	      }
	      return conn;
	   }
	

}
