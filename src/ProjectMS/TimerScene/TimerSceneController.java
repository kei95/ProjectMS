package ProjectMS.TimerScene;

import ProjectMS.Main;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class TimerSceneController implements Initializable {

    @FXML
    private Label dateTime;

    @FXML Label Time;

    private Timeline clock;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        //Clock
        clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            if (dateTime != null) {
                DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd \n");
                DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                dateTime.setText(LocalDateTime.now().format(dayFormatter));
                Time.setText(LocalDateTime.now().format(timeFormatter));
            }
        }), new KeyFrame(Duration.seconds(1)));

        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("ResultScene");
    }
    @FXML
    public void startButtonPressed1(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene1");
    }
    @FXML
    public void startButtonPressed2(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene2");
    }
    @FXML
    public void startButtonPressed3(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene3");
    }
    @FXML
    public void startButtonPressed4(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene4");
    }
    @FXML
    public void startButtonPressed5(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene5");
    }
    @FXML
    public void startButtonPressed6(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene6");
    }
    @FXML
    public void startButtonPressed7(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene");
    }

}