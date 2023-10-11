package com.testng.selenium.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testng.selenium.base.TestBase;
import com.testng.selenium.pages.HomePage;
import com.testng.selenium.utilities.XlsDataProvider;

public class HomeTest extends TestBase {
    HomePage hp ;
	@BeforeClass
	public void OpenApp() throws Exception
	{
		OpenBrowser("chrome");
		hp = new HomePage(driver);
	}
	@Test
	public void testTitle()
	{
		hp.gettitle();
	}

	@Test()
	public void Search() throws InterruptedException
	{
		hp.setlocation();
    }
	
	
	
	@AfterClass
	public void CloseApp()
	{
		driver.quit();
	}
	

}