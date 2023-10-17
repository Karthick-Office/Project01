package com.junit.selenium.base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
public static WebDriver driver;
	
public static void  OpenBrowser(String browser,String url) throws Exception
{
driver=(browser=="Chrome")? new ChromeDriver():(browser=="Firefox")? new FirefoxDriver():new EdgeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.get(url);
}
}


