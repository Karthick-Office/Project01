package pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    @FindBy(id = "small-searchterms")
    private WebElement searchInput;

    @FindBy(xpath = "//input[@value = 'Search']")
    private WebElement searchButton;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterSearchTerm(String searchTerm) {
        searchInput.click();
        searchInput.clear();
        searchInput.sendKeys(searchTerm);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void performSearch(String searchTerm) {
        enterSearchTerm(searchTerm);
        clickSearchButton();
    }
}
