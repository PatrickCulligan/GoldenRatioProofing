package com.goldenratio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.goldenratio.proof.Main;

/**
 * Patrick Culligan
 */

public class OutOfBoundsTest {

	@Test
	public void test() {
		
		/**
		 * Test fails because it is outside the parameters
		 * of the acceptable boundary
		 */
		Main test = new Main();

		int input = test.runProgram(Main.index);
		//
		assertEquals(26, input);
		
		
	}

	
}
