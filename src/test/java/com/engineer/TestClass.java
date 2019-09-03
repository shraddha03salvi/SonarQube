package com.engineer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestClass {

	Calculation obj =new Calculation();
	
	@Test
	public void twoPlusTwoEquals() {
		assertEquals(4,obj.adder(2,2));
		
	}
}
