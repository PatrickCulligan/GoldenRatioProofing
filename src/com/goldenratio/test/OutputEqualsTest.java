package com.goldenratio.test;

import com.goldenratio.proof.Main;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 * @author Patrick Culligan
 *
 */

public class OutputEqualsTest {
	/**
	 * Test that program executes times
	 */
	@Test
	public void test() {

		Main test = new Main();

		int output = test.runProgram(Main.index);

		assertEquals(25, output);
	}

}
