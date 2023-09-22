package inheritanceDemo;

public class HomePage extends Base{
	public void Homepagetest()
	{
		System.out.println("Hello Wellcome Home");
	}
	
	public static void main(String[] args) {
		HomePage obj = new HomePage();
		obj.openbrowser("Chrome");
		login("Karthick21", "Karthick@123");
		obj.Homepagetest();
		obj.logut();
	}

}
