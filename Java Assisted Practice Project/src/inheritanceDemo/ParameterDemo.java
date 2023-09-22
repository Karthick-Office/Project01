package inheritanceDemo;

public class ParameterDemo {

public void login(String username,String password)
	{
		System.out.println("Enter Username: " + username);
		System.out.println("Enter Password: " + password);
		System.out.println("Sign into mailbox");
	}
	
	public void ComposeEmail(String text)
	{
		System.out.println("Compose an Email with text as: " + text);
	}
	
	public void logut()
	{
		System.out.println("Click on logout button");
	}

	public static void main(String[] args) {
		ParameterDemo obj = new ParameterDemo();
	obj.login("Karthick21", "Karthick");
	obj.ComposeEmail("Mr");
	obj.logut();
		

	}

}
