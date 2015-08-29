package com.goldenratio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.goldenratio.proof.Main;

/**
 * 
 * @author Patrick Culligan
 *
 */

public class AreNotEqualTest {

	@Test
	public void test() {
		Main test = new Main();

		int input = test.runProgram(Main.index);

		assertNotEquals(26, input);
	}

}
