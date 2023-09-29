package Seleniumdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumAutoIT {

	public static void main(String[] args) throws Exception {
     WebDriver driver=new ChromeDriver();
     driver.manage().deleteAllCookies();
     driver.manage().window().maximize();		
     driver.get("https://www.remove.bg/");
     Thread.sleep(3000);

//     ControlFocus("Open","","Edit1");
//     ControlSetText("Open","","Edit1","A:\Offi\photo.jpg");
//     ControlClick("Open","","Button1");
     
     
		WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
		e1.click();
		Runtime.getRuntime().exec("A://autoitdemo.exe");
		
		driver.quit();
		
	}

}
