package com.cucumber.definition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ExamplesTestDemo {
	
WebDriver driver;
	
	@Given("I am on RediffPage")
	public void I_am_on_RediffPage()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mypage.rediff.com/login/dologin");
	}
	
	@When("I enter {string} on the page")
	public void emailid(String EmailID) {
		
		driver.findElement(By.id("txtlogin")).sendKeys(EmailID);	   
	}

	@And("I enter {string} on the Page")
		public void passwd(String Password)
		{
			driver.findElement(By.id("pass_box")).sendKeys(Password);
		}
		
	
	@When("click on Login")
	public void click_on_Login() throws InterruptedException {
	  
		driver.findElement(By.xpath("//*[@id=\"pass_div\"]/input[3]")).click();
		Thread.sleep(2000);
		driver.close();
	}
	

}
