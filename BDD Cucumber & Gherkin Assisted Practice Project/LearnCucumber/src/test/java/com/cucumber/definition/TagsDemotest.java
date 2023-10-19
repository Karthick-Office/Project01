package com.cucumber.definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TagsDemotest {
	
	@Given("User opens the homepage")
	public void user_opens_the_homepage() {
		System.out.println("Open home page");
	}

	@Given("user clicks on my Account")
	public void user_clicks_on_my_account() {
		System.out.println("Open Account page");
	}

	@When("User clicks on Login link")
	public void user_clicks_on_login_link() {
		System.out.println("click on login page");
	}

	@Then("capture title of the page")
	public void capture_title_of_the_page() {
		System.out.println("capture title of the page");
	}

	@Then("Close the browser")
	public void close_the_browser() {
		System.out.println("close the browser");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("username & password");
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		System.out.println("click on login");
	}

	@Then("capture the title of new page")
	public void capture_the_title_of_new_page() {
		 System.out.println("capture title of the page");
	}

	@When("User clicks on logout link")
	public void user_clicks_on_logout_link() {
	   System.out.println("click on logout button");
	}

	

}
