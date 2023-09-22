package javaPrograms;

public class Accessmodifier {
	static int cmm =12;
	static int mmm = 7;

	static public String wushu = "sports";
	static public String tool = "nife";
	

	static private int a =12;
	static private int b = 7;
	
	static protected int x = 10;
	static protected int z = 20;
	public static void main(String[] args) {
		System.out.println(mmm);
		System.out.println(cmm);
	    System.out.println(wushu);
		System.out.println(tool);
		System.out.println(x);
		System.out.println(z);
	}


}
