package com.testng.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testng.selenium.base.TestBase;

public class HomePage extends TestBase  {

	@FindBy(linkText = "My Account")
	WebElement myaccount;	
	@FindBy(linkText = "Register")
	WebElement register;
	@FindBy(linkText = "Login")
	WebElement login;
	@FindBy(linkText = "Wish List (0)")
	WebElement wishlist;
	@FindBy(linkText = "Shopping Cart")
	WebElement shoppingcart;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	public void clickonmyAccount()
	{
		myaccount.click();
		
	}
	public void clickonLogin()
	{
		login.click();
		
	}
	public void clickonRegister()
	{
		register.click();
		
	}
	public void clickonShoppingcart()
	{
		shoppingcart.click();
		
	}
	

}
