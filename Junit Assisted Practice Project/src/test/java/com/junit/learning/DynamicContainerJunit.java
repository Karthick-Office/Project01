package com.junit.learning;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DynamicContainer;
import org.junit.jupiter.api.DynamicNode;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

public class DynamicContainerJunit {

    private List<String> ListInput() {
        return Arrays.asList("amma", "appa");
    }

    @TestFactory 
	Stream<DynamicNode> DC(){
		return ListInput().stream().map(input->
		DynamicContainer.dynamicContainer("Container For "+input,Stream.of(
				DynamicTest.dynamicTest(input, () -> Assertions.assertNotNull(input)),
				DynamicContainer.dynamicContainer("properties test", Stream.of(		
						DynamicTest.dynamicTest("length > 0", () -> Assertions.assertTrue(input.length() > 0)),	
						DynamicTest.dynamicTest("not empty", () -> Assertions.assertFalse(input.isEmpty()))
						
						))
				
				
				)));
	}
}
