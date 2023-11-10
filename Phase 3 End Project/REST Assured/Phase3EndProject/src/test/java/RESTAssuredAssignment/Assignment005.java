package RESTAssuredAssignment;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Assignment005 {

    @Test
    public void testPetStatus() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
            .param("status", "available")
        .when()
            .get("/pet/findByStatus")
        .then()
            .statusCode(200)
            .body("status", everyItem(equalTo("available")));

        given()
            .param("status", "pending")
        .when()
            .get("/pet/findByStatus")
        .then()
            .statusCode(200)
            .body("status", everyItem(equalTo("pending")));

        given()
            .param("status", "sold")
        .when()
            .get("/pet/findByStatus")
        .then()
            .statusCode(200)
            .body("status", everyItem(equalTo("sold")));
    }
}
