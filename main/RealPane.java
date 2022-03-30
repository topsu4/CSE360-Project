import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.stage.Modality;
import javafx.scene.Scene;
import javafx.scene.layout.*;

public class RealPane extends BorderPane { // border pane has a top, left, center, right, and bottom
    private Button logInButton;
    private Button finalLogIn;

    private VBox RegisterPane;
    private HBox optionPane;

    private Stage loginWindow;

    public RealPane() {
        logInButton = new Button();
        logInButton.setText("Register");
        logInButton.setOnAction(new LogInHandler());

        optionPane = new HBox();

        this.setTop(logInButton);
        this.setLeft(optionPane);
    }

    private class LogInHandler implements EventHandler<ActionEvent> {

        public void handle(ActionEvent event) {
            loginWindow = new Stage();
            loginWindow.initModality(Modality.WINDOW_MODAL);

            Button finalLogIn = new Button("REGISTER");
            finalLogIn.setOnAction(new ExitHandler());

            RegisterPane = new VBox();
            RegisterPane.getChildren().addAll(finalLogIn);

            Scene registerDialog = new Scene(RegisterPane, 200, 100);
            loginWindow.setScene(registerDialog);
            loginWindow.show();
        }

    }

    private class ExitHandler implements EventHandler<ActionEvent> {
        public void handle(ActionEvent event) {
            loginWindow.close();
        }

    }
}
