package apitestRestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ApiTests {
	//java -jar -Dserver.port=8100 sporty-shoes-v1.jar

    private static final String BASE_URL = "http://localhost:8100";

    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = BASE_URL;
    }

    @Test
    public void testGetAllProductsEndpoint() {
        given()
            .when()
            .get("/get-shoes")  // Using a relative path
            .then().log().all()
            .statusCode(200)
            .body("size()", greaterThan(0));
    }

    @Test
    public void testGetAllUsersEndpoint() {
        given()
            .when()
            .get("/get-users")
            .then()
            .statusCode(200)
            .body("size()", greaterThan(0));
    }

    @Test
    public void testAddProductEndpoint() {
        given()
            .param("id", 101)
            .param("image", "image_url")
            .param("name", "SampleShoe")
            .param("category", "Running")
            .param("sizes", "9")
            .param("price", 1000)
            .when()
            .post("/add-shoe")
            .then()
            .statusCode(200);
    }

    @Test
    public void testDeleteProductEndpoint() {
        given()
            .param("id", 101)
            .when()
            .delete("/delete-shoe")
            .then()
            .statusCode(200);
    }

 
    @Test
    public void testUpdateProductEndpoint() {
        given()
        .param("id", 101)
        .param("image", "image_url")
        .param("name", "SampleShoe")
        .param("category", "sports")
        .param("sizes", "9")
        .param("price", 1000).when()
            .put("/update-shoe")
            .then()
            .statusCode(200);
    }
}
