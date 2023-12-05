package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;
public class APITestDefs {
	 private Response response;

	    @Given("the Ergast Developer API endpoint for 2018 racers data is {string}")
	    public void setApiEndpoint(String apiEndpoint) {
	        RestAssured.baseURI = apiEndpoint;
	    }

	    @When("a GET request is made")
	    public void makeGetRequest() {
	        response = RestAssured.get();
	    }

	    @Then("the response status code should be {int}")
	    public void verifyStatusCode(int expectedStatusCode) {
	        int actualStatusCode = response.getStatusCode();
	        Assert.assertEquals("Unexpected status code", expectedStatusCode, actualStatusCode);
	    }

	    @Then("the response body should not be empty")
	    public void verifyResponseBodyNotEmpty() {
	        String responseBody = response.getBody().asString();
	        Assert.assertTrue("Response body is empty", !responseBody.isEmpty());
	    }
	}