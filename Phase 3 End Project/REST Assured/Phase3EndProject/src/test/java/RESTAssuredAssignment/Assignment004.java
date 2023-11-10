package RESTAssuredAssignment;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Assignment004 {

    @Test
    public void testUserLogin() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";

        given()
            .auth()
            .basic("Uname001", "@tt!tude")
        .when()
            .get("/user/login")
        .then()
            .statusCode(200)
            .body("code", equalTo(200))
            .body("message", containsString("logged in user session"));
    }
}
