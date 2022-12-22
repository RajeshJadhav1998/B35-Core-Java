package org.tnsindia.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
		System.setProperty("Rajesh","Jadhav");
		
		//Execute the body when the positive condition else test will be skipped
		Assumptions.assumeTrue("Jadhav".equals(System.getProperty("Rajesh")));
	}
	
	@Test
	void display() {
		System.setProperty("Rajesh","Jadhav");
		
		//Execute the body when the negative condition else test will be skipped
		Assumptions.assumeFalse("Adi".equals(System.getProperty("Rajesh")));
	}

	@Test
	void print() {
		System.setProperty("Rajesh","Jadhav");
		
		
		Assumptions.assumingThat("".equals(System.getProperty("Rajesh")), null);
	}
	
}
