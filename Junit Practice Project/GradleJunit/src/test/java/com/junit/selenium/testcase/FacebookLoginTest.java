package com.junit.selenium.testcase;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.junit.selenium.base.TestBase;
import com.junit.selenium.pages.FacebookLoginPage;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FacebookLoginTest extends TestBase {
    private FacebookLoginPage loginPage;

    @BeforeAll
    public void setUp() throws Exception {
        OpenBrowser("Chrome", "https://www.facebook.com");
        loginPage = new FacebookLoginPage();
    }
    
	@ParameterizedTest(name = "User Login {arguments}")
	@CsvSource({
			"karthick1@gmail.com ,karthick@6117",
			"Gunasekaran2@gmail.com ,karthick@6112",
			"Sitheswaran3@gmail.com ,karthick@6114"		
	})
	@DisplayName("TestFacebookLogin")
    public void testFacebookLogin(String email,String password) throws InterruptedException {
        loginPage.enterEmail(email);
        loginPage.enterPassword("password");
        loginPage.clickLoginButton(); 
        Thread.sleep(1000);
        loginPage.clear();

    }

    @AfterAll
    public void tearDown() {
        driver.quit();
    }
}
