package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class LoginPage extends BaseTest {
	@FindBy(xpath="//li[2]/a")
	private WebElement login;
	
    @FindBy(id = "Email")
    private WebElement emailInput;

    @FindBy(id = "Password")
    private WebElement passwordInput;

    @FindBy(id = "RememberMe")
    private WebElement rememberMeCheckbox;

    @FindBy(css = "input[value='Log in']")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }

    public void login(String email, String password) {
    	login.click();
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        rememberMeCheckbox.click();
        loginButton.click();
    }

    
}
