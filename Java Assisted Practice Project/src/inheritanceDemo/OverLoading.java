package inheritanceDemo;

public class OverLoading {

	public int sum()
	{
		int a =10;
		int b=20;
		int result = a+b;
		return result; 
		
	}

	public int sum(int a, int b)
	{
		a = 10;
		b=20;
		int result = a+b;
		return result; 
		
	}

	public int sum(int a, int b, int c)
	{
		
		int result = a+b+c;
		return result;  
		
	}

	public static void main(String[] args) {
		
		OverLoading obj = new OverLoading();
		System.out.println(obj.sum());
		System.out.println(obj.sum(10, 20, 30));

	}

}

















