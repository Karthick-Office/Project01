package RESTAssured;

import static io.restassured.RestAssured.given;

import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;
public class BearerToken {
	@Test(priority='1')
	public void Authorization_bearertoken()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/user/repos")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
	

	
	@Test(priority='2')
	public void Authorization_bearertoken_specificrepo()
	{
		
	Response res=	given().baseUri("https://api.github.com")
		.basePath("/repos/Karthick-Office/Project1")
		.header("Authorization","Bearer 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")
		.when().get()
		.then().statusCode(200)
		.extract().response();
	
		res.prettyPrint();
	}
	
	
}