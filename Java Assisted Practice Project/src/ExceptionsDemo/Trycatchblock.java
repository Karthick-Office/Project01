package ExceptionsDemo;

public class Trycatchblock {

	public static void main(String[] args) {
		int i=0;
		int j=10;
		try {
		System.out.print(j/i);
		}
		catch(Exception e){
      System.out.print(e.getMessage());
      System.out.print("Exception Occur");
	   }

}}
