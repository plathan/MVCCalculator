/**
 * CalculatorModeInterface.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

/**
 * Model for the calculator application. Orders are passed here from the
 * controller and actual calculations are performed, as well as getting and
 * setting the inputString and notifying the view.
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public interface CalculatorModelInterface {
  /**
   * @param inputString
   *        Updates value of inputString
   */
  void setInput(String inputString);

  /**
   * @return current value of inputString
   */
  String getInput();

  /**
   * @param inputString
   *        Performs calculations on current value of inputString
   */
  void evaluate(String inputString);
}
