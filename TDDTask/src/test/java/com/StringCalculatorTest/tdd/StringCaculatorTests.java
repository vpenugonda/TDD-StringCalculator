package com.StringCalculatorTest.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCaculatorTests {

	/* input : "1,2,3" 
	 * Expected Output:RunTimeException
	@Test(expected=RuntimeException.class)
	public void sumOfThreeNumbers() {
		//assertEquals(RuntimeException.class, StringCalculator.add("1,2,3"));
		StringCalculator.add("1,2,3");
		assertTrue(true);
	}	
	*/
	
	/* input : "1,2" 
	 * Expected Output:RunTimeException*/
	@Test
	public void sumOfTwoNumbers() {
		assertEquals(3, StringCalculator.add("1,2"));
	}

	/* input : "1,S" 
	 * Expected Output:Exception*/
	@Test(expected=RuntimeException.class)
	public void sumOfNumberAndLiteral() {
		StringCalculator.add("1,S");
		assertTrue(true);
	}
	/* input : "3" 
	 * Expected Output:Exception*/
	@Test
	public void sumOfSingleNumber() {
		assertEquals(3, StringCalculator.add("3"));
	}
	
	/* Start with the simplest test case of an empty string and move to 1 and two numbers*/
	@Test
	public void EmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}
	
	//Allow the Add method to handle an unknown amount of numbers
	/*Input : 5,7,6,2,7,6,2
	 * ExpectedOutput:35 
	 */
	@Test
	public void HandlingUnknowAmoutOfNumbers() {
		assertEquals(35, StringCalculator.add("5,7,6,2,7,6,2"));
	}
	
	/* input : "1,2,3,5,6,7,Y,8,9" 
	 * Expected Output:RunTimeException*/
	@Test(expected=RuntimeException.class)
	public void HandlingUnknownAmountOfNumbersWithIllegalLiteral() {
		assertEquals(RuntimeException.class, StringCalculator.add("1,2,3,5,6,7,Y,8,9"));
		
	}

}
