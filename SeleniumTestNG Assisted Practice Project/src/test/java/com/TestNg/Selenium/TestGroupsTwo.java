package com.TestNg.Selenium;

import org.testng.annotations.Test;

public class TestGroupsTwo {

	@Test(priority='1',groups= {"smoke","functional","regression"})
	public void openapp()
	{
		System.out.println("Open the browser and open URL");
	}	
	@Test(priority='2',groups= {"functional"})
	public void loginHome()
	{
		System.out.println("login Home successfully");
	}
	
	@Test(priority='3',groups= {"regression"})
	public void loginwithInvaliddata()
	{
		System.out.println("login failed");
	}
	
	@Test(priority='4',groups= {"regression"})
	public void loginwithWrongpassword()
	{
		System.out.println("Wring password");
	}
}
