package com.testng.selenium.base;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class TestBase {
public static WebDriver driver;
public static ExtentReports extentreports;
public static ExtentTest extentTest;
	
public static void  OpenBrowser(String browser) throws Exception
{

driver=(browser=="Chrome")? new ChromeDriver():(browser=="Firefox")? new FirefoxDriver():new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get("https://www.redbus.in");

	
}

@BeforeTest
public void getnameMethod(ITestContext context)
{
	extentTest=	extentreports.createTest(context.getName());
}

@BeforeSuite
public void InitalizeExtentReport()
{
	ExtentSparkReporter sparkreporter = new ExtentSparkReporter("Report.html");
	extentreports = new ExtentReports();
	extentreports.attachReporter(sparkreporter);
	extentreports.setSystemInfo("OS", System.getProperty("os.name"));
	extentreports.setSystemInfo("JAVA", System.getProperty("java.version"));
	
}

@AfterSuite
public void generateReports() throws Exception
{
	extentreports.flush();
	Desktop.getDesktop().browse(new File("Report.html").toURI());
}


@AfterMethod
public void generateTestStatus(Method m,ITestResult result)
{
	if(result.getStatus() == ITestResult.FAILURE )
	{
		System.out.println("Capture Screenshot");
		extentTest.fail(result.getThrowable());
	}
	else if (result.getStatus() == ITestResult.SUCCESS) {
		extentTest.pass(m.getName() + " is passed");
	}
}

}