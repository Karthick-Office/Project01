package jdbcpractices;
import java.sql.*;

public class JdbcFinal {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from products where product_id=5");
	

		while (rs.next()) {
			  String r=rs.getString(1) +"\t"+rs.getString(2) +"\t"+rs.getString(3)+"\t"+ rs.getString(4) +"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7);
			  System.out.println(r);	  
		}
	   con.close();
	
}}


