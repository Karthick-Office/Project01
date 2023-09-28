package Seleniumdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumBrowserMethod {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.findElement(By.linkText("Log in")).click();
		
		WebElement username=driver.findElement(By.id("wpName1"));
		username.isDisplayed();
	    username.isEnabled();
	    username.sendKeys("Karthick739700");
	    
	    WebElement password=driver.findElement(By.id("wpPassword1"));
	    password.sendKeys("KARTHICaK@1234");
	    
	    driver.findElement(By.name("wpRemember")).click();
	    driver.findElement(By.name("wploginattempt")).click();
	    Thread.sleep(1000);
	    System.out.println( driver.findElement(By.className("cdx-message__content")).getText());
	    
	    Thread.sleep(1000);
	    driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
	    WebElement d= driver.findElement(By.xpath("//select[start-with(@name,'car')"));
	    Select dd = new Select(d);
	    dd.selectByIndex(2);
	  
	    Select ddd = new Select(d);
	    ddd.selectByIndex(4);
		
	    
	    
       
	}

}
