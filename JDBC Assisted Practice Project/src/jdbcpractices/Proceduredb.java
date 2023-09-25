package jdbcpractices;

import java.sql.*;

public class Proceduredb {
	
//	use learn;
//	delimiter @
//	create procedure sl()
//	begin
//	select * from animation_movies;
//	end@
//	delimiter ;

	public static void main(String[] args) throws Exception {
     Class.forName("com.mysql.cj.jdbc.Driver");
     Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
     Statement stmt=con.createStatement();
     ResultSet rs=stmt.executeQuery("call sl");
		while (rs.next()) {
			  String r=rs.getString("id") +"\t"+rs.getString("title") +"\t"+rs.getString("release_date")+"\t"+ rs.getString("director") +"\t"+rs.getString( "studio");
			  System.out.println(r);	  
		}
	   con.close();
     

	}

}
