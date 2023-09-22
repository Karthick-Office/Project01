package inheritanceDemo;

public class MethodsDemo2 {
    int x = 100;
	String str3 = "Java";
	
	public int sum()
	{
		int a =10;
		int b=20;
		return a+b+x;   
		
	}
	
	public String concatmethod()
	{
		String str1 = "selenium";
		String str2 = "training";
		return str1+str2+str3;
	}
	
	public void printmethod()
	{
		System.out.println("The global integer variable : " + x);
		System.out.println("The global String variable : " + str3);
	}

	public static void main(String[] args) {		
		MethodsDemo2 obj = new MethodsDemo2();
		System.out.println(obj.concatmethod());
		int value = obj.sum();
		System.out.println(value);
		obj.printmethod();
		
	}

}
