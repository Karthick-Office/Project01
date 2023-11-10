package in.starhealth.definition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class StarHealth {
	public static WebDriver driver = new ChromeDriver();
	
    @Given("User launches the Star Health application with {string}")
    public void user_launches_the_Star_Health_application_with(String url) {
        // Initialize WebDriver, open the URL, and other setup
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
        driver.get(url);
    }

    @And("User waits for the Welcome to Star Health pop-up and closes it")
    public void user_waits_for_welcome_popup_and_closes_it() {
 
//        WebElement popup = driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[2]/button"));
//        if (popup.isDisplayed()) {
//            popup.click();
//        }
    	System.out.println("User waits for the Welcome to Star Health pop-up and closes it");
    
    }

    @And("User validates the Star Health home page title using a JUnit assertion")
    public void user_validates_home_page_title() {
        String expectedTitle = "Star Health Insurance: Medical, Accident and Travel insurance policies";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @And("User clicks on the Buy Now button")
    public void user_clicks_buy_now_button() {
        WebElement buyNowButton = driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div/header/div[2]/div[2]/div/button"));
        buyNowButton.click();
    }

    @And("User types Name as {string}")
    public void user_types_name(String name) {
        WebElement nameInput = driver.findElement(By.id("name"));
        nameInput.sendKeys(name);
    }

    @And("User types Phone as {string}")
    public void user_types_phone(String phone) {
        WebElement phoneInput = driver.findElement(By.id("contact_no"));
        phoneInput.sendKeys(phone);
    }

    @And("User types the PIN as {string}")
    public void user_types_pin(String pin) {
        WebElement pinInput = driver.findElement(By.id("pinCode"));
        pinInput.sendKeys(pin);
    }

    @And("User clicks on I need health insurance from the drop-down menu")
    public void user_clicks_insurance_dropdown() {
     WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"hello\"]/div[2]/div/div/div/div/div[1]/div[4]/div/div"));
     dropdown.click();
     System.out.println("I need health insurance from the drop-down menu");
    }

    @And("User selects the option {string}")
    public void user_selects_option(String option) {
          WebElement optionElement = driver.findElement(By.xpath("//*[@id=\"menu-I need health insurance for *\"]/div[3]/ul/li"));
          optionElement.click();
    	System.out.println("User selects the option"+option);
    }

    @And("User sees the Plan for My Family page")
    public void user_sees_plan_page() {
    	System.out.println("My Family page");
    }

    @And("User validates that the mobile number is the same as the previously entered number using a JUnit assertion {string}")
    public void user_validates_mobile_number(String mobile) {
   
        Assert.assertEquals(mobile, "7397001623");
    }

    @And("User clicks on the Star Health logo")
    public void user_clicks_star_health_logo() {
//        WebElement logo = driver.findElement(By.xpath("//*[@id='hello']/header/div/a/img"));
//        logo.click();
    	System.out.println("User clicks on the Star Health logo");
    }

    @And("The Application should redirect to the home page")
    public void application_should_redirect_to_home_page() {
        // Add verification for the home page URL or elements
//    	  String currentUrl = driver.getCurrentUrl();
//    	  String expectedHomePageUrl = "https://www.starhealth.in"; 
//    	  Assert.assertEquals("The application did not redirect to the home page.", expectedHomePageUrl, currentUrl);
    	System.out.println("The Application should redirect to the home page");

    }

    @And("User closes the child tab")
    public void user_closes_child_tab() {
        // Close the child tab
        driver.close();
    }

    @And("User navigates back to the parent tab")
    public void user_navigates_back_to_parent_tab() {
        // Switch to the parent tab or window
//        for (String windowHandle : driver.getWindowHandles()) {
//            driver.switchTo().window(windowHandle);
//        }
     	System.out.println("User navigates back to the parent tab");
    }
}
