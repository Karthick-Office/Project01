package com.testng.selenium.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testng.selenium.base.TestBase;
import com.testng.selenium.pages.HomePage;
import com.testng.selenium.pages.RegisterPage;
import com.testng.selenium.utilities.XlsDataProvider;

public class RegisterTest extends TestBase {
	    HomePage hp;
	    RegisterPage rp;
		@BeforeMethod
		public void OpenApp() throws Exception
		{
			OpenBrowser("Edge");
			hp = new HomePage(driver);
			rp = new RegisterPage(driver);
		}
		
		
		@AfterMethod
		public void CloseApp()
		{
			driver.quit();
		}
		
		
		@Test(priority='1', dataProvider="testdata")
		public void testregisterUser(String name,String lname,String email,String ph,String password,String cpasswd) throws InterruptedException
		{
			hp.clickonmyAccount();
			hp.clickonRegister();
			rp.regirsteruser(name,lname,email,ph,password,cpasswd);
		}
		
		@DataProvider(name="testdata")
		public Object[][] datasupplier() throws Exception
		{
			Object[] [] input = XlsDataProvider.getTestData("Sheet1");
			return input;
			
		}
			

	}