package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pagefactory.SearchPage;

public class SearchStepDefs {
    private WebDriver driver;
    private SearchPage searchPage;

    @Given("user is on the search page")
    public void userIsOnSearchPage() {
        driver = new ChromeDriver();
        searchPage = new SearchPage(driver);
        driver.get("https://demowebshop.tricentis.com/");
    }

    @When("user enters a product to search")
    public void userEntersProductToSearch() {
        searchPage.performSearch("laptop");
    }

    @Then("relevant products should be displayed")
    public void relevantProductsShouldBeDisplayed() {
        // Add verification steps for search results
    }
}
