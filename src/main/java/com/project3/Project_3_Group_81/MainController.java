package com.project3.Project_3_Group_81;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import java.util.NoSuchElementException;

/**
 * A controller class that behaves as an interface that links the model and view.
 * @author Samuel Asher Kappala
 * @author Bhavya Patel
 */
public class MainController {

    //variables that are used in the view
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

    /**
     * This method initialized the GUI as soon as it starts running.
     * It sets the toggle groups for the radio buttons.
     * Add button is selected by default.
     */
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
        onClickAddStudent();

    }

    /**
     * This method describes what happens when the "Add Student" button is clicked
     */
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
        actionInput.setText("");
        dateTextField.setText("");
        dateLabel.setDisable(true);
        dateTextField.setDisable(true);
        actionInputLabel.setText("Number of credits:  *");
        actionButton.setText("Add Student");
        actionInput.setPromptText("Enter Number of Credits");


    }

    /**
     * This method describes what happens when the "Non-Resident" button is clicked
     */
    @FXML
    private void onClickNonResident(){
        nonResidentHBox.setDisable(false);
    }

    /**
     * This method describes what happens when the "Tri-State" button is clicked
     */
    @FXML
    private void onClickTriState(){
        triStatePane.setDisable(false);
        studyAbroadPane.setDisable(true);
        studyAbroadNo.setSelected(false);
        studyAbroadYes.setSelected(false);
    }

    /**
     * This method describes what happens when the "International" button is clicked
     */
    @FXML
    private void onClickInternation(){
        studyAbroadPane.setDisable(false);
        triStatePane.setDisable(true);
        newYorkButton.setSelected(false);
        connecticutButton.setSelected(false);
    }

    /**
     * This method describes what happens when the "Remove Student" button is clicked
     */
    @FXML
    private void onClickRemoveStudent(){
        onClickAddStudent();
        actionInput.setText("");
        studentTypeHbox.setDisable(true);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Remove Student");


    }

    /**
     * This method describes what happens when the "Set Study Abroad" button is clicked
     */
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

    /**
     * This method describes what happens when the "Resident" button is clicked
     */
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

    /**
     * This method describes what happens when the "Set Financial Aid" button is clicked
     */
    @FXML
    private void onClickFinancialAid(){
        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInput.setText("");
        actionInputLabel.setText("Enter Financial Aid Amount");
        actionInput.setPromptText("$0.00");
        actionButton.setText("Update Financial Aid");

    }

    /**
     * This method describes what happens when the "Pay Tuition" button is clicked
     */
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

    /**
     * This method describes what happens when the "Calculate Student Tuition" button is clicked
     */
    @FXML
    private void onClickCalculateStudentTuition(){

        onClickAddStudent();
        studentTypeHbox.setDisable(true);
        actionInputLabel.setDisable(true);
        actionInput.setDisable(true);
        actionButton.setText("Calculate Tuition");

    }

    /**
     * This method calls any of the following methods: addStudent(), removeStudent()
     * setStudyAbroad(), setFinancialAid(), payTuition(), calculateStudentTuition()
     * based  on the action selected to perform
     */
    @FXML
    private void onClickActionButton(){

        if(studentName.getText().isBlank()){
            outputString = outputString + "Please enter a valid name.\n";
            output.setText(outputString);
            output.setScrollTop(Double.MAX_VALUE);
            return;
        }
        else if (majorToggleGroup.getSelectedToggle() == null){
            outputString = outputString + "Please select a major.\n";
            output.setText(outputString);
            output.setScrollTop(Double.MAX_VALUE);
            return;

        }

        switch (actionButton.getText()) {
            case "Add Student" -> addStudent();
            case "Remove Student" -> removeStudent();
            case "Set Study Abroad Status" -> setStudyAbroad();
            case "Update Financial Aid" -> setFinancialAid();
            case "Pay Tuition" -> payTuition();
            case "Calculate Tuition" -> calculateStudentTuitionDue();
        }

        output.setScrollTop(Double.MAX_VALUE);
    }

    /**
     * This method takes in the input parameters and passes them to the roster class to add the student
     */
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
                outputString = outputString.concat("Select a student type.\n");
                output.setText(outputString);
            }
            else if (residentButton.isSelected()) {

                Resident newStudent = new Resident(newStudentName, major, credits);

                if (roster.add(newStudent)) {
                    outputString = outputString.concat("Student added.\n");
                }
                else {
                    outputString = outputString.concat("Student is already in the roster.\n");
                }
                output.setText(outputString);

            } else if (nonResidentButton.isSelected()) {

                if(triStateButton.isSelected()){
                    if(triStateToggleGroup.getSelectedToggle() == null){
                        outputString = outputString.concat("Please select a state.\n");
                        output.setText(outputString);
                        return;
                    }
                    RadioButton triStateRadio = (RadioButton) triStateToggleGroup.getSelectedToggle();
                    String triState = triStateRadio.getText();
                    TriState newStudent = new TriState(newStudentName, major, credits, triState);

                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                    }
                    output.setText(outputString);

                }
                else if(internationalButton.isSelected()){
                    if(credits < 12) {
                        outputString = outputString.concat("International students must enroll in at least 12 credits.\n");
                        output.setText(outputString);
                        return;
                    }
                    else if(studyAbroadToggleGroup.getSelectedToggle() == null){
                        outputString = outputString.concat("Select a study Abroad Status.\n");
                        output.setText(outputString);
                        return;
                    }
                    boolean isStudyAbroad = studyAbroadYes.isSelected();

                    International newStudent = new International(newStudentName, major, credits, isStudyAbroad);
                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                    }
                    output.setText(outputString);

                }
                else{
                    NonResident newStudent = new NonResident(newStudentName, major, credits);
                    if (roster.add(newStudent)) {
                        outputString = outputString.concat("Student added.\n");
                    }
                    else {
                        outputString = outputString.concat("Student is already in the roster.\n");
                    }
                    output.setText(outputString);
                }
            }
        } catch (NumberFormatException e){
            outputString = outputString.concat("Invalid Credit Hours.\n");
            output.setText(outputString);
        }
    }

    /**
     * This method takes in the input parameters and passes them to the roster class to remove the student
     */
    private void removeStudent(){

            String removeStudentName = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            Student removeStudent = new Student(removeStudentName, major);

            if(roster.remove(removeStudent)){
                outputString = outputString.concat("Student removed from the roster.\n");
            }
            else{
                outputString = outputString.concat("Student is not in the roster.\n");
            }
            output.setText(outputString);

    }

    /**
     * This method takes in the input parameters and passes them to the roster class to change the study abroad
     * status of the international student
     */
    private void setStudyAbroad(){

            String internationalStudentName = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            boolean studyAbroadStatus = false;
            if(studyAbroadToggleGroup.getSelectedToggle() == null){
                outputString = outputString.concat("Select a study abroad status.\n");
                output.setText(outputString);
                return;
            }
            else if(studyAbroadYes.isSelected()){
                studyAbroadStatus = true;
            }

            switch (roster.setStudyAbroadStatus(internationalStudentName, major, studyAbroadStatus)) {
                case 1 -> {
                    outputString = outputString.concat("Status changed and tuition updated.\n");
                    output.setText(outputString);
                }
                case 0 -> {
                    outputString = outputString.concat("Select a new status.\n");
                    output.setText(outputString);
                }
                case -1 -> {
                    outputString = outputString.concat("Couldn't find the international student.\n");
                    output.setText(outputString);
                }
            }

    }

    /**
     * This method takes in the input parameters and passes them to the roster class to set the financial aid of a
     * student
     */
    private void setFinancialAid(){

        try{

            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);

            if(actionInput.getText().isBlank()){
                outputString = outputString.concat("Enter the financial aid amount.\n");
                output.setText(outputString);
                return;
            }

            double aid = Double.parseDouble(actionInput.getText());

            if(aid <= 0 || aid > 10000) {
                outputString = outputString.concat("Invalid Amount.\n");
                output.setText(outputString);
                return;
            }

            switch (roster.calculateFinancialAid(name, major, aid)) {
                case 2 -> {
                    outputString = outputString.concat("Financial aid awarded. Tuition updated.\n");
                    output.setText(outputString);
                }
                case 1 -> {
                    outputString = outputString.concat("Awarded once already.\n");
                    output.setText(outputString);
                }
                case 0 -> {
                    outputString = outputString.concat("Parttime student doesn't qualify for the award.\n");
                    output.setText(outputString);
                }
                case -1 -> {
                    outputString = outputString.concat("Not a resident student.\n");
                    output.setText(outputString);
                }
                case -2 -> {
                    outputString = outputString.concat("Student not in the roster.\n");
                    output.setText(outputString);
                }
            }


        }catch (NumberFormatException e){
            outputString = outputString.concat("Invalid Amount.\n");
            output.setText(outputString);
        }

    }

    /**
     * This method takes in the input parameters and passes them to the roster class to update the tuition of the student
     */
    private void payTuition(){

        try{
            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);
            if(actionInput.getText().isBlank()){
                outputString = outputString.concat("Enter the payment amount.\n");
                output.setText(outputString);
                return;
            }
            else if(dateTextField.getText().isBlank()){
                outputString = outputString.concat("Enter the payment date.\n");
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

            switch (roster.payTuition(name, major, fees, paymentDate)) {
                case 1 -> {
                    outputString = outputString.concat("Amount is greater than amount due.\n");
                    output.setText(outputString);
                }
                case 0 -> {
                    outputString = outputString.concat("Payment applied.\n");
                    output.setText(outputString);
                }
                case -1 -> {
                    outputString = outputString.concat("Student does not exist in the roster.\n");
                    output.setText(outputString);
                }
            }

        }catch(NumberFormatException e){
            outputString = outputString.concat("Invalid format for Payment amount/date.\n");
            output.setText(outputString);
        }catch(NoSuchElementException e){
            outputString = outputString.concat("Enter a valid date.\n");
            output.setText(outputString);
        }

    }

    /**
     * This method takes in the input parameters and passes them to the roster class to calculate the tuition due of
     * the student
     */
    private void calculateStudentTuitionDue(){

            String name = studentName.getText();
            RadioButton majorRadio = (RadioButton) majorToggleGroup.getSelectedToggle();
            String majorString = majorRadio.getText();
            Major major = getMajor(majorString);

            Student student = new Student(name, major);

            if(roster.calculateStudentTuition(student)){
                outputString = outputString.concat("Tuition calculated.\n");
            }
            else{
                outputString = outputString.concat("Student doesnt exist in the roster.\n");
            }
            output.setText(outputString);

    }


    /**
     * A method that converts a string to a Major Object and returns that object
     * @param majorString
     * @return major
     */
    private Major getMajor(String majorString) {

        return switch (majorString) {
            case "CS" -> Major.CS;
            case "IT" -> Major.IT;
            case "BA" -> Major.BA;
            case "EE" -> Major.EE;
            case "ME" -> Major.ME;
            default -> null;
        };
    }

    /**
     * This method calculates the tuition of all the studnets in the roster
     */
    @FXML
    private void onClickCalculateTuition(){
        roster.calculateTuition();
        printString = printString.concat("Tuition Calculated.\n");
        printOutput.setText(printString);
    }

    /**
     * This method prints the students in the roster
     */
    @FXML
    private void onClickPrint(){
        roster.print();
        printOutput.setText(printString);
    }

    /**
     * This method prints the students who made a payment at least once; the output is ordered by payment date
     */
    @FXML
    private void onClickPrintByPaymentDate(){
        roster.printByPaymentDate();
        printOutput.setText(printString);
    }

    /**
     * This method prints the roster; ordered by student name
     */
    @FXML
    private void onClickPrintByStudentName(){
        roster.printByStudentName();
        printOutput.setText(printString);
    }
}