/**
 * CalculatorTestDrive.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

/**
 * This class is designed to test calculator functionality by creating a
 * functional instance (composed of a controller which takes a model and creates
 * a view)
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public class CalculatorTestDrive {

  /**
   * @param args
   */
  public static void main(String[] args) {
    CalculatorModelInterface model = new CalculatorModel();
    CalculatorControllerInterface controller = new CalculatorController(model);
  }

}
