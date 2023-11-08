package RESTAssured;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class StepUpCheck {

	@Test
	public void Check()
	{	
	Response res =	RestAssured.get("https://reqres.in/api/users/2");
	System.out.println(res.asString());
	System.out.println(res.getStatusCode());
		
	}
}

