package in.amazon.project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSignPage {

	public static void main(String[] args) throws Exception {
		
//		 Navigate to the Amazon homepage (https://amazon.in/)
//		 Open the browser and locate web elements using Locators
		
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.amazon.in");
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(3));
			
			WebElement el = driver.findElement(By.xpath("//*[@class='nav-line-1-container']"));
			Actions a = new Actions (driver); a.moveToElement (el).perform();
			Thread.sleep(3000);
			driver.findElement(By. linkText("Sign in")).click();
			
			// Inspect the Email and continue button on sign page i Put wrong password
			Thread.sleep(3000);
			driver.findElement(By.id("ap_email")).sendKeys("karthick@gmail.com");
			driver.findElement(By.xpath("//input[@id='continue']")).click();
			
			// inspect password input box and click on sign button
			driver.findElement(By.id("ap_password")).sendKeys("Karthick21");
			driver.findElement(By.id("signInSubmit")).click();
			
			WebElement e2 = driver.findElement(By.xpath("//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span"));
			System.out.println(e2.getText());
			
			
			
			
			

	}


}
