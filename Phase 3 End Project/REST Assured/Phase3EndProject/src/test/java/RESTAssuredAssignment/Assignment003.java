package RESTAssuredAssignment;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Assignment003 {

    @Test
    public void testUserDetails() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
            .pathParam("username", "Uname001")
        .when()
            .get("/user/{username}")
        .then()
            .statusCode(200)
            .body("username", equalTo("Uname001"))
            .body("email", equalTo("Positive@Attitude.com"))
            .body("userStatus", equalTo(1));
    }
}
