package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumCSSandXPath {

	public static void main(String[] args) throws Exception{
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	//CSS LOCATOR
	driver.get("https://www.facebook.com/");
	driver.findElement(By.cssSelector("input#email")).sendKeys("admin");
	driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("admin@123");
	driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
	Thread.sleep(1500);
    driver.findElement(By.linkText("Log in")).click();
    String innertext =  driver.findElement(By.cssSelector("#userloginForm > form > div > div.mw-htmlform-field-HTMLTextField.loginText.mw-userlogin-username.mw-ui-vform-field > label")).getText();
    System.out.println(innertext);
	
    
    //XPATH LOCATOR
    //Absolute XPath
    driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div/form/div/div/div[1]/input")).sendKeys("Hello");
    
    //Relative XPath:
    
     WebElement user = driver.findElement(By.xpath("//*[@id='wpName2']"));
     user.sendKeys("Karthick21");
     user.clear();
        
    //XPath by Element Attributes:id class name value
     WebElement user1 = driver.findElement(By.xpath("//input[@id='wpName2']"));
     user1.sendKeys("Karthick21");
     user1.clear();
     
     
    //XPath by Text
     driver.findElement(By.xpath("//div[text()='Tools']")).click();
     
     
    //XPath by Containing Partial Text
    driver.findElement(By.xpath("//a[contains(text(), 'me')]")).click();
    
    
    //XPath by Position     child  Descendant
    driver.findElement(By.xpath("//div[@class='mw-page-container']/div[1]"));

    
    //XPath by Axis  paren   child  Descendant
    driver.findElement(By.xpath("//label[@for='password']/parent::div/input"));
 
  
	}

}
