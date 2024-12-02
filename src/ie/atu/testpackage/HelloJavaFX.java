package ie.atu.testpackage;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import java.util.Date;
import java.time.LocalTime;

public class HelloJavaFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        // Create the main content node
        Label welcomeLabel = new Label("Welcome, Kasia!");
        welcomeLabel.setStyle("-fx-font-size: 15px;");
        
        // Create a Date object and convert it to a String
        Date d1 = new Date(); 
        Label dateLabel = new Label(d1.toString());

        LocalTime t1 = LocalTime.now();
        Label timeLabel = new Label(t1.toString()); 
        
        // Create a container to hold our labels
        StackPane root = new StackPane();
        root.getChildren().addAll(welcomeLabel, dateLabel, timeLabel);
        
        // Adjust the position of the labels
        StackPane.setMargin(dateLabel, new Insets(100, 0, 50, 0));
        StackPane.setMargin(timeLabel, new Insets(140, 0, 50, 0));

        // Create and configure the scene
        Scene scene = new Scene(root, 300, 200);
        
        // Configure and show the stage
        primaryStage.setTitle("My App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}