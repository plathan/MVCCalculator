/**
 * CalculatorController.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

import java.util.regex.Pattern;

/**
 * Controller for the calculator application. This takes orders from the view
 * and dispatches them to the model.
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public class CalculatorController implements CalculatorControllerInterface {
  CalculatorModelInterface model;
  CalculatorView view;

  /**
   * @param model
   */
  public CalculatorController(CalculatorModelInterface model) {
    this.model = model;
    // Create the view
    view = new CalculatorView(this, model);
    view.createView();
  }

  @Override
  public void evaluate(String inputString) {
    model.evaluate(inputString);
  }

  @Override
  public void addInput(String inputString) {
    String tempString = (model.getInput() + inputString);
    // Error check for multiple decimals in one number
    if (Pattern.matches(".*\\.\\d*\\..*", tempString)) {
      System.out.println("Too many decimals.");
    } else {
      model.setInput(tempString);
    }
  }

}
