package com.junit.learning;

import org.junit.jupiter.api.*;


public class BeforeAfterEachAnnotation {
	
   @BeforeEach
	public void init(){
		System.out.println("\nStart DB Connetion");
	}
	
   @AfterEach
  	public void end(){
  		System.out.println("End DB Connetion\n");
  	}
  	
	@Test
    public void method1(){
		System.out.println("Hello Method1");
	}
	@Test
    public void method2(){
		System.out.println("Hello Method2");
	}
	
	@Test
    public void method3(){
		System.out.println("Hello Method3");
	}
	
}
