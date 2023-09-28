package Seleniumdemo;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumWebElement {

	public static void main(String[] args) throws Exception{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		
		// Input Field
		driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement usernameInput = driver.findElement(By.xpath("//input[@type='number']"));
        usernameInput.sendKeys("7392341234");

        Thread.sleep(2000);
        // Link
        driver.navigate().to("https://the-internet.herokuapp.com/redirector");
        WebElement aboutUsLink = driver.findElement(By.linkText("here"));
        aboutUsLink.click();
        
        Thread.sleep(2000);
        // Button
        driver.navigate().to("https://www.saucedemo.com");
        WebElement submitButton = driver.findElement(By.name("login-button"));
        submitButton.click();
        
        
        Thread.sleep(2000);
        //Image, Image Link, and Image Button
        driver.navigate().to("https://www.tutorialspoint.com/index.htm");
        WebElement logoImage = driver.findElement(By.cssSelector("img[src='/images/logo.png?v3']"));
        logoImage.click();
        
//        Thread.sleep(2000);
//        //Text Area
//        WebElement commentsTextArea = driver.findElement(By.xpath("//textarea[@id='comments']"));
//        commentsTextArea.sendKeys("This is a sample comment.");
        
//        Thread.sleep(2000);
//        //Checkbox
//        WebElement agreeCheckbox = driver.findElement(By.id("agree"));
//        agreeCheckbox.click();
//        
//        Thread.sleep(2000);
//        //Radio Button
//        WebElement radioButton = driver.findElement(By.name("gender"));
//        radioButton.click();
//        
//        Thread.sleep(2000);
//        //Dropdown List (Select Element)
//        Select countryDropdown = new Select(driver.findElement(By.id("country")));
//        countryDropdown.selectByVisibleText("United States");
//        
//        Thread.sleep(2000);
//        //Web Table/HTML Table
//        WebElement cell = driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[2]/td[3]"));
//        String cellText = cell.getText();
        
        Thread.sleep(2000);
        //Frame (iFrame)
        driver.navigate().to("https://the-internet.herokuapp.com/nested_frames");
        driver.switchTo().frame("frame-top");
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

	}

}







