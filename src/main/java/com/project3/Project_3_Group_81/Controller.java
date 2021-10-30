package com.project3.Project_3_Group_81;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class Controller {

    @FXML private TextField studentName;
    @FXML private RadioButton majorCS;
    @FXML private RadioButton majorEE;
    @FXML private RadioButton majorBA;
    @FXML private RadioButton majorIT;
    @FXML private RadioButton majorME;
    @FXML private RadioButton addStudentButton;
    @FXML private RadioButton removeStudentButton;
    @FXML private RadioButton setStudyAbroadButton;
    @FXML private RadioButton payTuitionButton;
    @FXML private RadioButton calculateStudentTuitionButton;
    @FXML private RadioButton setFinancialAidButton;
    @FXML private RadioButton residentButton;
    @FXML private RadioButton nonResidentButton;
    @FXML private RadioButton triStateButton;
    @FXML private RadioButton internationalButton;
    @FXML private RadioButton newYorkButton;
    @FXML private RadioButton connecticutButton;
    @FXML private Label actionInputLabel;
    @FXML private TextField actionInput;
    @FXML private RadioButton studyAbroadYes;
    @FXML private RadioButton studyAbroadNo;
    @FXML private Button actionButton;
    @FXML private HBox nonResidentHBox;
    @FXML private AnchorPane triStatePane;
    @FXML private AnchorPane studyAbroadPane;
    @FXML private HBox studentTypeHbox;
    @FXML private TextArea output;
    @FXML private Label dateLabel;
    @FXML private TextField dateTextField;
    @FXML private TextArea printOutput;
    private String outputString = "";
    protected static String printString = "";
    private ToggleGroup majorToggleGroup = new ToggleGroup();
    private ToggleGroup actionToggleGroup = new ToggleGroup();
    private ToggleGroup studentType = new ToggleGroup();
    private ToggleGroup nonResidentType = new ToggleGroup();
    private ToggleGroup triStateToggleGroup = new ToggleGroup();
    private ToggleGroup studyAbroadToggleGroup = new ToggleGroup();
    public static Roster roster = new Roster();

    @FXML
    protected void initialize(){

        majorCS.setToggleGroup(majorToggleGroup);
        majorBA.setToggleGroup(majorToggleGroup);
        majorEE.setToggleGroup(majorToggleGroup);
        majorIT.setToggleGroup(majorToggleGroup);
        majorME.setToggleGroup(majorToggleGroup);

        addStudentButton.setToggleGroup(actionToggleGroup);
        removeStudentButton.setToggleGroup(actionToggleGroup);
        setStudyAbroadButton.setToggleGroup(actionToggleGroup);
        payTuitionButton.setToggleGroup(actionToggleGroup);
        calculateStudentTuitionButton.setToggleGroup(actionToggleGroup);
        setFinancialAidButton.setToggleGroup(actionToggleGroup);

        residentButton.setToggleGroup(studentType);
        nonResidentButton.setToggleGroup(studentType);

        triStateButton.setToggleGroup(nonResidentType);
        internationalButton.setToggleGroup(nonResidentType);

        newYorkButton.setToggleGroup(triStateToggleGroup);
        connecticutButton.setToggleGroup(triStateToggleGroup);

        studyAbroadYes.setToggleGroup(studyAbroadToggleGroup);
        studyAbroadNo.setToggleGroup(studyAbroadToggleGroup);

        addStudentButton.setSelected(true);
//        output.setText("");
//        printOutput.setText("");
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
        dateTextField.setText("");
        dateLabel.setDisable(true);
        dateTextField.setDisable(true);
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
        actionInput.setText("");
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
        actionButton.setText("Pay Tuition");
        dateLabel.setDisable(false);
        dateTextField.setDisable(false);
        dateTextField.setPromptText("MM/DD/YYYY");
    }

    @FXML
    private void onClickCalculateStudentTuition(){

        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Calculate Tuition");

    }

    @FXML
    private void onClickActionButton(){

        if(studentName.getText().isBlank()){
            outputString = outputString + "Please enter a valid name\n";
            output.setText(outputString);
        }
        else if (majorToggleGroup.getSelectedToggle() == null){
            outputString = outputString + "Please select a major\n";
            output.setText(outputString);
        }

        switch (actionButton.getText()) {

            case "Add Student":
                addStudent();
                break;
            case "Remove Student":
                removeStudent();
                break;
            case "Set Study Abroad Status":
                setStudyAbroad();
                break;
            case "Set Financial Aid":
                setFinancialAid();
                break;
            case "Pay Tuition":
                payTuition();
                break;
            case "Calculate Tuition":
                calculateStudentTuitionDue();
                break;

        }

    }


    private void addStudent(){

        try {

            int credits = Integer.parseInt(actionInput.getText());
            if (credits < 0) {
                outputString = outputString.concat("Credit hours cannot be negative.\n");
                output.setText(outputString);
                return;
            } else if (credits < 3) {
                outputString = outputString.concat("Minimum credit hours is 3.\n");
                output.setText(outputString);
                return;
            } else if (credits > 24) {
                outputString = outputString.concat("Credit hours exceed the maximum 24.\n");
                output.setText(outputString);
                return;
            }

            String newStudentName = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            if(studentType.getSelectedToggle() == null){
                outputString = outputString.concat("Select a student type\n");
                output.setText(outputString);
                return;
            }
            else if (residentButton.isSelected()) {

                Resident newStudent = new Resident(newStudentName, major, credits);

                if (roster.add(newStudent)) {
                    outputString = outputString.concat("Student added.\n");
                    output.setText(outputString);
                    return;
                }
                else {
                    outputString = outputString.concat("Student is already in the roster.\n");
                    output.setText(outputString);
                    return;
                }

            } else if (nonResidentButton.isSelected()) {

                if(triStateButton.isSelected()){
                    if(triStateToggleGroup.getSelectedToggle() == null){
                        outputString = outputString.concat("Please select a state\n");
                        output.setText(outputString);
                        return;
                    }
                    RadioButton triStateRadio = (RadioButton) triStateToggleGroup.getSelectedToggle();
                    String triState = triStateRadio.getText();
                    TriState newStudent = new TriState(newStudentName, major, credits, triState);

                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                        output.setText(outputString);
                        return;
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                        output.setText(outputString);
                        return;
                    }

                }
                else if(internationalButton.isSelected()){
                    if(credits < 12) {
                        outputString = outputString.concat("International students must enroll at least 12 credits.\n");
                        output.setText(outputString);
                        return;
                    }
                    else if(studyAbroadToggleGroup.getSelectedToggle() == null){
                        outputString = outputString.concat("Select a study Abroad Status\n");
                        output.setText(outputString);
                        return;
                    }
                    Boolean isStudyAbroad = false;
                    if(studyAbroadYes.isSelected()){
                        isStudyAbroad = true;
                    }

                    International newStudent = new International(newStudentName, major, credits, isStudyAbroad);
                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                        output.setText(outputString);
                        return;
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                        output.setText(outputString);
                        return;
                    }

                }
                else{
                    NonResident newStudent = new NonResident(newStudentName, major, credits);
                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                        output.setText(outputString);
                        return;
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                        output.setText(outputString);
                        return;
                    }
                }

            }
        } catch (Exception e){
            System.out.println(e);
        }
    }


    private void removeStudent(){
        try{
            String removeStudentName = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            Student removeStudent = new Student(removeStudentName, major);

            if(roster.remove(removeStudent)){
                outputString = outputString.concat("Student removed from the roster.\n");
                output.setText(outputString);
            }
            else{
                outputString = outputString.concat("Student is not in the roster.\n");
                output.setText(outputString);
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

    private void setStudyAbroad(){

        try{
            String internationalStudentName = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            boolean studyAbroadStatus = false;
            if(studyAbroadToggleGroup.getSelectedToggle() == null){
                outputString = outputString.concat("Select a study abroad status\n");
                output.setText(outputString);
                return;
            }
            else if(studyAbroadYes.isSelected()){
                studyAbroadStatus = true;
            }

            switch(roster.setStudyAbroadStatus(internationalStudentName, major, studyAbroadStatus)) {

                case 1:
                    outputString = outputString.concat("Status changed and tuition updated.\n");
                    output.setText(outputString);
                    break;

                case 0:
                    outputString = outputString.concat("Enter a new status.\n");
                    output.setText(outputString);
                    break;

                case -1:
                    outputString = outputString.concat("Couldn't find the international student.\n");
                    output.setText(outputString);
                    break;
            }


        }catch(Exception e){
            System.out.println(e);
        }

    }

    private void setFinancialAid(){

        try{

            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);

            if(actionInput.getText().isBlank()){
                outputString = outputString.concat("Enter the financial aid amount\n");
                output.setText(outputString);
                return;
            }

            double aid = Double.parseDouble(actionInput.getText());

            if(aid < 0 || aid > 10000) {
                outputString = outputString.concat("Invalid Amount.\n");
                output.setText(outputString);
                return;
            }

            switch(roster.calculateFinancialAid(name, major, aid)) {

                case 2:
                    outputString = outputString.concat("Tuition Updated.\n");
                    output.setText(outputString);
                    break;

                case 1:
                    outputString = outputString.concat("Awarded once already.\n");
                    output.setText(outputString);
                    break;

                case 0:
                    outputString = outputString.concat("Parttime student doesn't qualify for the award.\n");
                    output.setText(outputString);
                    break;

                case -1:
                    outputString = outputString.concat("Not a resident student.\n");
                    output.setText(outputString);
                    break;

                case -2:
                    outputString = outputString.concat("Student not in the roster.\n");
                    output.setText(outputString);
                    break;
            }


        }catch (Exception e){
            System.out.println(e);
        }


    }

    private void payTuition(){

        try{
            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            if(actionInput.getText().isBlank()){
                outputString = outputString.concat("Enter the payment amount\n");
                output.setText(outputString);
                return;
            }
            else if(dateTextField.getText().isBlank()){
                outputString = outputString.concat("Enter the payment date\n");
                output.setText(outputString);
                return;
            }

            double fees = Double.parseDouble(actionInput.getText());
            Date paymentDate = new Date(dateTextField.getText());

            if(!paymentDate.isValid()) {
                outputString = outputString.concat("Payment date invalid.\n");
                output.setText(outputString);
                return;
            }

            switch(roster.payTuition(name, major, fees, paymentDate)) {

                case 1:
                    outputString = outputString.concat("Amount is greater than amount due.\n");
                    output.setText(outputString);
                    break;

                case 0:
                    outputString = outputString.concat("Payment applied.\n");
                    output.setText(outputString);
                    break;

                case -1:
                    outputString = outputString.concat("Student does not exist in the roster.\n");
                    output.setText(outputString);
                    break;
            }

        }catch(Exception e){
            System.out.println(e);
        }


    }


    private void calculateStudentTuitionDue(){
        try{
            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);

            Student student = new Student(name, major);

            if(roster.calculateStudentTuition(student)){
                outputString = outputString.concat("Tuition calculated.\n");
                output.setText(outputString);
            }
            else{
                outputString = outputString.concat("Student doesnt exist in the roster.\n");
                output.setText(outputString);
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }





    /**
     * A method that converts a string to a Major Object
     * @param majorString
     * @return major
     */
    private Major getMajor(String majorString) {

        Major major = null;

        if(majorString.equals("CS")) major = Major.CS;

        else if(majorString.equals("IT")) major = Major.IT;

        else if(majorString.equals("BA")) major = Major.BA;

        else if(majorString.equals("EE")) major = Major.EE;

        else if(majorString.equals("ME")) major = Major.ME;

        return major;

    }

    @FXML
    private void onClickCalculateTuition(){
        roster.calculateTuition();
        printString = printString.concat("Tuition Calculated.\n");
        printOutput.setText(printString);
        return;
    }

    @FXML
    private void onClickPrint(){
        roster.print();
        printOutput.setText(printString);
        return;

    }

    @FXML
    private void onClickPrintByPaymentDate(){
        roster.printByPaymentDate();
        printOutput.setText(printString);
        return;
    }

    @FXML
    private void onClickPrintByStudentName(){
        roster.printByStudentName();
        printOutput.setText(printString);
        return;
    }
}