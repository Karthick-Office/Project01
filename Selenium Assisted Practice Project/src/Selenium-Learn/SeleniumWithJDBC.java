package Seleniumdemo;

import java.sql.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWithJDBC {

	public static void main(String[] args) throws Exception {
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Learn","Karthick","611718104023");
	Statement stmt =con.createStatement();
	ResultSet rs=stmt.executeQuery("SELECT * FROM Products");
    while (rs.next()) {
        int productId = rs.getInt(1);
        String productName = rs.getString(2);
        Thread.sleep(1000);
        WebDriver driver=new ChromeDriver();
    	driver.manage().deleteAllCookies();
    	driver.manage().window().maximize();
    	Thread.sleep(1000);
        driver.get("https://the-internet.herokuapp.com/inputs");
        Thread.sleep(1000);
        WebElement usernameInput = driver.findElement(By.xpath("//input[@type='number']"));
        usernameInput.sendKeys(productName);
        break;
     
    }

	
	

	
	con.close();	
	}

}
