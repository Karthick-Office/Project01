package inheritanceDemo;

public class Payments extends HomePage {

	
	public void payments() {
		System.out.println("payments");
	}

	public static void main(String[] args) {
	
		Payments obj = new Payments();
		obj.openbrowser("Edge");       
		login("Karthick", "Karthick");  
		obj.Homepagetest();  
		obj.payments(); 
		obj.logut();  
		

	}

}
