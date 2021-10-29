package com.project3.Project_3_Group_81;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {

    @FXML TextField studentName;
    @FXML RadioButton majorCS;
    @FXML RadioButton majorEE;
    @FXML RadioButton majorBA;
    @FXML RadioButton majorIT;
    @FXML RadioButton majorME;
    @FXML RadioButton addStudent;
    @FXML RadioButton removeStudent;
    @FXML RadioButton setStudyAbroad;
    @FXML RadioButton payTuition;
    @FXML RadioButton calculateStudentTuition;
    @FXML RadioButton setFinancialAid;
    @FXML RadioButton resident;
    @FXML RadioButton nonResident;
    @FXML RadioButton triState;
    @FXML RadioButton international;
    @FXML RadioButton newYork;
    @FXML RadioButton connecticut;
    @FXML Label actionInputLabel;
    @FXML TextField actionInput;
    @FXML RadioButton studyAbroadYes;
    @FXML RadioButton studyAbroadNo;
    @FXML Button actionButton;


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
        addStudent.setToggleGroup(actionToggleGroup);
        removeStudent.setToggleGroup(actionToggleGroup);
        setStudyAbroad.setToggleGroup(actionToggleGroup);
        payTuition.setToggleGroup(actionToggleGroup);
        calculateStudentTuition.setToggleGroup(actionToggleGroup);
        setFinancialAid.setToggleGroup(actionToggleGroup);

        ToggleGroup studentType = new ToggleGroup();
        resident.setToggleGroup(studentType);
        nonResident.setToggleGroup(studentType);

        ToggleGroup nonResidentType = new ToggleGroup();
        triState.setToggleGroup(nonResidentType);
        international.setToggleGroup(nonResidentType);

        ToggleGroup triStateToggleGroup = new ToggleGroup();
        newYork.setToggleGroup(triStateToggleGroup);
        connecticut.setToggleGroup(triStateToggleGroup);

        ToggleGroup studyAbroadToggleGroup = new ToggleGroup();
        studyAbroadYes.setToggleGroup(studyAbroadToggleGroup);
        studyAbroadNo.setToggleGroup(studyAbroadToggleGroup);

    }

    @FXML
    private void addStudent(){

    }

    @FXML
    private void removeStudent(){


    }

    @FXML
    private void setStudyAbroad(){


    }

    @FXML
    private void setFinancialAid(){

    }

    @FXML
    private void calculateStudentTuition(){


    }

    @FXML
    private void payTuition(){


    }


}