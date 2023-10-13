package com.junit.learning;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class DisplayNameOrderAnnotation {
	

	@BeforeEach
	public void init(){
		System.out.println("\nStart DB Connetion");
	}
	
   @AfterEach
  	public void end(){
  		System.out.println("End DB Connetion\n");
  	}
  	
    @Order(2)
	@DisplayName("Second")
	@Test
    public void method1(){
		System.out.println("Hello Method1");
	}
    @Order(3)
	@DisplayName("Thired")
	@Test
    public void method2(){
		System.out.println("Hello Method2");
	}
    @Order(1)
	@DisplayName("First")
	@Test
    public void method3(){
		System.out.println("Hello Method3");
	}
	
}
