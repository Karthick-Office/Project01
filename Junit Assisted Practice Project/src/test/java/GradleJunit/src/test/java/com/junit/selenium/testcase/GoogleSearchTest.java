package com.junit.selenium.testcase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.junit.selenium.base.TestBase;
import com.junit.selenium.pages.GoogleSearchPage;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class GoogleSearchTest extends TestBase {
    private GoogleSearchPage searchPage;

    @BeforeAll
    public void setUp() throws Exception {
        OpenBrowser("Chrome", "https://www.google.com");
        searchPage = new GoogleSearchPage();
    }

    @ParameterizedTest(name = "Search This In Google Search {arguments}")
    @ValueSource(strings = {"Karthick", "Learning"})
    @DisplayName("Search This In Google")
    public void testGoogleSearch(String searchQuery) throws InterruptedException {
        searchPage.enterSearchText(searchQuery);
        searchPage.submitSearch();
        String pageTitle = driver.getTitle();
        Assertions.assertTrue(pageTitle.contains(searchQuery), "Search query not found in page title");
        Thread.sleep(1000);
    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}
