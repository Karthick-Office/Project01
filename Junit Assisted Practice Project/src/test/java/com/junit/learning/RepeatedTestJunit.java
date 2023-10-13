package com.junit.learning;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestJunit {

	@RepeatedTest(4)
	@DisplayName("Repated Mode")
    public void method1(){
		System.out.println("Hello Method1");
	}
}
