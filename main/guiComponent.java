import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;

public class guiComponent extends Application {

    public void start(Stage primaryStage) {
        RealPane gui = new RealPane();

        StackPane rootPane = new StackPane();
        rootPane.getChildren().add(gui);

        Scene scene = new Scene(rootPane, 800, 500); // window set up 800 x 500
        primaryStage.setTitle("CSBURGER");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
            Application.launch(args); // launch window
        }

}

