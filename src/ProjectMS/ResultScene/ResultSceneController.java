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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;

public class ResultSceneController implements Initializable {
    public static Timeline timer;
    private int second = 0;

    private MediaPlayer player;

    private Media media;

    private MediaPlayer rainPlayer;

    private Media mediaRain;

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

    private boolean isSoundWorking = false;

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
        if(second == 0 && TimeDisplay != null){
            TimeDisplay.setText(String.format("%02d:%02d:%02d", second / 3600, (second % 3600) / 60, second % 60));
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd \n");
            DateDisplay.setText(LocalDateTime.now().format(formatter));
        }

        //Rain
        mediaRain = new Media(new File("/Users/kei95/Desktop/ProjectMS/src/ProjectMS/344430__babuababua__light-rain.wav").toURI().toASCIIString());
        rainPlayer = new MediaPlayer(mediaRain);
        rainPlayer.play();


        //Music
        media = new Media(new File("/Users/kei95/Desktop/ProjectMS/src/ProjectMS/forProjectMS.wav").toURI().toASCIIString());
        player = new MediaPlayer(media);
        player.setCycleCount(MediaPlayer.INDEFINITE);

    }

    @FXML
    public void toggleButtonpressed (ActionEvent actionEvent){

        if (isSoundWorking) {
            isSoundWorking = false;
            player.stop();
        } else {
            isSoundWorking = true;
            player.play();
            player.seek(Duration.ZERO);
        }
    }

    @FXML
    public void StartButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene");
    }

    @FXML
    public void stopButtonPressed(ActionEvent actionEvent) {
        timer.stop();
        isTimerWorking = false;
    }

    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        if(!isSoundWorking){
            isSoundWorking = true;
            player.seek(Duration.ZERO);
            player.play();
        }
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
