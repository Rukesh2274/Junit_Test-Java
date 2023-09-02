package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest2 {
	Calculator n = new Calculator();


	@SuppressWarnings("deprecation")
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void averagetest() {
		
		assertEquals((double)3.0,n.average(new int[] {1,2,3,4,5}));
		
	}

}
