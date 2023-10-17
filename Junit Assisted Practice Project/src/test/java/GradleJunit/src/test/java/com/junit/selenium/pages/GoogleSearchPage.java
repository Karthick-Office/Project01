package com.junit.selenium.pages;

import com.junit.selenium.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GoogleSearchPage extends TestBase {
    public void enterSearchText(String searchText) {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.sendKeys(searchText);
    }

    public void submitSearch() {
        WebElement searchInput = driver.findElement(By.name("q"));
        searchInput.submit();
    }
}
