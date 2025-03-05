package com.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalController {


    @FXML
    private TextField txtNum1;

    @FXML
    private TextField txtNum2;

    double result;

    @FXML
    void divide(ActionEvent event) {
      double num1 = Double.parseDouble(txtNum1.getText());
      double num2 = Double.parseDouble(txtNum2.getText());

      result = num1 / num2;


    }

    @FXML
    void equals(ActionEvent event) {

        System.out.println(result);


    }

    @FXML
    void minus(ActionEvent event) {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        result = num1 - num2;

    }

    @FXML
    void multy(ActionEvent event) {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());
        result = num1 * num2;


    }

    @FXML
    void plus(ActionEvent event) {
        double num1 = Double.parseDouble(txtNum1.getText());
        double num2 = Double.parseDouble(txtNum2.getText());

        result = num1 + num2;

        System.out.println(result);
        System.out.println("hello");
        System.out.println("world");
        System.out.println("hiii");


    }

}
