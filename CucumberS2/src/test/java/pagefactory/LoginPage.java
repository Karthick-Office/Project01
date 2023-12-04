package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[text() = 'Log in']")
    private WebElement loginButton;

    @FindBy(xpath = "//label[text() = 'Email:']/following-sibling::input")
    private WebElement emailInput;

    @FindBy(xpath = "//label[text() = 'Password:']/following-sibling::input")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@value = 'Log in']")
    private WebElement submitButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public void enterEmail(String email) {
        emailInput.click();
        emailInput.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordInput.click();
        passwordInput.sendKeys(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }
}
