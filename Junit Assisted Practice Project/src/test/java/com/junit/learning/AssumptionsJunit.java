package com.junit.learning;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsJunit {
  @Test
	public void AsumptionsTest() {
		boolean serverconnect=true;
		Assumptions.assumeTrue(serverconnect, "Server Not Connect");

		System.out.println("Create tables and inster data");
	}
}
