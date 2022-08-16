package com.example.opusreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SponsorController implements Initializable {
    @FXML
    ComboBox<String> stateCmbx;
    @FXML
    ComboBox<String> dietCmbx;
    @FXML
    TextField fNameTxt;
    @FXML
    TextField lNameTxt;
    @FXML
    TextField addyTxt;
    @FXML
    TextField cityTxt;
    @FXML
    TextField zipTxt;
    @FXML
    TextField phoneTxt;
    @FXML
    TextField emailTxt;
    @FXML
    TextField foodPrefTxt;
    @FXML
    TextField sponsorRepTxt;
    @FXML
    Button submitBtn;
    @FXML
    Label sponsorLbl;

    ObservableList<String> state = FXCollections.observableArrayList("AL","AK","AZ","AR","CA","CO","CT","DE","FL","GA","HI","ID","IL","IN","IA","KS","KY","LA","ME","MD","MA","MI","MN","MS","MO","MT","NE","NV","NH","NJ","NM","NY","NC","ND","OH","OR","PA","RI","SC","SD","TN","TX","UT","VT","VA","WA","WV","WI","WY");
    ObservableList<String> dietAnswer = FXCollections.observableArrayList("YES","NO");
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    stateCmbx.setItems(state);
    dietCmbx.setItems(dietAnswer);
    }

    public void onSubmitButtonClick(ActionEvent event) throws IOException {

        String fName = fNameTxt.getText();
        String lName = lNameTxt.getText();
        String addy = addyTxt.getText();
        String city = cityTxt.getText();
        String state = stateCmbx.getValue();
        String zip = zipTxt.getText();
        String phone = phoneTxt.getText();
        String email = emailTxt.getText();
        String foodPref = foodPrefTxt.getText();
        String type = sponsorLbl.getText();
        String welcomeReception = "N/A";
        String foodReqs = dietCmbx.getValue();
        String workRegion = "N/A";
        String shirtSize = "N/A";
        String sponsorRep = sponsorRepTxt.getText();

        DBRegistrant.addRegistrant(fName,lName,addy,city,state,zip,phone,email,foodPref,type,welcomeReception,shirtSize,foodReqs,sponsorRep,workRegion);


        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
