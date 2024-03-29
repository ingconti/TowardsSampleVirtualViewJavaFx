package org.openjfx;


import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import java.util.Observable;
import java.util.Observer;


public class View extends Observable implements Observer {

    private final Label label;
    private Scene scene;

    void displayMessage(String msg){
        /// aggiornare... UI
    }

    public View(Observer obs){
      label = new Label("My Label");
      scene = new Scene(label, 500, 600);
      addClickManagement();
      addObserver(obs);
    }

    private void addClickManagement(){
        EventHandler<MouseEvent> eventHandler = e -> {
            double x = e.getX();
            double y = e.getY();
            System.out.println("clicked");

            setChanged();   // very important!

            CartesianPoint p = new CartesianPoint(x, y);
            notifyObservers(p);
        };
        scene.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
    }


    Scene getScene(){
        return scene;
    }

    @Override
    public void update(Observable o, Object arg) {
        this.label.setText((String)arg);
    }
}
