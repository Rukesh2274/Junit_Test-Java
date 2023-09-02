package com.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	/*
	@Before
	public void beforeAll()
	{
		System.out.println("Before All");
	}

	@Test
	public void additionTest() {
		Calculator c = new Calculator();
		assertEquals(30,c.addition(10, 20));
	
	}
	
	@Ignore
	@Test
	public void additionTest1() {
		Calculator c = new Calculator();
		assertEquals(-9,c.addition(-30, 21));

	}
	
	@AfterClass
	public static void afterAll()    // AfterClass should be static
	{
		System.out.println("After all the test case functions");
	}
	
	*/
	
	@Test
	private void multiplyTest() {
		Calculator c = new Calculator();
		
		System.out.println("Test even or odd");
		
		assertFalse(c.multiply(1,5));
		assertTrue(c.multiply(11,2));
		
		assertEquals(false,c.multiply(1,5));
		
		// assertNotNull(c);
		// assertNull(c);

	}

}
