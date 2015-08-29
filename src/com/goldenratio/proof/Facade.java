package com.goldenratio.proof;

/**
 * 
 * @author Patrick Culligan
 *
 *         The facade class is used to create a simplified interface for
 *         multiple objects. Additionally, an interface has been implemented in
 *         the class
 */

public class Facade implements INumberSequence {

	/**
	 * create an instance of the classes
	 */
	private Fibonnaci fn = new Fibonnaci();
	private Lucas ln = new Lucas();
	private GoldenRatio gr = new GoldenRatio();

	/**
	 * Method that can access the sequence generators methods of the
	 * instantiated classes
	 */
	public void sequenceGenerator(int n) {

		System.out.println(fn.fibonacci(n) + "         " + ln.lucas(n)
				+ "        " + gr.goldenRation(n));

	}

}
