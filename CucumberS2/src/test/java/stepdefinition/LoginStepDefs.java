package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.LoginPage;

public class LoginStepDefs {
    private WebDriver driver;
    private LoginPage loginPage;

    @Given("user is on the login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("user enters valid credentials")
    public void userEntersValidCredentials() {
        loginPage.clickLoginButton();
        loginPage.enterEmail("karthick@gmail.com");
        loginPage.enterPassword("1234554321");
       
    }

    @When("clicks the login button")
    public void login() {
    	 loginPage.clickSubmitButton();
    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        // Add verification steps for successful login
    }
}
