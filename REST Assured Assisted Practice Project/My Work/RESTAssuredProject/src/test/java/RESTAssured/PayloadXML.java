package RESTAssured;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class PayloadXML {

	@Test
	public void payloadXML()
	{
		
		String xmlrequestBody = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<Pet>\r\n"
				+ "	<id>0</id>\r\n"
				+ "	<Category>\r\n"
				+ "		<id>0</id>\r\n"
				+ "		<name>string</name>\r\n"
				+ "	</Category>\r\n"
				+ "	<name>doggie</name>\r\n"
				+ "	<photoUrls>\r\n"
				+ "		<photoUrl>string</photoUrl>\r\n"
				+ "	</photoUrls>\r\n"
				+ "	<tags>\r\n"
				+ "		<Tag>\r\n"
				+ "			<id>0</id>\r\n"
				+ "			<name>string</name>\r\n"
				+ "		</Tag>\r\n"
				+ "	</tags>\r\n"
				+ "	<status>available</status>\r\n"
				+ "</Pet>";
		
		RestAssured.given()
		.baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet")
		.contentType(ContentType.XML)
		.accept("application/xml")
		.body(xmlrequestBody)
		.when().post()  // execute post request
		.then()
		.statusCode(200)
		.body("Pet.name", Matchers.equalTo("doggie"))
		.log().all();
		
	}
	
}
