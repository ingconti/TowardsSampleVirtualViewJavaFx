package org.openjfx;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

// some ideas from:
// https://docs.oracle.com/javafx/2/get_started/hello_world.htm



public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private View view = new View();

    @Override
    public void start(Stage primaryStage) {
//        Label label = new Label("My Label");
//        Scene scene = new Scene(label, 200, 100);

        primaryStage.setScene(this.view.getScene());
        primaryStage.show();
    }
}