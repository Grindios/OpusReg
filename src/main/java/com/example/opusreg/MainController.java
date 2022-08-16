package com.example.opusreg;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.JOptionPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private Label numLbl;
    int totalReg = DBRegistrant.getMaxRegistrant();

    @FXML
    protected void onHelloButtonClick(ActionEvent event) throws IOException {

        if (totalReg == 20){
            JOptionPane.showMessageDialog(null, "Sorry, attendance has reached it's max number of 20!");
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("employee-view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }

    }

    public void onAttendeeButtonClick(ActionEvent event) throws IOException{

        if (totalReg == 20){
            JOptionPane.showMessageDialog(null, "Sorry, attendance has reached it's max number of 20!");
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("attendee-view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void onSponsorButtonClick(ActionEvent event) throws IOException{
        if (totalReg == 20){
            JOptionPane.showMessageDialog(null, "Sorry, attendance has reached it's max number of 20!");
        }
        else {
            Parent root = FXMLLoader.load(getClass().getResource("attendee-view.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        numLbl.setText("Number of registrants so far is "+ totalReg +".");
    }
}