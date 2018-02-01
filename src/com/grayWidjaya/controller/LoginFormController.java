/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grayWidjaya.controller;

import com.grayWidjaya.MainApp;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Developer
 */
public class LoginFormController implements Initializable {

    @FXML
    private TextField txtUsername;
    @FXML
    private TextField txtPassword;
    @FXML
    private Button btnLogin;
    @FXML
    private AnchorPane anchorPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnLogin(ActionEvent event) {
        if (txtUsername.getText().trim().isEmpty() && txtPassword.getText().
                trim().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Please fill all field");
            alert.showAndWait();
//            System.out.println("Masih Kosong");
        } else if (txtUsername.getText().equals("1572044") && txtPassword.
                getText().equals("gray")) {
            try {
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(MainApp.class.getResource(
                        "view/MainForm.fxml"));
                BorderPane pane = loader.load();
                Scene scene = new Scene(pane);

                Stage secondStage = new Stage();
                secondStage.setScene(scene);
                secondStage.setTitle("Main Form");
                secondStage.show();
                anchorPane.getScene().getWindow().hide();

            } catch (IOException ex) {
                Logger.getLogger(LoginFormController.class.getName()).
                        log(Level.SEVERE, null, ex);
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Invalid Username and Password");
            alert.showAndWait();

        }
        txtPassword.clear();
        txtUsername.clear();
    }

}
