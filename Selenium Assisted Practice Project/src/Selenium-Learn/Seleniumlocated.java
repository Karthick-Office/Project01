package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumlocated {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://en.wikipedia.org/w/index.php?returnto=Wikipedia%3ASign+up&title=Special:UserLogin&centralAuthAutologinTried=1&centralAuthError=Not+centrally+logged+in");
	  // By.id("wpName1") - Locate the username input field by its ID
    WebElement usernameInput = driver.findElement(By.id("wpName1"));
    usernameInput.sendKeys("Karthick21"); // Enter your username
    
    // By.name("wpPassword") - Locate the password input field by its name
    WebElement passwordInput = driver.findElement(By.name("wpPassword"));
    passwordInput.sendKeys("Karhick21@"); // Enter your password
    
    // By.linkText("Log in") - Locate the "Log in" link by its link text
    WebElement loginLink = driver.findElement(By.linkText("Log in"));
    loginLink.click(); // Click the "Log in" link
    
    // By.partialLinkText("Learn more") - Locate a link with partial text
    WebElement learnMoreLink = driver.findElement(By.partialLinkText("Learn more"));
    learnMoreLink.click(); // Click the link with partial text "Learn more"
    
    // By.tagName("button") - Locate a button element by its tag name
    WebElement submitButton = driver.findElement(By.tagName("button"));
    submitButton.click(); // Click the button
    
    // By.cssSelector("#searchInput") - Locate an element by CSS selector
    WebElement searchInput = driver.findElement(By.cssSelector("#searchInput"));
    searchInput.sendKeys("Selenium"); // Enter text into the search input field
    
    // By.xpath("//input[@id='searchInput']") - Locate an element using XPath
    WebElement xpathSearchInput = driver.findElement(By.xpath("//input[@id='searchInput']"));
    xpathSearchInput.clear(); // Clear the text in the input field
    
    // Close the WebDriver
    
	
	}

}
