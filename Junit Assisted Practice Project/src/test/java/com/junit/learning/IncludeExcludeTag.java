package com.junit.learning;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.runner.RunWith;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.runner.JUnitPlatform;

@SuppressWarnings("deprecation")
@RunWith(JUnitPlatform.class)
@SelectClasses({com.junit.learning.IncludeExcludeTag.class})

@IncludeTags({"prod"})
@ExcludeTags({"devlop"})
public class IncludeExcludeTag {

	@Test
	@Tag("devlop")
	public void devtest1()
	{
		System.out.println("test Case development1");
	}
	
	@Test
	@Tag("devlop")
	public void devTest2()
	{
		System.out.println("test Case development 2");
	}
	
	
	@Test
	@Tag("Qa")
	public void qatest1()
	{
		System.out.println("test Case QA 1");
	}
	
	
@Test
@Tag("Qa")
	public void qatest2()
	{
		System.out.println("test Case QA 2");
	}


@Test
@Tag("prod")
public void prodTest1()
{
	System.out.println("test Case Production 1");
}


@Test
@Tag("prod")
public void prodtest2()
{
	System.out.println("test Case Production 2");
}

}