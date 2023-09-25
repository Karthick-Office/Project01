package jdbcpractices;

import java.sql.*;

public class Transactiondb {

	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String query1 = "insert into Learn.animation_movies values (45,'HARRY','2003-05-30','Andrew Stanton','U studio')";
	    String query2 = "delete from Learn.animation_movies where id=5";
	    String query3 = "update animation_movies set id=1 where id=99";
	    boolean flag = false;
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
		Statement stmt = con.createStatement();
		con.setAutoCommit(false);
		stmt.addBatch(query1);
		stmt.addBatch(query2);
		stmt.addBatch(query3);
		
		int [] result = stmt.executeBatch();
		
		for(int i =0; i<result.length;i++)
		{
			System.out.println(result[i]);
			if(result[i]==0) {
				flag = true;
				break;
			}
		}
		
		if(flag==false) {
			con.commit();
			System.out.println("transaction successful");
		}
		else {
			con.rollback();
			System.out.println("transaction Failure");
		}
		con.close();
		}

}
