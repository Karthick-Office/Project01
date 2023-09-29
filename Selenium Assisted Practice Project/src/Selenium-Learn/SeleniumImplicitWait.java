package Seleniumdemo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumImplicitWait {

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
        driver.get("https://opera.com/download");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));		
		driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::span[1]")).click();
	}

}
