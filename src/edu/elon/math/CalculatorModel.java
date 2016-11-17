/**
 * CalculatorModel.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

import java.util.ArrayList;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Models ...
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public class CalculatorModel implements CalculatorModelInterface {
  String inputString = "";
  ArrayList<CalculatorObserver> calculatorObservers = new ArrayList<CalculatorObserver>();
  ScriptEngine engine = (new ScriptEngineManager())
      .getEngineByName("JavaScript");

  @Override
  public void evaluate(String inputString) {
    try {
      this.inputString = engine.eval(inputString).toString();
    } catch (ScriptException e) {
      // Strings with repeating operands or beginning or ending with operands
      System.out.println("Invalid string entered.");
    }
    // Notify view that input value has been updated
    notifyCalculatorObservers();
  }

  @Override
  public void setInput(String inputString) {
    this.inputString = inputString;
    // Notify view that input value has been updated
    notifyCalculatorObservers();
  }

  @Override
  public String getInput() {
    return inputString;
  }

  /**
   * This method is called when the value of inputString has been changed. It
   * tells the view to update and reflect the change.
   */
  public void notifyCalculatorObservers() {
    // There is only one observer in this example
    for (CalculatorObserver calculatorObserver : calculatorObservers) {
      calculatorObserver.updateInputField();
    }

  }

  @Override
  public void registerObserver(CalculatorObserver o) {
    calculatorObservers.add(o);
  }

  @Override
  public void removeObserver(CalculatorObserver o) {
    calculatorObservers.remove(o);
  }

}
