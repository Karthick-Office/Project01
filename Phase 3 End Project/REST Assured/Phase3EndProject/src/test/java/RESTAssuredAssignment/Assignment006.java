package RESTAssuredAssignment;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Assignment006 {

    @Test
    public void testUserLogout() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
        .when()
            .get("/user/logout")
        .then()
            .statusCode(200)
            .body("code", equalTo(200))
            .body("message", equalTo("ok"));
    }
}
