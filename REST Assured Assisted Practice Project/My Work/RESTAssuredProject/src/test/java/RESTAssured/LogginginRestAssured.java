package RESTAssured;
import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;
public class LogginginRestAssured {

	@Test(priority='1')
	public void loggingmethods()
	{
		String PMapikey = "11BCTASFQ0WLcr3ZHHJUcy_AF1lNI2qSLlntbHaVtozmh911BCTASFQ0WLcr3ZHHJUcy_AF1lNI2qSLlntbHaVtozmh9";
		given().baseUri("https://api.postman.com")
		.basePath("/workspaces")
		.header("X-API-Key", PMapikey)
		.when().get()
		//.then().statusCode(200).log().headers()
		//.then().log().ifError()
		//.then().statusCode(200).log().cookies();
		.then().statusCode(200).log().all();
		
		
	}

}