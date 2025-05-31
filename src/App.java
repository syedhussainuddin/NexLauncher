import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a button with text "Hello"
        Button button = new Button("Hello");

        // Set an action when the button is clicked
        button.setOnAction(e -> {
            System.out.println("Hello button clicked!");
        });

        // Add button to layout
        StackPane root = new StackPane(button);

        // Create the scene
        Scene scene = new Scene(root, 300, 200);

        // Set the scene and show the stage
        primaryStage.setTitle("JavaFX Hello Button");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
