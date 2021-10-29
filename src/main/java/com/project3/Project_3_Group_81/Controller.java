package com.project3.Project_3_Group_81;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML TextField studentName;
    @FXML RadioButton majorCS;
    @FXML RadioButton majorEE;
    @FXML RadioButton majorBA;
    @FXML RadioButton majorIT;
    @FXML RadioButton majorME;
    @FXML RadioButton addStudentButton;
    @FXML RadioButton removeStudentButton;
    @FXML RadioButton setStudyAbroadButton;
    @FXML RadioButton payTuitionButton;
    @FXML RadioButton calculateStudentTuitionButton;
    @FXML RadioButton setFinancialAidButton;
    @FXML RadioButton residentButton;
    @FXML RadioButton nonResidentButton;
    @FXML RadioButton triStateButton;
    @FXML RadioButton internationalButton;
    @FXML RadioButton newYorkButton;
    @FXML RadioButton connecticutButton;
    @FXML Label actionInputLabel;
    @FXML TextField actionInput;
    @FXML RadioButton studyAbroadYes;
    @FXML RadioButton studyAbroadNo;
    @FXML Button actionButton;
    @FXML HBox nonResidentHBox;
    @FXML AnchorPane triStatePane;
    @FXML AnchorPane studyAbroadPane;
    @FXML HBox studentTypeHbox;


//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }


    @FXML
    protected void initialize(){

        ToggleGroup majorToggleGroup = new ToggleGroup();
        majorCS.setToggleGroup(majorToggleGroup);
        majorBA.setToggleGroup(majorToggleGroup);
        majorEE.setToggleGroup(majorToggleGroup);
        majorIT.setToggleGroup(majorToggleGroup);
        majorME.setToggleGroup(majorToggleGroup);

        ToggleGroup actionToggleGroup = new ToggleGroup();
        addStudentButton.setToggleGroup(actionToggleGroup);
        removeStudentButton.setToggleGroup(actionToggleGroup);
        setStudyAbroadButton.setToggleGroup(actionToggleGroup);
        payTuitionButton.setToggleGroup(actionToggleGroup);
        calculateStudentTuitionButton.setToggleGroup(actionToggleGroup);
        setFinancialAidButton.setToggleGroup(actionToggleGroup);

        ToggleGroup studentType = new ToggleGroup();
        residentButton.setToggleGroup(studentType);
        nonResidentButton.setToggleGroup(studentType);

        ToggleGroup nonResidentType = new ToggleGroup();
        triStateButton.setToggleGroup(nonResidentType);
        internationalButton.setToggleGroup(nonResidentType);

        ToggleGroup triStateToggleGroup = new ToggleGroup();
        newYorkButton.setToggleGroup(triStateToggleGroup);
        connecticutButton.setToggleGroup(triStateToggleGroup);

        ToggleGroup studyAbroadToggleGroup = new ToggleGroup();
        studyAbroadYes.setToggleGroup(studyAbroadToggleGroup);
        studyAbroadNo.setToggleGroup(studyAbroadToggleGroup);

        addStudentButton.setSelected(true);
        onClickAddStudent();

    }

    @FXML
    private void onClickAddStudent(){

        studentTypeHbox.setDisable(false);
        majorCS.setSelected(false);
        majorIT.setSelected(false);
        majorBA.setSelected(false);
        majorEE.setSelected(false);
        majorME.setSelected(false);
        nonResidentHBox.setDisable(true);
        triStatePane.setDisable(true);
        studyAbroadPane.setDisable(true);
        studyAbroadNo.setSelected(false);
        studyAbroadYes.setSelected(false);
        newYorkButton.setSelected(false);
        connecticutButton.setSelected(false);
        internationalButton.setSelected(false);
        residentButton.setSelected(false);
        nonResidentButton.setSelected(false);
        triStateButton.setSelected(false);
        actionInputLabel.setDisable(false);
        actionInput.setDisable(false);
        actionInputLabel.setText("Number of credits:  *");
        actionButton.setText("Add Student");
        actionInput.setPromptText("Enter Number of Credits");

    }

    @FXML
    private void onClickNonResident(){
        nonResidentHBox.setDisable(false);
    }

    @FXML
    private void onClickTriState(){
        triStatePane.setDisable(false);
        studyAbroadPane.setDisable(true);
        studyAbroadNo.setSelected(false);
        studyAbroadYes.setSelected(false);
    }

    @FXML
    private void onClickInternation(){
        studyAbroadPane.setDisable(false);
        triStatePane.setDisable(true);
        newYorkButton.setSelected(false);
        connecticutButton.setSelected(false);
    }

    @FXML
    private void onClickRemoveStudent(){
        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Remove Student");


    }

    @FXML
    private void onClickSetStudyAbroad(){
        nonResidentButton.setSelected(true);
        internationalButton.setSelected(true);
        nonResidentHBox.setDisable(true);
        studentTypeHbox.setDisable(true);
        triStatePane.setDisable(true);
        studyAbroadPane.setDisable(false);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Set Study Abroad Status");
    }

    @FXML
    private void onClickResident(){
        studentTypeHbox.setDisable(false);
        nonResidentHBox.setDisable(true);
        triStatePane.setDisable(true);
        studyAbroadPane.setDisable(true);
        studyAbroadNo.setSelected(false);
        studyAbroadYes.setSelected(false);
        newYorkButton.setSelected(false);
        connecticutButton.setSelected(false);
        internationalButton.setSelected(false);
        nonResidentButton.setSelected(false);
        triStateButton.setSelected(false);
        actionInputLabel.setDisable(false);
        actionInput.setDisable(false);
        actionInputLabel.setText("Number of credits:  *");
    }

    @FXML
    private void onClickFinancialAid(){
        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setText("Enter Financial Aid Amount");
        actionInput.setPromptText("$0.00");
        actionButton.setText("Update Financial Aid");

    }

    @FXML
    private void onClickPayTuition(){
        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setText("Enter Payment");
        actionInput.setPromptText("$0.00");
        actionButton.setText("Pay Bill");
    }

    @FXML
    private void onClickCalculateStudentTuition(){

        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Calculate Tuition");

    }
}