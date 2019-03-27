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

        Parent root = FXMLLoader.load(getClass().getResource("Title/Title.fxml"));

        //Title scene
        Scene scene = new Scene(root);
        screenController = new ScreenController(scene);
        screenController.addScreen("root", FXMLLoader.load(getClass().getResource("Title/Title.fxml")));
        screenController.addScreen("MainScene", FXMLLoader.load(getClass().getResource("MainScene/NewScreen.fxml")));

        scene.getStylesheets().addAll(this.getClass().getResource("./style.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
