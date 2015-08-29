package com.goldenratio.proof;

/**
 * 
 * @author Patrick Culligan
 *
 */
public class Fibonnaci {

	/**
	 * Generates Fibonnacci sequence This is an iterative method for displaying
	 * a sequence of fibonacci numbers. This method proves to be more efficient
	 * in comparison to the recursive method outline in the lucas class
	 * 
	 * @param n
	 * @return n
	 */

	public int fibonacci(int n) {

		int a = 0;
		int b = 1;

		for (int i = -1; i < n; i++) {
			int temp = a;
			a = b;
			b = temp + b;
		}
		return a;
	}

}
