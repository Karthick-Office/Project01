package jdbcpractices;

import java.sql.*;

public class InsertUpdateDeletedb {

	public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String query1 = "insert into Learn.animation_movies values (?,?,?,?,?)";
    String query2 = "delete from Learn.animation_movies where id=5";
    String query3 = "update animation_movies set id=99 where id=1";
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");

	PreparedStatement ps=con.prepareStatement(query1);
	PreparedStatement ps1=con.prepareStatement(query2);
	PreparedStatement ps2=con.prepareStatement(query3);
	ps.setInt(1,90);
	ps.setString(2,"HARRY");
	ps.setString(3,"2003-05-30");
	ps.setString(4,"Andrew Stanton");
	ps.setString(5,"U studio");
	ps.executeUpdate();
	ps1.executeUpdate();
	ps2.executeUpdate();
	con.close();
	}

}
