package ProjectMS;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static ScreenController screenController;
    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("StarterScene/StarterScene.fxml"));

        //StarterScene scene
        Scene scene = new Scene(root);
        screenController = new ScreenController(scene);
        screenController.addScreen("StarterScene", FXMLLoader.load(getClass().getResource("StarterScene/StarterScene.fxml")));
        screenController.addScreen("TimerScene", FXMLLoader.load(getClass().getResource("TimerScene/TimerScene.fxml")));
        screenController.addScreen("ResultScene", FXMLLoader.load(getClass().getResource("ResultScene/ResultScene.fxml")));

        scene.getStylesheets().addAll(this.getClass().getResource("./style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}