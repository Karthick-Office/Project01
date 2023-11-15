// apistepdefinitions.java
package cucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.datatable.DataTable;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class apistepdefinitions {

    @Given("the base URL is {string}")
    public void setBaseURL(String baseUrl) {
        RestAssured.baseURI = baseUrl;
    }

    @When("user performs GET request to {string}")
    public void performGetRequest(String endpoint) {
        given().when().get(endpoint).then().log().all();
    }

    @When("user performs POST request to {string} with parameters:")
    public void performPostRequest(String endpoint, DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        given()
            .contentType(ContentType.JSON)
            .queryParams(data)// Use params() to include parameters in the URL
        .when()
            .post(endpoint)
        .then()
            .log().all()
            .statusCode(200);
    }

    @When("user performs DELETE request to {string} with parameter {string} equal to {int}")
    public void performDeleteRequest(String endpoint, String parameter, int value) {
        given()
            .param(parameter, value)
        .when()
            .delete(endpoint)
        .then()
            .log().all()
            .statusCode(200);
    }

    @When("user performs PUT request to {string} with parameters:")
    public void performPutRequest(String endpoint, DataTable dataTable) {
        Map<String, String> data = dataTable.asMap(String.class, String.class);

        given()
            .contentType(ContentType.JSON)
            .queryParams(data)  // Use params() to include parameters in the URL
        .when()
            .put(endpoint)
        .then()
            .log().all()
            .statusCode(200);
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int statusCode) {
        given().then().statusCode(statusCode);
    }

    @Then("the response body size should be greater than {int}")
    public void verifyBodySize(int size) {
        given().then().body("size()", greaterThan(size));
    }
}
