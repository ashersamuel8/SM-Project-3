package com.project3.Project_3_Group_81;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * A main class that contains the essential methods to run the GUI application
 * @author Samuel Asher Kappala
 * @author Bhavya Patel
 */
public class Main extends Application {

    /**
     * A method that loads the view.fxml file into FXMLLoader, creates a scene using this FXMLLoader,
     * and adds a stage to the scene.
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Roster");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method that launches the GUI application
     */
    public static void main(String[] args) {
        launch();
    }
}