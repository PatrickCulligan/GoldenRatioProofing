package com.goldenratio.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.goldenratio.proof.Main;


/**
 * 
 * @author Patrick Culligan
 *
 */
public class NullTest {

	@Test
	public void test() {
		Main test = new Main();

		int output = test.runProgram(Main.index);

		
		assertNotNull(output);
	}

}
