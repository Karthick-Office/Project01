package ExceptionsDemo;

public class Trycatchfinally {

	public static void main(String[] args) {
		int i=0;
		int j=10;
		try {
		System.out.print(j/i);
		}
		catch(Exception e){
      System.out.println(e.getMessage());
      	   }
		finally {
			System.out.println("I am in finally Block");
		}
	}

}
