/**
 * ControllerInterface.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

/**
 * Models ...
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public interface CalculatorControllerInterface {

  /**
   * @param inputString
   * 
   *        addInput adds a string entered by the user to the existing
   *        inputString rather than replacing it
   */
  void addInput(String inputString);

  /**
   * @param inputString
   * 
   *        evaluate performs calculations on the current inputString and sets
   *        inputString to the resulting double
   */
  void evaluate(String inputString);
}
