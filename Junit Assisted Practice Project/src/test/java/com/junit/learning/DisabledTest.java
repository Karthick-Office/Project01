package com.junit.learning;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled("Checking Process On Going")
public class DisabledTest {
	
	   @BeforeEach
		public void init(){
			System.out.println("\nStart DB Connetion");
		}
		
	   @AfterEach
	  	public void end(){
	  		System.out.println("End DB Connetion\n");
	  	}
	   
	    @Disabled("Checking Process On Going")
		@Test
	    public void method1(){
			System.out.println("Hello Method1");
		}
		
		@Disabled("Checking Process On Going")
		@Test
	    public void method2(){
			System.out.println("Hello Method2");
		}
		
		@Test
	    public void method3(){
			System.out.println("Hello Method3");
		}
		
	}

