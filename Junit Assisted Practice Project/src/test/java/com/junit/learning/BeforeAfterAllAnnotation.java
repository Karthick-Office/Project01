package com.junit.learning;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BeforeAfterAllAnnotation {
	   @BeforeAll
		public void init(){
			System.out.println("\nStart DB Connetion");
		}
		
	   @AfterAll
	  	public void end(){
	  		System.out.println("End DB Connetion\n");
	  	}
	   
//	   @BeforeAll
//			public static void init(){
//				System.out.println("\nStart DB Connetion");
//			}
//			
//		   @AfterAll
//		  	public static void end(){
//		  		System.out.println("End DB Connetion\n");
//		  	}
//		  	
	  	
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
