package com.goldenratio.proof;

/**
 * 
 * @author Patrick Culligan
 */

public class Main {

	/**
	 * static variable to manage number of times sequences executes
	 */
	public static int index = 0;

	public static void main(String[] args) {

		/**
		 * Prints message to users in console
		 */
		System.out
				.println("Proof that Lucas numbers come closer to the Golden ratio than Fibonacci numbers:");
		System.out.println("Fibonacci Lucas   phi");
		/**
		 * Executes runProgram method
		 */

		Main.runProgram(index);

	}

	/**
	 * Method that instantiates the facade class and run the program 25 times
	 * 
	 * @param n
	 * @return n
	 */
	public static int runProgram(int n) {
		/**
		 * create instance of the facade class
		 */
		Facade facade = new Facade();
		// set a loop to run the program 25 times
		while (n < 25) {

			/**
			 * access interface method implemented in the facade class with
			 * facade handle
			 */
			facade.sequenceGenerator(n);

			// increment variable by one on each iteration

			n++;

		}
		return n;
	}

}
