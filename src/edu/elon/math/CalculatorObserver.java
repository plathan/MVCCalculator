/**
 * CalculatorObserver.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

/**
 * This interface is implemented by the view so that it will be notified when
 * the model changes.
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public interface CalculatorObserver {
  /**
   * This action will be taken when the view is notified of a change. In this
   * application, the view will update the input field based on an updated value
   * of inputString.
   */
  void updateInputField();
}
