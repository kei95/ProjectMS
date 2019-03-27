package ProjectMS.Title;
import ProjectMS.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;

public class Controller {

    @FXML
    private Button startButton;
    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("MainScene");
    }
}
