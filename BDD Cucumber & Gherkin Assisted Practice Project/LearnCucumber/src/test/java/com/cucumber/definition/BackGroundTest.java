package com.cucumber.definition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BackGroundTest {
	
	WebDriver driver;
	String url;
	String title;
	
	@Given("User opens the chromeBrowser")
	public void user_opens_te_chrome_browser() {
	   
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@When("User enters the webpage URL")
	public void user_enters_the_webpage_url() {
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}

	@Then("Page opens check the URL of the Page")
	public void page_opens_check_the_url_of_the_page() {
	 
		 url = driver.getCurrentUrl();
	}

	@Then("Fetch the URL of the page")
	public void fetch_the_url_of_the_page() {
	  System.out.println(url);
	}

	@Then("Page opens check the title of the Page")
	public void page_opens_check_the_title_of_the_page() {
	 
		title = driver.getTitle();
	}

	@Then("Fetch the title of the page")
	public void fetch_the_title_of_the_page() {
		System.out.println(title);
	}

	@When("user enters username and passowoed")
	public void user_enters_username_and_passowoed() {
		System.out.println(">> User enters username");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println(">> User enters login");
	}
	
	@Then("user closes the browser")
	public void closebrowser() {
		driver.close();
	}
	

}
