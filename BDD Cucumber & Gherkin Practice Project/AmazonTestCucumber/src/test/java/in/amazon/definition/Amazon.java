package in.amazon.definition;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;

public class Amazon {
	public static WebDriver driver;
	
    @Given("I am a registered Amazon user")
    public void register() {
        System.out.println("I am a registered Amazon user.");
    }

    @Given("I am on the Amazon homepage")
    public void homepage() {
        System.out.println("I am on the Amazon homepage.");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.get("https://amazon.in");    
    }

    @When("I log in with my Amazon credentials")
    public void login() throws InterruptedException {
        System.out.println("I log in with my Amazon credentials.");
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

    @Then("I should be successfully logged in")
    public void logged() {
        System.out.println("I should be successfully logged in.");
    }

    @When("I search for {string} in the Amazon search bar")
    public void search(String string) throws InterruptedException {
        System.out.println("I search for '" + string + "' in the Amazon search bar.");
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
    }

    @When("I add the product to my Amazon shopping cart")
    public void addcart() {
        System.out.println("I add the product to my Amazon shopping cart.");
    }

    @When("I proceed to checkout")
    public void checkout() {
        System.out.println("I proceed to checkout.");
    }

    @When("I provide shipping and payment information with the following details:")
    public void paymentinformation(String docString) {
        System.out.println("I provide shipping and payment information with the following details:");
        System.out.println(docString);
    }

    @When("I confirm my order")
    public void confirmorder() {
        System.out.println("I confirm my order.");
    }

    @When("I log out of my Amazon account")
    public void logout() {
        System.out.println("I log out of my Amazon account.");
    }

    @Then("I should be logged out successfully")
    public void loggedout() {
        System.out.println("I should be logged out successfully.");
    }

    @When("I attempt to log in with invalid Amazon credentials")
    public void logininvalidcredentials() {
        System.out.println("I attempt to log in with invalid Amazon credentials.");
    }

    @Then("I should see an error message")
    public void errormessage() {
        System.out.println("I should see an error message.");
    }
}
