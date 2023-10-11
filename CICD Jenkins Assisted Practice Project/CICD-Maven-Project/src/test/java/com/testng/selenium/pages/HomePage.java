package com.testng.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testng.selenium.base.TestBase;

public class HomePage extends TestBase  {

	@FindBy(xpath="//*[@id=\"src\"]")
	WebElement source;
	
	@FindBy(xpath="//*[@id=\"dest\"]")
	WebElement destination;

	@FindBy(xpath="//*[@id=\"search_button\"]")
	WebElement button;
	

	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void gettitle()
	{
		System.out.println(driver.getTitle());
	}
	public void setlocation() throws InterruptedException
	{
		source.sendKeys("Chicago");
		destination.sendKeys("Miami");
		Thread.sleep(1000);
		button.click();
		
	}


}
