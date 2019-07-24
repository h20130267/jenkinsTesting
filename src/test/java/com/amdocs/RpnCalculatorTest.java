package com.amdocs;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RpnCalculatorTest{ 
	@Test
	public void addition() {
		RpnCalculator calculator = new RpnCalculator("3 3 +");
		double actual = calculator.calculateExpression();
		double expected = 6;
		assertEquals(expected, actual, 0.001);
		
		calculator.postfixExpression = "4 4 +";
		actual = calculator.calculateExpression();
		expected = 8;
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	public void subtraction() {
		RpnCalculator calculator = new RpnCalculator("6 3 -");
		double actual = calculator.calculateExpression();
		double expected = 3;
		assertEquals(expected, actual, 0.001);
		
		calculator.postfixExpression = "12 4 -";
		actual = calculator.calculateExpression();
		expected = 8;
		assertEquals(expected, actual, 0.001);
		
	}
	
	@Test
	public void multiplication() {
		RpnCalculator calculator = new RpnCalculator("6 3 *");
		double actual = calculator.calculateExpression();
		double expected = 18;
		assertEquals(expected, actual, 0.001);
		
		calculator.postfixExpression = "12 4 *";
		actual = calculator.calculateExpression();
		expected = 47;
		assertEquals(expected, actual, 1);
		
	}
	
	@Test
	public void division() {
		RpnCalculator calculator = new RpnCalculator("6 3 /");
		double actual = calculator.calculateExpression();
		double expected = 2;
		assertEquals(expected, actual, 0.001);
		
		calculator.postfixExpression = "12 4 /";
		actual = calculator.calculateExpression();
		expected = 3;
		assertEquals(expected, actual, 1);
		
	}
	
	@Test
	public void assorted() {
		RpnCalculator calculator = new RpnCalculator("3 2 + 9 6 - 14 7 / + -");
		double actual = calculator.calculateExpression();
		double expected = 0;
		assertEquals(expected, actual, 0.001);
		
	}
}
