package inheritanceDemo;

public class OverRiding extends OverLoading {
	

	public String sum(String a, String b)
	{
		
		String result = a+b;
		return result; 
		
	}
	

	public int sum()   
	{
		int a =10;
		int b=20;
		int result = a+b;
		return result;   
		
	}

	public static void main(String[] args) {

		OverRiding obj = new OverRiding();
		
		
		obj.sum(); 

	}

}







