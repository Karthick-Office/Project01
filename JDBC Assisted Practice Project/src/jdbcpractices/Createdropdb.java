package jdbcpractices;
import java.sql.*;

public class Createdropdb {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query1 = "create database mydatabase";
		String query2 = "use mydatabase";
		String query3 = "drop database mydatabase";
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
		Statement stmt =con.createStatement();
		
		stmt.executeUpdate(query1);
		System.out.println("Database mydatabase created successfully");
		stmt.executeUpdate(query2);
		System.out.println("Selected database: mydatabase");
		stmt.executeUpdate(query3);
		System.out.println("Deleted database: mydatabase");
	
	}

}
