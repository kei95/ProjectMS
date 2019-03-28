package ProjectMS;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;

import java.util.HashMap;

public class ScreenController {
    private HashMap<String, Pane> screenMap = new HashMap<>();
    private Scene main;

        // Constructor for next day
    public ScreenController(Scene main) {
        this.main = main;
    }

    public void addScreen(String name, Pane pane){
        screenMap.put(name, pane);
    }

    // Method for quiting
//    protected void removeScreen(String name){
//        screenMap.remove(name);
//    }
// this is sa test
//    Method for going to another page
public void activate(String name){
        main.setRoot( screenMap.get(name) );
    }
}