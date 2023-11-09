package RESTAssured;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class SSLAuthentication {
	@Test
	public void SSL_authentication()
	{
		RestAssured.given().relaxedHTTPSValidation()
		.when().get("https://testautomasi.com/Home/").then().log().all();
		
	}

}
