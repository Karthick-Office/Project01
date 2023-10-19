package com.cucumber.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GherkinKeywordsTest {
	
	/*  Given: User opens rediff Page
	    When: User validated PageTitle
	    Then: User enters Username and Password
	    And: User click on Login Button
	    Then: User closes the browser */

	    WebDriver driver ;
	  
	    @Given("User opens rediff Page")
	  public void openBrowser()
	  {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  }
	    @When("User validated PageTitle")
	    public void validateTitle()
	    {
	    	System.out.println(driver.getTitle());
	    }
	    
	    @Then("User enters Username and Password")
	    public void user_enters_username_and_password() {
	    	System.out.println("User enters username");
	    }

	    @Then("User click on Login.")
	    public void user_click_on_login() {
	    	System.out.println("User clicks on login");
	    }

	    @Then("User closes the browser")
	    public void user_closes_the_browser() {
	       driver.close();
	    }
}
