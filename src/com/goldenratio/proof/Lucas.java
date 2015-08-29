package com.goldenratio.proof;

/**
 * 
 * @author Patrick Culligan
 *
 */

public class Lucas {

	/**
	 * Method generates the Lucas number sequence The Lucas sequence is more
	 * closely aligned to phi than the fibonacci numbers. This is done using a
	 * recursive method with performs significantly poorer than its iterative
	 * counter part in the Fibonacci class
	 * 
	 * @param n
	 * @return n-1+n-2
	 */

	public int lucas(int n) {

		if (n == 0)

			return 2;

		else if (n == 1)

			return 1;

		else

			return lucas(n - 1) + lucas(n - 2);
	}

}
