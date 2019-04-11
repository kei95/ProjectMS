package ProjectMS.ResultScene;

import ProjectMS.Main;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ResultSceneController implements Initializable {
    public static Timeline timer;
    private int second = 0;

    @FXML
    public Button StopButton;

    @FXML
    public Button StartButton;

    @FXML
    private Button MoveButton;

    @FXML
    private Label TimeDisplay;

    @FXML
    private Label DateDisplay;

    private boolean isTimerWorking = false;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Clock
        timer = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            second++;
            if (TimeDisplay != null) {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd \n");
                DateDisplay.setText(LocalDateTime.now().format(formatter));
                TimeDisplay.setText(String.format("%02d:%02d:%02d", second / 3600, (second % 3600) / 60, second % 60));
            }
        }), new KeyFrame(Duration.seconds(1)));
        timer.setCycleCount(Animation.INDEFINITE);
        if(second == 0){
            TimeDisplay.setText(String.format("%02d:%02d:%02d", second / 3600, (second % 3600) / 60, second % 60));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd \n");
            DateDisplay.setText(LocalDateTime.now().format(formatter));
        }
//        timer.play();
    }

    @FXML
    public void stopButtonPressed(ActionEvent actionEvent) {
        timer.stop();
        isTimerWorking = false;
    }

    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        if(!isTimerWorking){
            timer.play();
            isTimerWorking = true;
        }
    }

    @FXML
    public void moveButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene");
    }




}
