package com.TestNg.TDD;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Simplilearn {
	    
	private Map<String, Integer> GetCourseList() {
	WebDriver driver;
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.simplilearn.com");
	WebElement courseList = driver.findElement(By.className("c_list"));
    List<WebElement> courseItems = courseList.findElements(By.className("c_list_item"));
	
	Map<String, Integer> courseMap = new HashMap<>();
	 for (WebElement courseItem : courseItems) {
         WebElement courseLink = courseItem.findElement(By.className("master-card"));
         String courseTitle = courseLink.getAttribute("title");
         WebElement courseInfo = courseItem.findElement(By.className("info"));
         String courseDuration = courseInfo.findElements(By.tagName("span")).get(0).getText();
         int numberOfCourses = Integer.parseInt(courseInfo.findElements(By.tagName("span")).get(1).getText().replaceAll("[^0-9]", ""));
         courseMap.put(courseTitle, numberOfCourses);
     }
     driver.close();
	return courseMap;
	 
}
public int 	GetCourse(String course) {
	
	Map<String, Integer> courseMap = null ;
	int count =0;
	
	if(course.isEmpty())
	{
		throw new NullPointerException("course name cannot be empty");
	}
	courseMap = GetCourseList();
	
	if(!courseMap.containsKey(course))
	{
		throw new NullPointerException("course doesnot exist");
	}
	else {
	count = courseMap.get(course);
	}
	return count;
	
}

}
