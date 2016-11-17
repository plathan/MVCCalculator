/**
 * CalculatorObservable.java 1.0 Nov 17, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

/**
 * This interface is implemented by the model so that it will notify the
 * observer (view) when it changes.
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public interface CalculatorObservable {
  /**
   * This method will be called to notify observers and activate the
   * updateInputField() method.
   */
  public void notifyCalculatorObservers();
}
