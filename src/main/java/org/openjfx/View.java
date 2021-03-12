package org.openjfx;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class View {

    private Label label = new Label("My Label");
    private Scene scene = new Scene(label, 200, 100);

    public View(){
        addClickManagement();
    }

    private void addClickManagement(){

        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                double x = e.getX();
                double y = e.getY();
                System.out.println("clicked");
                //circle.setFill(Color.DARKSLATEBLUE);
            }
        };
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
    Scene getScene(){
        return scene;
    }
}
