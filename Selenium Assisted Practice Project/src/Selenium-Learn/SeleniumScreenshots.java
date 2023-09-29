package Seleniumdemo;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumScreenshots {
	
//	●	First , close the Firefox if it is open.
//	●	Open Run (Windows+R) and type firefox.exe -p and click OK.
//	●	A dialogue box will open named “Firefox -choose user profile.”
//	●	Select the option “Create Profile” from the window, and a Wizard will open. Click on Next.
//	●	Provide your profile name which you want to create, and click on the Finish button.
	
	//Try with JavascriptExecutor

	public static void drawborder(WebElement element, WebDriver driver)
	{
		JavascriptExecutor js =  ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].style.border='3px solid red'", element);
				
	}

	public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	
	driver.get("https://opera.com/download");	
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFile = new File("./Screenshots/opera.png");
	FileUtils.copyFile(srcFile, destFile);
	
	
	//Try with JavascriptExecutor
	Thread.sleep(1000);
	WebElement e1 =	driver.findElement(By.xpath("(//div[@class='cookie-consent__body'])[1]/descendant::span[1]"));
	drawborder(e1,driver);
	File srcFiles = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destFiles = new File("./Screenshots/Acceptcookies.png");
	
	FileUtils.copyFile(srcFiles, destFiles);

	}

}
