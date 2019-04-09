package ProjectMS.StarterScene;
import ProjectMS.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;


public class StarterSceneController {

    @FXML
    private Button startButton;

    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene");
    }
}
