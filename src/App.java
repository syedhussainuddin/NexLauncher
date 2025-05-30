// File: NEXLAUNCHER/src/App.java

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Load the FXML file. This assumes hello-view.fxml is in the same 'src' directory as App.java.
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("hello-view.fxml"));

        // Create a scene from the FXML content with a specified width and height
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        // Set the title of the application window
        stage.setTitle("NextLaunch JavaFX Test!");

        // Set the scene to the stage
        stage.setScene(scene);

        // Display the stage (window)
        stage.show();
    }

    public static void main(String[] args) {
        // This is the standard way to launch a JavaFX application.
        // It calls the start() method.
        launch();
    }
}