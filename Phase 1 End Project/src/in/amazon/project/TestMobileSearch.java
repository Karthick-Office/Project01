package in.amazon.project;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMobileSearch {

	public static void main(String[] args) throws Exception {
		
//		 Navigate to the Amazon (https://amazon.in/)
//		 Open the browser and locate web elements using Locators
		
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.amazon.in");
			driver.findElement(By.linkText("Mobiles")).click();			
		
			WebElement b=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
			b.sendKeys("iphone 13");
			b.submit();
			Thread.sleep(1500);
			driver.findElement(By.xpath("(//div[@class='a-section'])[2]/descendant::span[11]")).click();
	        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			Thread.sleep(1500);			
			driver.findElement(By.id("wishlistButtonStack")).click();
			driver.quit();
			
			
			
//	
//			driver.findElement(By.linkText("Apple")).click();	
//			driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[6]/descendant::span[9]")).click();		
//		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//		
//			
//			driver.switchTo().window(tabs.get(1));
//			Thread.sleep(1500);
//			driver.findElement(By.id("add-to-cart-button")).click();
			
			
			

	}

}
