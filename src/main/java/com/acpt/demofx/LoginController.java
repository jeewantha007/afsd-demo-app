package com.acpt.demofx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtPassword;

    @FXML
    void login(ActionEvent event) {
        String dbEmail = "jeewa";
        String dbPassword = "123";

        String email = txtEmail.getText();
        String password = txtPassword.getText();
        if (email.isEmpty() || password.isEmpty()) {
            System.out.println("Email and Password are empty");
        }

        if (email.equals(dbEmail) && password.equals(dbPassword)) {
            System.out.println("Login successful");
            System.out.println("successful");

        }else {

            System.out.println("Login failed");
        }


        System.out.println(email);

    }

}
