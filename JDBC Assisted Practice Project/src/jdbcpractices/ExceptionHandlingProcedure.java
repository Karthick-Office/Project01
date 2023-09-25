package jdbcpractices;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExceptionHandlingProcedure {
   
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
		try {
	    Statement stmt=con.createStatement();
	     ResultSet rs=stmt.executeQuery("call sl");
			while (rs.next()) {
				  String r=rs.getString("id") +"\t"+rs.getString("title") +"\t"+rs.getString("release_date")+"\t"+ rs.getString("director") +"\t"+rs.getString( "studio");
				  System.out.println(r);	  
			}
		   
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			con.close();	
		}

		}

}
