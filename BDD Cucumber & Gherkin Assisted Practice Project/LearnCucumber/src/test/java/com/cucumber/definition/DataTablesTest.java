package com.cucumber.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTablesTest {
	
WebDriver driver;
	
	@Given("I am on rediff page")
	public void I_am_on_RediffPage()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	

	//| FullName | EmailID | Password | retype | alternate | phone |
	
	@Then("User Enters the folliwng registration details")
	public void User_Enters_the_folliwng_registration_details(DataTable dataTable)
	{
	List<Map<String,String>> userList = dataTable.asMaps(String.class,String.class);
	
	for(Map<String,String> e: userList)
	{
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[1]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[1]")).sendKeys(e.get("FullName"));
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[2]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[2]")).sendKeys(e.get("EmailID"));
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[4]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[4]")).sendKeys(e.get("Password"));
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[5]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[5]")).sendKeys(e.get("retype"));
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[6]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[6]")).sendKeys(e.get("alternate"));
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[13]")).clear();
		driver.findElement(By.xpath("//div[@id='wrapper']/descendant::input[13]")).sendKeys(e.get("phone"));
	}
		driver.close();
	}

}
