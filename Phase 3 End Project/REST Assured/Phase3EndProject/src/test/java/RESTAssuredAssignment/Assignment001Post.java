package RESTAssuredAssignment;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Assignment001Post {

    private static final String BASE_URL = "https://petstore.swagger.io/v2/pet";
    private static int petId;

    @Test(priority = 1)
    public void testPostCall() {
        // JSON Body for POST request
        String requestBody = "{ \"id\": 344, \"category\": { \"id\": 0, \"name\": \"string\" }, \"name\": \"Doggie\", \"photoUrls\": [\"string\"], \"tags\": [{ \"id\": 0, \"name\": \"string\" }], \"status\": \"available\" }";

        // Perform POST request
        petId = given()
                    .contentType(ContentType.JSON)
                    .body(requestBody)
                .when()
                    .post(BASE_URL)
                .then()
                    .statusCode(200)
                    .extract()
                    .path("id");

        // Validate petId in response
        given()
            .pathParam("petId", petId)
        .when()
            .get(BASE_URL + "/{petId}")
        .then()
            .statusCode(200)
            .body("id", equalTo(petId));
    }

    @Test(priority = 2)
    public void testGetCall() {
        given()
            .pathParam("petId", petId)
        .when()
            .get(BASE_URL + "/{petId}")
        .then()
            .statusCode(200)
            .body("status", equalTo("available"))
            .body("id", notNullValue());
    }

    @Test(priority = 3)
    public void testDeleteCall() {
        given()
            .pathParam("petId", petId)
        .when()
            .delete(BASE_URL + "/{petId}")
        .then()
            .statusCode(200)
            .body("code", equalTo(200))
            .body("message", equalTo(String.valueOf(petId)));
    }
}
