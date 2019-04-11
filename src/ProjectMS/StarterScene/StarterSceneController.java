package ProjectMS.StarterScene;

import ProjectMS.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class StarterSceneController implements Initializable {

    @FXML
    private MediaPlayer player;
    private Media media;
    private Button startButton;

    @FXML
    public void startButtonPressed(ActionEvent actionEvent) {
        Main.screenController.activate("TimerScene");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        media = new Media(new File("/Users/kei95/Desktop/ProjectMS/src/ProjectMS/forProjectMS.wav").toURI().toASCIIString());
        player = new MediaPlayer(media);
        player.setCycleCount(MediaPlayer.INDEFINITE);
        player.seek(Duration.ZERO);
        player.play();
    }
}