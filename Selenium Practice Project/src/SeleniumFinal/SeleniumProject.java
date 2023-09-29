package SeleniumFinal;
import java.io.*;
import java.time.Duration;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.sql.*;

public class SeleniumProject {

		public static void main(String[] args) throws Exception {

			
            //10.Create a class to handle external elements. 
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			
	
	        WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.redbus.com/");
			
			//3.Open the browser and locate the web elements using Locators
			//4.Create a page object design pattern class to store the web elements of a webpage.
			driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[1]")).sendKeys("Paris");
			driver.findElement(By.xpath("//div[@class='main-wrapper search-box-wrapper']/descendant::input[2]")).sendKeys("London, United Kingdom");
		    
			JavascriptExecutor js = ((JavascriptExecutor)driver);
		    js.executeScript("document.getElementById('onward_cal').value='30-Sep-2023'");
			driver.findElement(By.xpath("//*[@class='main-wrapper search-box-wrapper']/descendant::div[16]")).click();
			
			
			//5.Install and configure AutoIT. 
			//6.Open the SciTE editor and write the script to select the file from the desktop. 
			//7.Save the AutoIT script as .au3 format and compile it. 
			//8.Create a class to upload the file by calling .au3 script.
			
			driver.get("https://www.remove.bg/");
			Thread.sleep(3000);
			WebElement e1 = driver.findElement(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]"));
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='mx-auto w-full px-8 max-w-5xl relative']/descendant::button[1]")));
			e1.click();
			Runtime.getRuntime().exec("A://autoitdemo.exe");
			
			
	        driver.get("https://www.amazon.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
			WebElement e2 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
			Actions a = new Actions(driver);
			a.moveToElement(e2).perform();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//span[@class='nav-text'])[7]")).click();
			
			//9.Create a class to handle web elements. 
			 driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
		     driver.switchTo().frame("frame-top");
		     driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		     ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		     driver.switchTo().window(tabs.get(1));
			
			//11.Create a table in SQL – for product data
			//12.Create a DB connection class to initiate a JDBC connection. 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
			Statement stmt =con.createStatement();
			ResultSet rs=stmt.executeQuery("SELECT * FROM Products");
		    while (rs.next()) {
		        int productId = rs.getInt(1);
		        String productName = rs.getString(2);
		        Thread.sleep(1000);
		     
		    	Thread.sleep(1000);
		        driver.get("https://the-internet.herokuapp.com/inputs");
		        Thread.sleep(1000);
		        WebElement usernameInput = driver.findElement(By.xpath("//input[@type='number']"));
		        usernameInput.sendKeys(productName);
		        break;
		     
		    }

			//13.Create a class for Screenshot
			
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);			
			File destFile = new File("./Screenshots/project.png");
			FileUtils.copyFile(srcFile, destFile);
			
			
			
			
			
			
		}

	}