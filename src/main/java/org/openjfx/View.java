package org.openjfx;

import javafx.scene.Scene;
import javafx.scene.control.Label;

public class View {

    private Label label = new Label("My Label");
    private Scene scene = new Scene(label, 200, 100);

    Scene getScene(){
        return scene;
    }
}
