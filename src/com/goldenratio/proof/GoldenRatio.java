package com.goldenratio.proof;

/**
 * 
 * @author Patrick Culligan
 *
 */
public class GoldenRatio {

	/**
	 * Declare variable to store phi value
	 */
	double phi = 1.618;

	/**
	 * Method generates the golden ratio
	 * 
	 * @param n
	 * @return round
	 */
	public int goldenRation(int n) {

		double powPhi = Math.pow(phi, n);

		int round = (int) Math.round(powPhi);

		return round;
	}

}
