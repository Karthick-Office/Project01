package com.junit.learning;

import java.util.stream.Stream;
import org.junit.jupiter.api.*;


public class DynamicTestJunit {
	
	public static boolean isPalindrome(String inputText){
        int i = inputText.length()-1;
        int j=0;
        while(i > j) {
            if(inputText.charAt(i) != inputText.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }	
	
	
	@TestFactory
	public Stream<DynamicTest> dynamicTestsforPalindrome() 
	{
		return Stream.of("amma","appa").map(inputText ->
		
		DynamicTest.dynamicTest(inputText,() -> Assertions.assertTrue(isPalindrome(inputText))));
		
		
	}

}