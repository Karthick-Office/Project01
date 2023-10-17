package com.junit.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.junit.selenium.base.TestBase;

public class FacebookLoginPage extends TestBase {
	    public void enterEmail(String email) {
	        WebElement emailInput = driver.findElement(By.id("email"));
	        emailInput.sendKeys(email);
	    }

	    public void enterPassword(String password) {
	        WebElement passwordInput = driver.findElement(By.id("pass"));
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        WebElement loginButton = driver.findElement(By.name("login"));
	        loginButton.click();
	    }
	    public void clear() {
	    	driver.findElement(By.id("email")).clear();
	    	driver.findElement(By.id("pass")).clear();
	    }
	}
