package org.openjfx;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.util.Observable;
import java.util.Observer;


public class View extends Observable {

    private Label label = new Label("My Label");
    private Scene scene = new Scene(label, 200, 100);

    public View(Observer obs){
        addClickManagement();
        this.addObserver(obs);
    }

    private void addClickManagement(){

        //Creating the mouse event handler
        EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent e) {
                double x = e.getX();
                double y = e.getY();
                CartesianPoint p = new CartesianPoint(x,y);
                System.out.println("clicked");

                setChanged();   // very important!
                notifyObservers(p);

            }
        };
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }
    Scene getScene(){
        return scene;
    }
}
