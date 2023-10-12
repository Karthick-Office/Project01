package com.TestNg.TDD;
import org.testng.Assert;
import org.testng.annotations.Test;
public class TestSimplilearn {


	@Test
	public void findcourse()
	{
		
		String course = "Cloud Architect";
		int ExpectedNoC = 11;
		Simplilearn sl = new Simplilearn();
		int count = sl.GetCourse(course);
		System.out.println(count);
		Assert.assertEquals(count,ExpectedNoC );
		
	}
	
	@Test
	public void findEmptyInput()
	{
		try {
			String course = "";
			int ExpectedNoC = 12;
			Simplilearn sl = new Simplilearn();
			int count = sl.GetCourse(course);
		}
		
		catch(NullPointerException e)
		{
			System.out.println("course name cannot be empty");
		}
		
		
		
	}
	
	@Test
	public void findInvalidInput()
	{
		try {
			String course = "Cloud ";
			int ExpectedNoC = 11;
			Simplilearn sl = new Simplilearn();
			int count = sl.GetCourse(course);
		}
		
		
		catch(NullPointerException e1)
		{
			System.out.println("course name doesnot exisit in the list");
		}
				
	}

	
}
