package definition.reqres.in;
import java.io.ObjectInputFilter.Config;

import org.json.JSONObject;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.http.ContentType;
import io.restassured.internal.http.AuthConfig;
import static io.restassured.RestAssured.config;
public class reqres {
	@Given("User send a Post request to create a user and validates status")
	public void user_send_a_post_request_to_create_a_user_and_validates_status() {
	    
		JSONObject body = new JSONObject();
		body.put("name", "meghna");
		body.put("job", "developer");
		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType(ContentType.JSON)
		.body(body.toString())
		.when().post()
		.then().statusCode(201).log().ifError(); // log if there an error
		
		
	}

	
	  @Given("User sends a Get request to get a user and validates status")
	  public void user_sends_a_get_request_to_get_a_user_and_validates_status() {

			  JSONObject body = new JSONObject();
			  body.put("email", "meghna@gmail.com");
			  body.put("password", "pas123");  
			  RestAssured.given() .baseUri("https://reqres.in")
			  .contentType(ContentType.JSON) .body(body.toString())
			  .when().post("/api/register")
			  .then().statusCode(400);
			  
	  
	  }
	 

	@Given("User sends a get request to get list of users and validates status")
	public void user_sends_a_get_request_to_get_list_of_users_and_validates_status() {
	 		
		RestAssured.given()
		.baseUri("https://reqres.in")
		.basePath("/api/unknown")
		.when().get()
		.then().statusCode(200).log().all();
	}

}