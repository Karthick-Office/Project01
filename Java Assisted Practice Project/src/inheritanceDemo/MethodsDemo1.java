package inheritanceDemo;

public class MethodsDemo1 {
	
	public void login()
	{
		System.out.println("Enter Username");
		System.out.println("Enter Password");
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail()
	{
		System.out.println("Compose an Email");
	}
	
	public void logut()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		
		MethodsDemo1 obj = new MethodsDemo1();
		
		obj.login();
		
		obj.ComposeEmail();
		
		obj.logut();
		
		
		
		
	}

}








