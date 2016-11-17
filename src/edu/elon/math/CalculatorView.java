/**
 * CalculatorView.java 1.0 Nov 16, 2016
 *
 * Copyright (c) 2016 Patrick O. Lathan and Alex Zaterka
 * Campus Box 9139, Elon University, Elon, NC, 27244
 */
package edu.elon.math;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * Models ...
 * 
 * @author Patrick Lathan
 * @author Alex Zaterka
 */
public class CalculatorView implements ActionListener, CalculatorObserver {

  CalculatorModelInterface model;
  CalculatorControllerInterface controller;
  JFrame frame;
  TextField inputField;
  Panel numPadPanel;
  Button[] numPadArray;

  /**
   * @param controller
   * @param model
   */
  public CalculatorView(CalculatorControllerInterface controller,
      CalculatorModelInterface model) {
    this.controller = controller;
    this.model = model;
    model.registerObserver((CalculatorObserver) this);
  }

  @Override
  public void updateInputField() {
    inputField.setText(model.getInput());
  }

  /**
   * 
   */
  public void createView() {
    frame = new JFrame();
    frame.setLayout(new BorderLayout());
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    

    inputField = new TextField();
    inputField.setEditable(false);

    numPadPanel = new Panel();
    numPadPanel.setLayout(new GridLayout(4, 4));

    numPadArray = new Button[16];

    for (int i = 0; i < numPadArray.length; i++){
      numPadArray[i] = new Button();
    }
    
    numPadArray[0].setLabel("7");
    numPadArray[1].setLabel("8");
    numPadArray[2].setLabel("9");
    numPadArray[3].setLabel("/");

    numPadArray[4].setLabel("4");
    numPadArray[5].setLabel("5");
    numPadArray[6].setLabel("6");
    numPadArray[7].setLabel("*");

    numPadArray[8].setLabel("1");
    numPadArray[9].setLabel("2");
    numPadArray[10].setLabel("3");
    numPadArray[11].setLabel("-");

    numPadArray[12].setLabel("0");
    numPadArray[13].setLabel(".");
    numPadArray[14].setLabel("=");
    numPadArray[15].setLabel("+");

    // ITERATE OVER ARRAY
    for (Button currentButton : numPadArray) {
      currentButton.addActionListener(this);
      numPadPanel.add(currentButton, null);
    }

    frame.add(inputField, BorderLayout.NORTH);
    frame.add(numPadPanel);
    frame.pack();
    frame.setSize(new Dimension(250, 300));
    frame.setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent event) {
    if (event.getActionCommand() == "=") {
      controller.evaluate(inputField.getText());
    } else {
      controller.addInput(event.getActionCommand());
    }

  }

}
