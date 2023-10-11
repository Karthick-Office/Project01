package com.testng.selenium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.testng.selenium.base.TestBase;
import com.testng.selenium.pages.HomePage;

public class HomeTest extends TestBase {
    HomePage hp ;
	@BeforeClass
	public void OpenApp() throws Exception
	{
		OpenBrowser("Edge");
		hp = new HomePage(driver);
	}
	@Test
	public void testTitle()
	{
		hp.gettitle();
	}

	@AfterClass
	public void CloseApp()
	{
		driver.quit();
	}

}