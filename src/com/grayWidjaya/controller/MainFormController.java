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
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Developer
 */
public class MainFormController implements Initializable {

    @FXML
    private Button btnA;
    @FXML
    private Button btnB;
    @FXML
    private Button btnC;
    @FXML
    private BorderPane borderPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void btnA(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormA.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageA = new Stage();

            stageA.setScene(scene);
            stageA.setTitle("Form A");
            stageA.initOwner(borderPane.getScene().getWindow());
            stageA.initModality(Modality.WINDOW_MODAL);
            stageA.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnB(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/FormB.fxml"));
            AnchorPane pane = loader.load();
            Scene scene = new Scene(pane);
            Stage stageB = new Stage();
            stageB.setScene(scene);

            stageB.setTitle("Form B");
            stageB.initOwner(borderPane.getScene().getWindow());
            stageB.initModality(Modality.WINDOW_MODAL);
            stageB.show();
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).
                    log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void btnC(ActionEvent event) {
    }

}
