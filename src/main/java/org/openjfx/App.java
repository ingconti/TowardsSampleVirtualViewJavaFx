package org.openjfx;

import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

// some ideas from:
// https://docs.oracle.com/javafx/2/get_started/hello_world.htm



public class App extends Application implements Observer {

    public static void main(String[] args) {
        launch(args);
    }

    private View view = new View(this);
    private GameModel model = new GameModel();

    public void update(Observable obj, Object arg) {
        CartesianPoint p = (CartesianPoint)arg;
        System.out.println("got click:");
        System.out.println(p.x);
        System.out.println(p.y);

        // call model:
        model.clicked(p);
        //...
    }
    @Override
    public void start(Stage primaryStage) {
//        Label label = new Label("My Label");
//        Scene scene = new Scene(label, 200, 100);

        primaryStage.setScene(this.view.getScene());
        primaryStage.show();
    }


}