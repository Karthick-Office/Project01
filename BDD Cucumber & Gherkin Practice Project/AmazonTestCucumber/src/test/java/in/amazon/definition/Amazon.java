package in.amazon.definition;
import io.cucumber.java.en.*;

public class Amazon {

    @Given("I am a registered Amazon user")
    public void register() {
        System.out.println("I am a registered Amazon user.");
    }

    @Given("I am on the Amazon homepage")
    public void homepage() {
        System.out.println("I am on the Amazon homepage.");
    }

    @When("I log in with my Amazon credentials")
    public void login() {
        System.out.println("I log in with my Amazon credentials.");
    }

    @Then("I should be successfully logged in")
    public void logged() {
        System.out.println("I should be successfully logged in.");
    }

    @When("I search for {string} in the Amazon search bar")
    public void search(String string) {
        System.out.println("I search for '" + string + "' in the Amazon search bar.");
    }

    @When("I add the product to my Amazon shopping cart")
    public void addcart() {
        System.out.println("I add the product to my Amazon shopping cart.");
    }

    @When("I proceed to checkout")
    public void checkout() {
        System.out.println("I proceed to checkout.");
    }

    @When("I provide shipping and payment information with the following details:")
    public void paymentinformation(String docString) {
        System.out.println("I provide shipping and payment information with the following details:");
        System.out.println(docString);
    }

    @When("I confirm my order")
    public void confirmorder() {
        System.out.println("I confirm my order.");
    }

    @When("I log out of my Amazon account")
    public void logout() {
        System.out.println("I log out of my Amazon account.");
    }

    @Then("I should be logged out successfully")
    public void loggedout() {
        System.out.println("I should be logged out successfully.");
    }

    @When("I attempt to log in with invalid Amazon credentials")
    public void logininvalidcredentials() {
        System.out.println("I attempt to log in with invalid Amazon credentials.");
    }

    @Then("I should see an error message")
    public void errormessage() {
        System.out.println("I should see an error message.");
    }
}
